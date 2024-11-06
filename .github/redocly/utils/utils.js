module.exports = { checkCasing, checkDescription, get_common_prev_elem }

function checkCasing(str, caseName) {
  const casingRegexes = {
    camelCase: /^[a-z][a-zA-Z0-9]+$/g,
    'kebab-case': /^([a-z][a-z0-9]*)(-[a-z0-9]+)*$/g,
    snake_case: /^([a-z][a-z0-9]*)(_[a-z0-9]+)*$/g,
    PascalCase: /^[A-Z][a-zA-Z0-9]+$/g,
    MACRO_CASE: /^([A-Z][A-Z0-9]*)(_[A-Z0-9]+)*$/g,
    'COBOL-CASE': /^([A-Z][A-Z0-9]*)(-[A-Z0-9]+)*$/g,
    flatcase: /^[a-z][a-z0-9]+$/g,
    'Train-Case' : /^([A-Z][a-zA-Z0-9]*)(-[A-Z][a-zA-Z0-9]*)*$/g,
  };

  return casingRegexes[caseName].test(str)
}

function checkDescription(options) {
  return {
    enter(operation, { report, location, type }) {
      if (operation.description === undefined) {
        report({
          message: `${type.name} object description must be present.`,
          location: { reportOnKey: true },
        });
      }

      else if (!operation.description) {
        report({
          message: `Parameter object description must be non-empty string.`,
          location: location.child(['description']),
        });
      } 

      else if(!(operation.description.endsWith(".") || /\n/.test(operation.description))) {
        report({
          message: `Description must end with a full stop (Exception multiline listings).`,
          location: location.child(['description']).key(),
        });
      }
    }
  };
}

function get_common_prev_elem(defined, spec, key) {
  for (let i = defined.indexOf(key) - 1; i >= 0; i--) {
    if (spec.includes(defined[i])) {
        return defined[i];
    }
  }
  return spec[0];
}