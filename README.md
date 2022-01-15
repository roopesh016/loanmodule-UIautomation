# loanmodule-UIautomation

Have used Page Object Model for to develop the test automation suite

Tools:
1. Programing language: [Java]
2. UI Automation Framework Lib: [Selenium]
3. Build tool: [Maven]
4. BDD framework for to write tests: [Cucumber]
5. Test Reports Generation: after running the tests need to go to following folder and open the index.html file in browser [target/cucumber-html-report/index.html]
6. Make sure [Cucumber for Java] is installed in the editor

maven run command: [below are maven commands for to run in different browser]
mvn clean verify -Dbrowser=chrome
mvn clean verify -Dbrowser=firefox
mvn clean verify -Dbrowser=IE

Implementation:
1. The test scenarios/ business use case written in .feature file
2. The test scenarios mapped to java method's under step classes in step folder
3. The page level actions are under Page classes in page folder
4. The page level locators are under Locator classes in locator folder
5. The WebDriver Initialisation & multiple usage of methods implementation done in Base Class
6. Url, User Details will be fetched from pom.xml file 
7. Test data is hardcoded there is an alternative ways of implementation one is through examples, second is from .csv files

Scenarios which can be included: 
1. A person with the following details:
      a. Joint,
      b. 2 dependants,
      c. buying a home to live in,
      d. with income of $80,000,
      e. other income $10,000,
      f. living expenses $500,
      g. current home loan repayments $0,
      h. other loan repayments $100,
      i. other commitments $0
      j. and total credit card limits $10,000

2. A person with the following details:
      a. Single,
      b. 2 dependants,
      c. buying Residential Investment,
      d. with income of $80,000,
      e. other income $10,000,
      f. living expenses $500,
      g. current home loan repayments $0,
      h. other loan repayments $100,
      i. other commitments $0
      j. and total credit card limits $10,000

3.A person with the following details:
    a. Joint,
    b. 2 dependants,
    c. buying Residential Investment,
    d. with income of $80,000,
    e. other income $10,000,
    f. living expenses $500,
    g. current home loan repayments $0,
    h. other loan repayments $100,
    i. other commitments $0
    j. and total credit card limits $10,000 
 
4. Verify with the error message [required] when user inputs blank value for annual income, other income, monthly living expenses, current home loan repayment, other loan repayment, other monthly commitments, total credit limits 

5. Decimal values should not allow

6. Verify with the info message by hovering on the info icon

7. Verify whether all the other buttons are clickable with respect to contact, finding the location, request a call back etc.., 

8. Verify whether at least monthly living expenses are mandatory for to calculate the estimated amount