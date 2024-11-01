module.exports = checkSchemaName;

utils = require('../utils/utils')

function checkSchemaName(options){
  return {
    NamedSchemas: {
      enter(operation, { report, location, type }) {
        const schemaNames = Object.keys(operation)
        for (const schemaName of schemaNames) {
          if(!utils.checkCasing(schemaName, 'PascalCase')) {
            report({
              message: `\`${schemaName}\` must use PascalCase.`,
              location: location.child([schemaName]).key(),
            });
          }
        }
      }
    }
  }
}