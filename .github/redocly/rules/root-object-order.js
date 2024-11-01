module.exports = checkObjectOrder;

utils = require('../utils/utils')

function checkObjectOrder(options) {
  return {
    Root: {
      enter(operation, { report, location, type }) {
        const sftiOpenapiSpecRef = ['openapi', 'info', 'servers', 'security', 'tags', 'externalDocs', 'paths', 'components']
        const keys = Object.keys(operation)
        const missingKeys = sftiOpenapiSpecRef.filter(key => !keys.includes(key))
        // report missing elements
        for (const key of missingKeys) {
          report({
            message: `The \`${key}\` key is missing in SFTI specification. Plase add \`${key}\` in the defined order (see GitHub Wiki).`,
            location: location.child([utils.get_common_prev_elem(sftiOpenapiSpecRef, keys, key)]).key(),
            suggest: [`Include \`${key}\` object below \`${utils.get_common_prev_elem(sftiOpenapiSpecRef, keys, key)}\` object`],
          });
        }

        filteredKeys = keys.filter(item => sftiOpenapiSpecRef.includes(item))
        filteredRefs = sftiOpenapiSpecRef.filter(item => keys.includes(item))

        for (const key of filteredKeys) {
          if (filteredKeys.indexOf(key) !== filteredRefs.indexOf(key)) {
            filteredKeys = filteredKeys.filter(item => item !== key)
            filteredRefs = filteredRefs.filter(item => item !== key)
            report({
              message: `The \`${key}\` key is misplaced in SFTI specification. Plase move \`${key}\` to its defined location (see GitHub Wiki).`,
              location: location.child([key]).key(),
              suggest: [`Include \`${key}\` object below \`${sftiOpenapiSpecRef[sftiOpenapiSpecRef.indexOf(key) - 1]}\` object`],
            });
          }
        }
      },
    }
  };
}