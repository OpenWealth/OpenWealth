module.exports = checkExternalDocs;


function checkExternalDocs(options) {
  return {
    ExternalDocs: {
      enter(operation, { report, location }) {
        if (operation.description === undefined) {
          report({
            message: `External Docs descriptions must be defined.`,
            location: { reportOnKey: true },
          });
        }
        if (operation.url === undefined) {
          report({
            message: `External Docs url must be defined.`,
            location: { reportOnKey: true },
          });
        }
      },
    }
  };
}

// not enforced right now
function checkExternalDocsSFTI(options) {
  return {
    ExternalDocs: {
      enter(operation, { report, location }) {
        if (operation.description !== 'Find out more about SFTI API specifications.') {
          report({
            message: `Use offical SFTI reference string.`,
            location: location.child(['description']),
            suggest: [ 'Find out more about SFTI API specifications.' ],
          });
        }
        if (operation.url !== 'https://www.common-api.ch') {
          report({
            message: `Use offical Common API url.`,
            location: location.child(['url']),
            suggest: [ 'https://www.common-api.ch' ],
          });
        }
      },
    }
  };
}