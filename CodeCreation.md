# Code creation

In this file we show some techniques for specification, documentation and code creation.
The community for Open API Specification (OAS) has grown rapidly and there are several tools avilable.
In the following we will cover a few helpful tools

## Specification bundeling

The Open Wealth repository consists of a number of components separated into files, such as schema definition for types, resources and responses.
In order to create a single bundled file containing all references ther is a simple bundeling CLI available here:
<https://redocly.com/docs/cli/guides/>

Install the CLI with this command (npm):

```console
npm i -g @redocly/cli@latest
```

Bundle a specification with this command

```console
redocly bundle API.yaml --ext yaml --output API-bundled.yaml
```

where 'API.yaml' is the OAS source file and 'API-bundled.yaml' denotes the bundled output file in YAML format.

## API Server/Client creation

The following project supports the creation of a code basis in various languages for OpenWealth providers (Server) and OpenWealth consumers (clients). This typically consists of an auto-generated object oriented class design of the OAS as well as code for serving and consuming requests.
<https://openapi-generator.tech/>

Installation (npm)

```console
npm install @openapitools/openapi-generator-cli -g
```

Examle of creating an AspNetCore server:

```console
openapi-generator-cli generate -i api-bundled.yaml -g aspnetcore -o OpenWealth --package-name OpenWealth --output build/OpenWealth
```

where 'api-bundled.yaml' is the OAS spec file. There are a number of parameters such as targetFramework, naming conventions etc that can be added to the command.
