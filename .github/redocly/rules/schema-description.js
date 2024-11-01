module.exports = schemaDescription;

function schemaDescription() {
  return { 
    NamedSchemas: {
      enter(operation, { report, location, type }) {
        const schemaNames = Object.keys(operation)
        for (const NamedSchema of schemaNames) {
          parameterObject = operation[NamedSchema]
          if (parameterObject.description === undefined) {
            report({
              message: `${NamedSchema} object description must be present.`,
              location: location.child([NamedSchema]).key(),
            });
          }
    
          else if (!parameterObject.description) {
            report({
              message: `Parameter object description must be non-empty string.`,
              location: location.child([NamedSchema, 'description']),
            }); 
          } 
    
          else if(!(parameterObject.description.endsWith(".") || /\n/.test(parameterObject.description))) {
            report({
              message: `Description must end with a full stop (except multiline listings).`,
              location: location.child([NamedSchema, 'description']),
            });
          }

          const properties = parameterObject.properties || []
          const propertiesNames = Object.keys(properties)
          for (const propertiesName of propertiesNames) {
            propertiesObject = properties[propertiesName]

            if (propertiesObject.$ref === undefined) {
              if (propertiesObject.description === undefined) {
                report({
                  message: `${propertiesName} object description must be present.`,
                  location: location.child([NamedSchema, 'properties', propertiesName]).key(),
                });
              }
        
              else if (!propertiesObject.description) {
                report({
                  message: `Parameter object description must be non-empty string.`,
                  location: location.child([NamedSchema, 'properties', propertiesName, 'description']),
                }); 
              } 
        
              else if(!(propertiesObject.description.endsWith(".") || /\n/.test(propertiesObject.description))) {
                report({
                  message: `Description must end with a full stop (except multiline listings).`,
                  location: location.child([NamedSchema, 'properties', propertiesName, 'description']),
                });
              }
            }
          }
        }
      }
    } 
  }
}

