# automation
Web automation Challenge 
The objective of this challenge is to demonstrate strong automation fundamentals, framework design, and real-world understanding of payment systems, while ensuring production safety.
The automation covers a complete user journey: Product selection → Add to cart → Checkout → Payment option selection (UPI & Card) → Reach OTP / second-factor screen.

-> Test Scenarios Automated
1. Launch application and navigate to home page
2. Select a product and add it to the cart
3. Proceed to Place order
4. Login  to payment section
5. Select UPI payment option and enter UPI ID
6. Select Card payment option and enter card details
7. Validate redirection till payment / OTP screen
   
-> Tech Stack
* Java – Programming language
* Selenium WebDriver – Web automation
* TestNG – Test execution & assertions
* Page Object Model (POM) – Framework design
* Extent Reports – Test execution reporting
* Maven – Build & dependency management

src/test/java
 ├── base
 │    └── BaseTest.java
 │         - Responsible for browser initialization
 │         - Launches the application URL
 │         - Handles test setup and teardown

 ├── pages
 │    ├── HomePage.java
 │    ├── LoginPage.java
 │    ├── ProductPage.java
 │    ├── ProdDetailsPage.java
 │    ├── PaymentUPIPage.java
 │    └── CardPayment.java
 │         - Contains web element locators
 │         - Contains actions performed on each page
 │        

 ├── tests
 │    └── TestCase.java
 │         - Contains end-to-end test scenarios
 │         - Covers searching product, adding to cart,
 │           checkout, and payment flow validation

 └── utils
      ├── DriverFactory.java
      │     - Manages WebDriver creation
      │     - Supports browser configuration
      ├── WaitUtil.java
      │     - Centralized explicit wait implementation
      └── WindowSwitch.java
            - Handles multiple windows or tabs during payment flow

target
 └── report.html
      - Extent Report generated after test execution
      - Provides detailed execution status and results

testng.xml
      - Controls test execution
      - Defines test classes and parallel execution settings

Reporting:

Integrated Extent Reports for clear visibility

Includes:
- Test step status
- Execution summary
      
Author
Gayathri Bestha
