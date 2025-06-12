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
          if(op.$ref === undefined && op.in === 'header') {
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