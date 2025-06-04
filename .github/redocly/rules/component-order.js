module.exports = componentsOrder;

utils = require('../utils/utils')

function componentsOrder(options) {
  return {
    Components: {
      enter(operation, { report, location, type }) {
        let sftiComponentsRef = ['schemas', 'responses', 'parameters', 'headers', 'securitySchemes']
        if (options.order) {
          sftiComponentsRef = options.order;
        }

        const keys = Object.keys(operation)
        filteredKeys = keys.filter(item => sftiComponentsRef.includes(item))
        filteredRefs = sftiComponentsRef.filter(item => keys.includes(item))

        for (const key of filteredKeys) {
          if (filteredKeys.indexOf(key) !== filteredRefs.indexOf(key)) {
            filteredKeys = filteredKeys.filter(item => item !== key)
            filteredRefs = filteredRefs.filter(item => item !== key)
            report({
              message: `The \`${key}\` key is misplaced inside the \`components\` object. Please move \`${key}\` to its defined location (see GitHub Wiki).`,
              location: location.child([key]).key(),
              suggest: [ `Include \`${key}\` object below \`${utils.get_common_prev_elem(sftiComponentsRef,sftiComponentsRef,key)}\` object` ],
            });
          }
        }
      },
    }
  };
}