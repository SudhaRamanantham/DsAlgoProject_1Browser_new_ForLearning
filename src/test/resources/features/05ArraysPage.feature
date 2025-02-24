@DsAlgo_1Brower_new
Feature: Test Array Datastructure
  I want to use this template for my feature file

  Background: 
    Given User opens home page before login to test arrays
    When User logged in from login page to test arrays
    Then User successfully logged in now to test arrays

  @ArraysWithCorrectInput
  Scenario Outline: User tests array with simple python code
    When User tests array page enters <input> in text editor box and it gives <expectedOutput>

    Examples: 
      | input        | expectedOutput |
      | print"hello" | hello          |

  @ArraysWithIncorrectInput
  Scenario Outline: User tests arrays with wrong python code
    When User clicks array button for wrong input and gives <errorInput> and gets <errorMsg>

    Examples: 
      | errorInput | errorMsg |
      | hello      | error    |
