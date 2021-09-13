@web
Feature: Automation Practice Application

  Background: setup browser and navigate to application URL
    Given User open browser and  navigates to "http://automationpractice.com"
    Then user opens Login Page
    And user enters "asu9421@gmail.com" on Username
    And user enters "aut555" on Password
    And user clicks on SignIn button

  Scenario: Automation Practice Test Scenario
    Then user clicks on My Address section
    And user create a new address
    Then user delete the address
    Then user log out of the application

  Scenario Outline: Search for products
    When user search for <Search_Query>
    Then user get <number_of_products> product as result

    Examples: product search
    | Search_Query | number_of_products |
    | Sari         | 0                  |
    | CHIFFON      | 2                  |
