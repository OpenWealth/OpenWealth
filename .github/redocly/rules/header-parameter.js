module.exports = checkHeaderParameter;

const utils = require('../utils/utils')

function checkHeaderParameter(options) {
  return {
    NamedParameters: {
      enter(operation, { report, location, type }) {
        const parameterNames = Object.keys(operation)
        for (const parameterName of parameterNames) {
          parameterObject = operation[parameterName]
          if(parameterObject.in === 'header') {
            if(!utils.checkCasing(parameterObject.name, 'Train-Case')) {
              report({
                message: `\`${parameterObject.name}\` does not use Train-Case. Custom headers start with \`X-\`.`,
                location: location.child([parameterName, 'name']),
              });
            }

            if(!parameterName.endsWith('_in_header')) {
              report({
                message: `Header parameter \`${parameterName}\` must end with \`_in_header\`.`,
                location: location.child([parameterName]).key(),
                suggest: [parameterName+'_in_header'],
              });
            }

            if((parameterObject.required === undefined || parameterObject.required === false) && !parameterName.startsWith('optional_')) {
              report({
                message: `Optional header parameter \`${parameterName}\` must start with \`optional_\`.`,
                location: location.child([parameterName]).key(),
                suggest: ['optional_'+parameterName],
              });
            }
            
            if(!utils.checkCasing(parameterName, 'snake_case')) {
              report({
                message: `\`${parameterName}\` must use snake_case.`,
                location: location.child([parameterName]).key(),
              });
            }
          }
        }
      }
    },
    ParameterList: {
      enter(operation, { report, location, type }) {
        for (const op of operation) {
          if(op.$ref === undefined && op.in === 'header') { // references are handeld within NamedParameters
            if(!utils.checkCasing(op.name, 'Train-Case')) {
              report({
                message: `\`${op.name}\` must use Train-Case.`,
                location: location.child([operation.indexOf(op), 'name']),
              });
            }
          }
        }
      }
    }
  }
}