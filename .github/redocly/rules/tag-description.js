module.exports = tagDescription;

const utils = require('../utils/utils')

function tagDescription() {
  return { Tag : utils.checkDescription() }
}