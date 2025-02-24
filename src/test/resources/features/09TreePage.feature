@DsAlgo_1Brower_new
Feature: Test Tree Data Structure
  I want to use this template for my feature file

  Background: 
    Given User now in the home page before loging in to test tree data structure
    When User loged in from logIn pageto test tree data structure
    Then User successfully logged in now to test tree data structure

  @TreeWithCorrectInput
  Scenario Outline: User test tree Data Structure with python code
    When User test the tree data structure with simple python code <input> and gives <expectedOutput>

    Examples: 
      | input       | expectedOutput |
      | print('Hi') | Hi             |

  @TreeWithIncorrectInput
  Scenario Outline: User test tree Data Structure with wrong python code
    When User test the tree data structure with wrong python code <wrongInput> and gives <errorMsg>

    Examples: 
      | wrongInput | errorMsg |
      | hello      | Error    |
