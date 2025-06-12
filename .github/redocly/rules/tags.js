module.exports = checkTags;

const utils = require('../utils/utils')

function checkTags(options) {
  return {
    Tag: {
      enter(operation, { report, location, type }) {
        if(!utils.checkCasing(operation.name, 'kebab-case')) {
            report({
            message: `\`${operation.name}\` does not use kebab-case.`,
            location: location.child(['name']),
            });}
      }
    }
  }
}