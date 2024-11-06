const checkRequestBody = require('./rules/request-body-keys');
const checkSchemaName = require('./rules/data-types');

module.exports = {
  id: 'iso',
  rules: {
    oas3: {
      // 'request-body-keys': checkRequestBody,
      'data-types': checkSchemaName,
    }
  }
};
