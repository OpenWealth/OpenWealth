# Introduction

The OpenWealth Association’s mission is to connect financial institutions, WealthTechs and other service providers to develop, maintain and distribute the Open API standard for a global wealth management community. Furthermore, the association aims to foster the exchange of expertise among its members and with third parties, as well as to cooperate with organizations of a similar nature.

# OpenWealth APIs

Open Wealth defines, maintains and publishes 3 APIs:

- [Custody API](custodyAPI.yaml) - enabling customer life cycle managment, such as onboarding a new client, providing KYC information to the bank etc.
- [Customer API](customerAPI.yaml) - receiving securities accounting including post-trade transaction data and position valuation
- [Trading API](tradingAPI.yaml) - managing order placement and related processes for authorized accounts

# Documentation

A detailed introduction into OpenWealth APIs and detailed documentation to each API including guidelines, good practices, entitiy models and examples ar found in the wiki:

[OpenWealth Wiki](https://github.com/OpenWealth/OpenWealth/wiki)

# Repository structure

All the API specification source files are contained in the `src` folder with a cantianed folder for each API and folder `generics` containing files shared among all APIs.
An API folder contains the root `API.yaml` which references files in folders structured by the redocly convention:

└──API.yaml
└──paths
└──components
│ ├──headers
│ ├──parameters
│ ├──schemas
│ ├──examples

The budled and published API file is created and validated by `redocly cli`. Each Pull-Request will automatically trigger the bundling prozess. Details to the bundling and linting are found here:

[API bundling](https://github.com/OpenWealth/OpenWealth/wiki/API-bundling)

# Contribution

TBD
