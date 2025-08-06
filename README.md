# contractlibs Library

![Build](https://github.com/6-bank-organization/sixbank-account-library/actions/workflows/ci.yaml/badge.svg?branch=main)
![Test](https://img.shields.io/badge/tests-passing-brightgreen)
![Docs](https://img.shields.io/badge/javadoc-published-blue)
![Deploy](https://img.shields.io/badge/deploy-success-green)

A lightweight and extensible Java library providing standardized models, events, enums, and utilities for banking and financial microservices.

---

## 🚀 Overview

`contractlibs` is designed to promote **consistency**, **reusability**, and **clean domain modeling** across distributed services, particularly in banking and fintech ecosystems.

This library provides:

- Typed enums for account classification and control
- Common domain events to support event-driven architecture
- Standard response and error DTOs for REST APIs
- Utilities for account number generation and validation

---

## 📦 Features

- ✅ Professionally documented domain enums (`AccountType`, `AccountStatus`, etc.)
- 📑 Reusable API response and error DTOs with Builder pattern
- 📣 Event classes for account lifecycle tracking
- 🧠 Utility methods for secure and valid account number generation
- 🔒 Immutability and thread-safety where applicable

---

## 🛠️ Installation

### Maven

```xml
<dependency>
    <groupId>com.contractlibs</groupId>
    <artifactId>contract-library</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
````

### Gradle

```groovy
implementation 'com.contractlibs:contract-library:1.0-SNAPSHOT'
```

---

## ✅ Usage

### 📄 API Response DTO

```java
ApiResponse<UserDto> response = ApiResponse.<UserDto>builder()
    .timestamp(LocalDateTime.now())
    .status(200)
    .message("User created successfully")
    .data(userDto)
    .build();
```

### ❌ Error DTO

```java
ApiError error = ApiError.builder()
    .timestamp(LocalDateTime.now())
    .status(400)
    .error("Bad Request")
    .message("Invalid input data")
    .path("/api/accounts")
    .errors(List.of("Email is required", "Password too weak"))
    .build();
```

---

## 📚 Enums

Located in: `com.contractlibs.enums`

| Enum            | Description                                                          |
| --------------- | -------------------------------------------------------------------- |
| `AccountType`   | Classifies types of bank accounts (SAVINGS, CHECKING, etc.)          |
| `AccountStatus` | Tracks the lifecycle of a bank account (ACTIVE, FROZEN, etc.)        |
| `HolderType`    | Differentiates user roles on an account (PRIMARY, AUTHORIZED, etc.)  |
| `LimitType`     | Categorizes transaction limits (ATM\_WITHDRAWAL, POS\_PAYMENT, etc.) |

---

## 📡 Events

Located in: `com.contractlibs.events`

These classes enable event-driven microservices by emitting structured domain events.

| Event Class                  | Description                                                               |
| ---------------------------- | ------------------------------------------------------------------------- |
| `AccountCreatedEvent`        | Emitted after a new account is successfully created                       |
| `AccountBalanceUpdatedEvent` | Emitted on changes to account balance                                     |
| `AccountStatusChangedEvent`  | Emitted on transitions between account statuses                           |
| `BaseEvent`                  | Abstract base providing `eventId` and `createdAt` fields for traceability |

---

## 🔧 Utilities

### 📟 `AccountNumberGenerator`

Utility class for secure, validated account number generation.

#### Sample usage:

```java
String accountNumber = AccountNumberGenerator.generateAccountNumber("SIX");

boolean isValid = AccountNumberGenerator.isValidAccountNumber(accountNumber, "SIX");

String masked = AccountNumberGenerator.maskAccountNumber(accountNumber);

String numericPart = AccountNumberGenerator.extractNumericPart(accountNumber, "SIX");
```

---

## 📁 Package Structure

```
com.contractlibs
├── dto          # ApiResponse and ApiError
├── enums        # AccountType, AccountStatus, LimitType, etc.
├── events       # Domain events (account creation, status change, etc.)
└── utility      # Utilities like AccountNumberGenerator
```

---

## 🧪 Testing

This library is designed to be test-friendly. You can use `JUnit 5` or `TestNG` with mocking tools like `Mockito` or `AssertJ`.

---

## 📜 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

---

## 📧 Contact

For questions, support, or enterprise collaboration:

* 📮 Email: `nestorabiawuh@gmail.com`
* 🌐 Reach-out: [Linkedin](https://www.linkedin.com/in/nestor-abiangang/)

---

## ⭐ Star the Project

If this library helps you build better systems, please consider starring the repo 🙏

