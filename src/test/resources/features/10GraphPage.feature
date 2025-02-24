@DsAlgo_1Brower_new
Feature: Test Graph Datastructure
  I want to use this template for my feature file

  Background: 
    Given User opens home page before login to test graphs
    When User logged in from login page to test graphs
    Then User successfully logged in now to test graphs

  @GraphWithCorrectInput
  Scenario Outline: User tests graph with simple python code
    And User tests graph page and enters <input> in text editor box and gives <expectedOutput>

    Examples: 
      | input        | expectedOutput |
      | print"hello" | hello          |

  @GraphWithIncorrectInput
  Scenario Outline: User tests graph with wrong python code
    When User clicks graph button for wrong input and gives <errorInput> and gets <errorMsg>

    Examples: 
      | errorInput | errorMsg |
      | hello      | error    |
