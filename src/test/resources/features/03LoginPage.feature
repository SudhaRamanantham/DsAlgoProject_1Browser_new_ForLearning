@DsAlgo_1Brower_new
Feature: Test Login Page
  I want to use this template for my feature file

  @LoginPageTest
  Scenario Outline: Check login is successful with valid credentials
    Given User enters login page
    When User enters <username> and <password>
    Then User successfully logged in

    Examples: 
      | username     | password   |
      | Abcdef       | Abcdef@123 |
      | TechieNinjas | Techie@132 |
