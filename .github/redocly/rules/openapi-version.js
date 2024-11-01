module.exports = checkOpenapiVersion;

function checkOpenapiVersion(options) {
  return {
    Root: {
      enter(operation, { report, location }) {
        if (! options.versions.includes(operation.openapi)) {
          report({
            message: `OpenAPI version ${options.versions.join(' or ')} must be used.`,
            location: location.child(['openapi']).key(),
          });
        }
      },
    }
  };
}