# OpenWealth Custody API

This API is part of the OpenWealth APIs for the connectivity between custody banks and WealthTechs (e.g. Portfolio Management Systems). This API allows the user to receive data from custody banks regarding accounts and positions. The API is designed to be used for either update end of day data batches or single near-realtime account/position information. Furthermore, this API allows the user to receive data from custody banks regarding transactions. In the version 3.0 only transactions which include effective cash or securities movements are in scope and corporate actions without any cash impact are delivered only on a informative basis.

# Overview and scope

As a first step OpenWealth has decided to support the exchange of data out of the view of an external asset manager (EAM) or alike in the sense of enhancing the ways the EAMs technology provider (i.e. Portfolio Management Solutions) query data. The custody services API provides a set of read only services for portfolio, account, position and transaction information. An EAM is typically authorized on a set of customers of a custodian bank with a power of attorney on a subset of accounts (safekeeping & cash accounts).
The technology provider will access the APIs with the EAM access token and first retrieve a list of authorized clients containing the authorized accounts. In the next step position statements can be queried either by customer or by account and transaction statements are available by customer, account or position.
The repository also contains set of example payloads for a large amount of instruments and business event types.


# Entities and operations of the API

The API defines endpoints to retrieve information about the following business objects:

- **Customers:** Query business partners that are authorized to requesting user
- **Accounts:** Query cash and safekeeping accounts for a given customer and/or authorized to the requesting user
- **Positions:** Query positions and their valuation for a given date and customer or account
- **Transaction:** Query transactions and associated changes in holdings for a given date and customer or account

# Documentation

A general introduction on how to use OpenAPI specifications can be found here:

[Getting started](https://github.com/OpenWealth/OpenWealth/wiki/getting-started)

An extensive documentation of the custody API is found in the wiki:

[Custody API Documentation](https://github.com/OpenWealth/OpenWealth/wiki/custody)

The wiki covers these topics among others:

- Use cases and examples
- Enumerations and terminologies
- Entity relations
- Modelling principles
- Guides and good practices for implementors
