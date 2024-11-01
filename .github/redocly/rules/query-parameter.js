module.exports = checkQueryParameter;

const utils = require('../utils/utils')

function checkQueryParameter(options) {
  return {
    NamedParameters: {
      enter(operation, { report, location, type }) {
        const parameterNames = Object.keys(operation)
        for (const parameterName of parameterNames) {
          parameterObject = operation[parameterName]
          if(parameterObject.in === 'query') {
            if(!utils.checkCasing(parameterObject.name, 'snake_case')) {
              report({
                message: `\`${parameterObject.name}\` must use snake_case.`,
                location: location.child([parameterName, 'name']),
              });
            }

            if(parameterName.includes('query')) {
              report({
                message: `Query parameter \`${parameterName}\` must not include \`query\` prefix.`,
                location: location.child([parameterName]).key(),
                suggest: [parameterObject.name],
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
          if(op.$ref === undefined && op.in === 'query') { // references are handeld within NamedParameters
            if(!utils.checkCasing(op.name, 'snake_case')) {
              report({
                message: `\`${op.name}\` must use snake_case.`,
                location: location.child([operation.indexOf(op), 'name']),
              });
            }
          }
        }
      }
    }
  }
}
