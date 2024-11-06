module.exports = checkParameterOrder;

function checkParameterOrder(options) {
  return {
    NamedParameters: {
      enter(operation, { report, location, type }) {
        const order = ["path", "query", "header", "cookie"];
        let lastTypeIndex = -1;
        
        const parameterNames = Object.keys(operation)
        for (const parameterName of parameterNames) {
          const param = operation[parameterName];
          const paramType = param.in;
          const paramIndex = order.indexOf(paramType);
          
          if (paramIndex === -1) {
            report({
              message: `Invalid parameter type \`${paramType}\` for parameter \`${parameterName}\`.`,
              location: location.child([parameterName, 'in']),
            });
          }
          
          else if (paramIndex < lastTypeIndex) {
            report({
              message: `Parameter \`${parameterName}\` is not in order (${order.join(', ')}).`,
              location: location.child([parameterName]).key(),
            });
          }
          lastTypeIndex = paramIndex;
        }
      }
    }
  }
}