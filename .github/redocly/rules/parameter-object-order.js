module.exports = checkParameterOrder;


function checkArrays(parameter, ref) {
    ref = ref.filter(el => parameter.includes(el))
    for(let i = 0; i < ref.length; i++) {
      if(parameter[i] !== ref[i]) {
        return parameter[i];
      }
    }
    return ''
}

function checkParameterOrder(options) {
  return {
    NamedParameters: {
      enter(operation, { report, location, type }) {
        for(const parameterName in operation) {
          const order = ["in", "name", "required", "schema", "description"];
          paramKeys = Object.keys(operation[parameterName])
          elem = checkArrays(paramKeys, order)
          if(elem !== '') {
            report({
              message: `\`${elem}\` key of \`${parameterName}\` is not in order (${order.join(', ')}).`,
              location: location.child([parameterName, elem]).key(),
            });
          }
        }
      }
    },
    ParameterList: {
      enter(operation, { report, location, type }) {
        for(const parameterName of operation){
          const order = ["in", "name", "required", "schema", "description"];
          paramKeys = Object.keys(parameterName)
          if(! paramKeys.includes('$ref')){ // refs are covered using NamedParameters
            elem = checkArrays(paramKeys, order)
            if(elem !== '') {
              report({
                message: `\`${elem}\` key is not in order (${order.join(', ')}).`,
                location: location.child([operation.indexOf(parameterName), elem]).key(),
              });
            }
          }
        }
      }
    }
  }
}