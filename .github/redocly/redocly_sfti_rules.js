const checkSchemaName = require('./rules/data-types');

const checkObjectOrder = require('./rules/root-object-order');
const checkOpenapiVersion = require('./rules/openapi-version');
const infoStructure = require('./rules/info-content');
const checkExternalDocs = require('./rules/external-docs');
const componentsOrder = require('./rules/component-order');

const infoDescription = require('./rules/info-description');
const tagDescription = require('./rules/tag-description');
const parameterDescription = require('./rules/parameter-description');
const schemaDescription = require('./rules/schema-description');
const schemaPattern = require('./rules/schema-pattern');

const checkPathParameter = require('./rules/path-parameter');
const checkHeaderParameter = require('./rules/header-parameter');
const checkQueryParameter = require('./rules/query-parameter');
const checkTags = require('./rules/tags');

module.exports = {
  id: 'sfti',
  rules: {
    oas3: {
      'data-types': checkSchemaName,

      'root-object-order': checkObjectOrder,
      'openapi-version': checkOpenapiVersion,
      'info-content': infoStructure,
      'external-docs': checkExternalDocs,
      'component-order': componentsOrder,

      'info-description': infoDescription,
      'tag-description': tagDescription,
      'parameter-description': parameterDescription,
      'schema-description': schemaDescription,
      'schema-pattern': schemaPattern,

      'path-parameter': checkPathParameter,
      'header-parameter': checkHeaderParameter,
      'query-parameter': checkQueryParameter,
      'tag': checkTags,
    }
  }
};
