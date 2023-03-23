# Configure Vulnerability Source

## Configurations

Vulnerability source configurations are stored in database table `vuln_source_config`,
and initialized by [data.sql](../src/main/resources/data.sql).

There are one basic and several source-specific configurations.

## Basic Configurations

The basic configurations are stored in separate table columns.

| Configuration     | Type   | Allowed Values  | Description                                                                         |
|-------------------|--------|-----------------|-------------------------------------------------------------------------------------|
| import_enabled    | bool   | true/false      | whether importing vulnerabilities from the source                                   |

By default, importing is enabled for open source databases, but disabled for commercial or private databases.

## Source-specific Configurations

The source-specific configurations are stored as a json in `config` column of table `vuln_source_config`.
Tokens and/or API servers/endpoints for commercial or private databases can be configured here.

**NOTE:**
Multiple OSS Index API tokens can be configured by concatenating them with comma, e.g., `TOKEN_1,TOKEN_2,TOKEN_3`.

---
[Back to the README](../README.md)
