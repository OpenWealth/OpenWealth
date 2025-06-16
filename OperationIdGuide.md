# REST API OperationId Naming Best Practices

A comprehensive guide for naming `operationId` in RESTful API design to ensure consistency, clarity, and developer-friendly implementations.

## Table of Contents

- [Core Principles](#core-principles)
- [Verb-Noun Pattern](#verb-noun-pattern)
- [HTTP Method Conventions](#http-method-conventions)
- [Naming Conventions](#naming-conventions)
- [Nested Resources](#nested-resources)
- [Complex Operations](#complex-operations)
- [Alternative Strategies](#alternative-strategies)
- [Examples by Resource Type](#examples-by-resource-type)
- [Common Pitfalls](#common-pitfalls)

## Core Principles

### 1. Use Verb-Noun Patterns
Structure your operationIds with a clear verb followed by the resource noun:

| Operation Description | ✅ **Good** | ❌ **Avoid** |
|-------------|-------------------|----------|
| Get all users | `getUsers` | `users` |
| Create a new order | `createOrder` | `addOrder` |
| Update an order | `updateOrder` | `modifyOrder` |
| Delete an existing customer  | `deleteCustomer` | `removeCustomer` |
| Add a product to an order | `addOrderProduct` | `createOrderProduct` |


### 2. Be Descriptive and Specific
Make operationIds self-documenting:

| Operation Description | ✅ **Good** | ❌ **Avoid** |
|-------------|-------------------|----------|
| Get all active products | `listActiveProducts` | `getProducts` |
| Open a new user account | `createUserAccount` | `createUser` |


### 3. Maintain Consistency
Choose a pattern and stick to it throughout your entire API.

## HTTP Method Conventions

Use standard HTTP method verbs consistently:

| HTTP Method | Recommended Verbs | Examples |
|-------------|-------------------|----------|
| **GET** | `get`, `list`, `find` | `getUser`, `listProducts`, `findOrders` |
| **POST** | `create`, `add` | `createUser`, `addProduct` |
| **PUT** | `update`, `replace` | `updateUser`, `replaceProduct` |
| **PATCH** | `modify`, `update` | `modifyUser`, `updateProductPrice` |
| **DELETE** | `delete`, `remove` | `deleteUser`, `removeProduct` |

## Naming Conventions

### CamelCase Format
Use camelCase for consistency with most programming languages:

| Operation Description | ✅ **Good** | ❌ **Avoid** |
|-------------|-------------------|----------|
| Get user by tin | `getUserByTin` | `get_user_by_tin`, `GetUserByTin` |
| Create an order item | `createOrderItem` | `create-order-item` |
| Update product status| `createOrderItem` | `update-product-status` |

### Plural vs Singular
Use consistent rules for collections vs individual resources:

```
GET /users           → listUsers        (collection)
GET /users/{id}      → getUser          (single resource)
POST /users          → createUser       (single resource)
PUT /users/{id}      → updateUser       (single resource)
DELETE /users/{id}   → deleteUser       (single resource)
```

## Nested Resources

### Basic Nested Resources

For endpoints with nested resources, reflect the hierarchy in the operationId:

```
GET /orders/{orderId}/executions
→ getOrderExecutions or listOrderExecutions

GET /orders/{orderId}/executions/{executionId}
→ getOrderExecution or getOrderExecutionById
```

### More Complex Examples

**Users and their resources:**
```
GET /users/{userId}/orders                    → getUserOrders
GET /users/{userId}/orders/{orderId}          → getUserOrder
POST /users/{userId}/orders                   → createUserOrder
PUT /users/{userId}/orders/{orderId}          → updateUserOrder
DELETE /users/{userId}/orders/{orderId}       → deleteUserOrder
```

**Products and categories:**
```
GET /categories/{categoryId}/products         → getCategoryProducts
GET /categories/{categoryId}/products/{productId} → getCategoryProduct
POST /categories/{categoryId}/products        → createCategoryProduct
```

**Organizations with nested teams and members:**
```
GET /organizations/{orgId}/teams                        → getOrganizationTeams
GET /organizations/{orgId}/teams/{teamId}              → getOrganizationTeam
GET /organizations/{orgId}/teams/{teamId}/members      → getTeamMembers
GET /organizations/{orgId}/teams/{teamId}/members/{memberId} → getTeamMember
POST /organizations/{orgId}/teams/{teamId}/members     → addTeamMember
```

### Multi-level Nesting

For deeply nested resources:

```
GET /companies/{companyId}/departments/{deptId}/employees/{empId}/timesheets
→ getEmployeeTimesheets

GET /companies/{companyId}/departments/{deptId}/employees/{empId}/timesheets/{timesheetId}
→ getEmployeeTimesheet

POST /companies/{companyId}/departments/{deptId}/employees/{empId}/timesheets
→ createEmployeeTimesheet
```

## Complex Operations

For operations that don't map directly to CRUD, use action-specific names:

```
POST /users/{userId}/activate     → activateUser
POST /users/{userId}/password-reset → sendPasswordReset
GET /orders/{orderId}/total       → calculateOrderTotal
POST /articles/{articleId}/publish → publishArticle
POST /users/{userId}/suspend      → suspendUser
POST /orders/{orderId}/cancel     → cancelOrder
```


## Examples by Resource Type

### E-commerce API
```
# Products
GET /products                     → listProducts
GET /products/{productId}         → getProduct
POST /products                    → createProduct
PUT /products/{productId}         → updateProduct
DELETE /products/{productId}      → deleteProduct

# Product Reviews
GET /products/{productId}/reviews → getProductReviews
POST /products/{productId}/reviews → createProductReview

# Orders
GET /orders                       → listOrders
GET /orders/{orderId}            → getOrder
POST /orders                     → createOrder
PUT /orders/{orderId}/status     → updateOrderStatus

# Order Items
GET /orders/{orderId}/items      → getOrderItems
POST /orders/{orderId}/items     → addOrderItem
DELETE /orders/{orderId}/items/{itemId} → removeOrderItem
```

### User Management API
```
# Users
GET /users                       → listUsers
GET /users/{userId}             → getUser
POST /users                     → createUser
PUT /users/{userId}             → updateUser
DELETE /users/{userId}          → deleteUser

# User Preferences
GET /users/{userId}/preferences → getUserPreferences
PUT /users/{userId}/preferences → updateUserPreferences

# User Sessions
GET /users/{userId}/sessions    → getUserSessions
DELETE /users/{userId}/sessions/{sessionId} → deleteUserSession
```

## Common Pitfalls

### ❌ Avoid Redundancy
```
# Bad
getUserUser
createProductProduct

# Good
getUser
createProduct
```

### ❌ Avoid Inconsistent Verbs
```
# Bad - mixing conventions
getUsers
fetchProducts
retrieveOrders

# Good - consistent verbs
getUsers
getProducts
getOrders
```

### ❌ Avoid Generic Names
```
# Bad
getData
processRequest
handleAction

# Good
getUsers
createOrder
updateProduct
```

### ❌ Avoid Abbreviations
```
# Bad
getUserAcct
createProd
updateOrd

# Good
getUserAccount
createProduct
updateOrder
```

## Implementation Tips

1. **Code Generation**: Many tools generate client code based on operationIds, so clear naming improves the generated SDK quality.

2. **Documentation**: Well-named operationIds make your API documentation more readable and searchable.

3. **Consistency Check**: Use linting tools or manual reviews to ensure naming consistency across your API specification.

4. **Team Guidelines**: Establish and document your chosen naming strategy for your development team.

5. **Versioning**: Maintain naming consistency across API versions to reduce confusion.

## Conclusion

Consistent and clear operationId naming enhances developer experience, improves code generation, and makes your API more maintainable. Choose a strategy that fits your team and API structure, document it, and apply it consistently across all endpoints.

---
