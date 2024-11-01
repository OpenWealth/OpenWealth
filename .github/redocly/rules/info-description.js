module.exports = infoDescription;

const utils = require('../utils/utils')

function infoDescription() {
  return { Info : utils.checkDescription() }
}