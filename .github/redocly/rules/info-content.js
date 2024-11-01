module.exports = infoStructure;

function infoStructure(options) {
  return {
    Info: {
      enter(operation, { report, location }) {
        // info.version
        if (!/\d+\.\d+\.\d+/.test(operation.version)) {
          report({
            message: `SFTI version must be specified in semantic versioning format (M.m.b).`,
            location: location.child(['version']).key(),
          });
        }
        // info.license
        if (operation.license.name !== 'Apache 2.0') {
          report({
            message: `Use Apache 2.0 license.`,
            location: location.child(['license', 'name']),
            suggest: [ 'Apache 2.0' ],
          });
        }
        if (operation.license.url !== 'https://www.apache.org/licenses/LICENSE-2.0.html') {
          report({
            message: `Use offical Apache 2.0 license refrence.`,
            location: location.child(['license', 'url']),
            suggest: [ 'https://www.apache.org/licenses/LICENSE-2.0.html' ],
          });
        }
      },
    }
  };
}