# QA Automation Portfolio

Recruiter-ready automation examples built with Java, Selenium WebDriver, REST Assured, TestNG, Maven, and GitHub Actions.

## What this repository demonstrates

- Page Object Model (POM) for maintainable UI automation
- Selenium WebDriver browser automation with TestNG
- REST Assured API automation with positive and negative scenarios
- Maven multi-module project structure
- CI execution and test-report artifact upload through GitHub Actions

## Project structure

```text
qa-automation-portfolio/
├── learning-programs/          # 313 Java, Selenium, OOP, and collection practice programs
├── selenium-ui-tests/          # Selenium + TestNG Page Object Model example
├── rest-assured-api-tests/     # REST Assured API tests
├── .github/workflows/          # GitHub Actions CI workflow
├── pom.xml                     # Parent Maven project
└── README.md
```

## Learning programs

The `learning-programs` directory preserves the original hands-on Java and Selenium practice programs. It includes Java basics, arrays, collections, OOP concepts, JavaScriptExecutor, Selenium interactions, waits, screenshots, dropdowns, alerts, windows, and reusable utilities.

These programs are intentionally kept separate from the framework modules. This keeps the recruiter-facing Selenium and API examples clean while retaining the breadth of practice work in the same repository.

## Technologies

| Area | Tools |
| --- | --- |
| Language | Java 17 |
| UI automation | Selenium WebDriver |
| API automation | REST Assured |
| Test framework | TestNG |
| Build tool | Maven |
| CI | GitHub Actions |

## Run locally

```bash
git clone https://github.com/YOUR-USERNAME/qa-automation-portfolio.git
cd qa-automation-portfolio
mvn test
```

Run only API tests:

```bash
mvn -pl rest-assured-api-tests test
```

Run only Selenium UI tests:

```bash
mvn -pl selenium-ui-tests test
```

## Test coverage included

### Selenium UI automation

- Public demo login flow
- Page Object Model separation between test logic and locators
- Clear success-message validation

### REST Assured API automation

- Create a booking and validate response fields
- Negative test for an unknown resource

## Safe portfolio practice

All test targets in this repository are public demo APIs or websites. Never commit real company URLs, customer data, credentials, tokens, or internal application details.

## Next additions

- JSON schema validation and POJO request/response models
- Data-driven test execution
- Extent/Allure reporting
- Playwright test module
- OWASP API security test examples
