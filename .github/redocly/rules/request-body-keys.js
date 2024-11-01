module.exports = checkRequestBody;

// TODO
function checkRequestBody(options){
  return {
    Paths: {
      enter(operation, { report, location, type }) {
        const paths = Object.keys(operation)
        for (const path of paths) {
          const methodsObjectKeys = Object.keys(operation[path])
          for(const methodsObjectKey of methodsObjectKeys) {
            const methodsObject = operation[path][methodsObjectKey]
            if("requestBody" in methodsObject) {
              console.log(methodsObject['requestBody']['content'])
            }
          }
        }
      }
    }
  }
}