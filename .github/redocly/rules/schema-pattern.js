module.exports = schemaPattern;

function schemaPattern() {
  return { 
    NamedSchemas: {
      enter(operation, { report, location, type }) {
        const schemaNames = Object.keys(operation)
        for (const NamedSchema of schemaNames) {
          const parameterObject = operation[NamedSchema]
          if (parameterObject.pattern && !parameterObject.pattern.match(/^\^.*\$$/)) {
            report({
              message: `Use start and end regex tokens to enforce exact match.`,
              location: location.child([NamedSchema, 'pattern']),
              suggest: ["^" + parameterObject.pattern + "$"],
            });
          }

          if (parameterObject.properties) {
            for (const prop in parameterObject.properties) {
              const propertyObject = parameterObject.properties[prop]
              if (propertyObject.pattern && !propertyObject.pattern.match(/^\^.*\$$/)) {
                report({
                  message: `Use start and end regex tokens to enforce exact match.`,
                  location: location.child([NamedSchema, 'properties', prop, 'pattern']),
                  suggest: ["^" + propertyObject.pattern + "$"],
                });
              }
            }
          }
        }
      }
    } 
  }
}

