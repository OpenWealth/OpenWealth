module.exports = checkPathParameter;

const utils = require('../utils/utils')

function checkPathParameter(options) {
  return {
    NamedParameters: {
      enter(operation, { report, location, type }) {
        const parameterNames = Object.keys(operation)
        for (const parameterName of parameterNames) {
          parameterObject = operation[parameterName]
          if(parameterObject.in === 'path') {
            if(!utils.checkCasing(parameterObject.name, 'camelCase')) {
              report({
                message: `\`${parameterObject.name}\` does not use camelCase.`,
                location: location.child([parameterName, 'name']),
              });
            }

            if(!parameterObject.name.endsWith('Id')) {
              report({
                message: `Path parameter \`${parameterName}\` must be an identifier.`,
                location: location.child([parameterName, 'name']),
                suggest: [parameterObject.name+'Id'],
              });
            }
            
            if(parameterName !== 'path_'+parameterObject.name) {
              report({
                message: `Path parameter \`${parameterName}\` must start with \`path_\` followed by the paramter name.`,
                location: location.child([parameterName]).key(),
                suggest: ['path_'+parameterObject.name],
              });
            }

            if(parameterObject.required !== true) {
              report({
                message: `Path parameters are required. \`${parameterName}\` must define required: true.`,
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
          if(op.$ref === undefined && op.in === 'path') { // references are handeld within NamedParameters
            if(!utils.checkCasing(op.name, 'camelCase')) {
              report({
                message: `\`${op.name}\` must use camelCase.`,
                location: location.child([operation.indexOf(op), 'name']),
              });
            }
            if(!op.name.endsWith('Id')) {
              report({
                message: `Path parameter \`${op.name}\` must be an identifier.`,
                location: location.child([operation.indexOf(op), 'name']),
                suggest: [op.name+'Id'],
              });
            }
          }
        }
      }
    }
  }
}