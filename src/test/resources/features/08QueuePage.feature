@DsAlgo_1Brower_new
Feature: Test Queue Data Structure
  I want to use this template for my feature file

  Background: 
    Given User now in the home page before loging in to test queue
    When User loged in from logIn page to test queue
    Then User successfully logged in now to test queue

  @QueueWithCorrectInput
  Scenario Outline: User test Queue Data Structure with python code
    When User test the queue data structure with simple python code <input> and gives <expectedOutput>

    Examples: 
      | input       | expectedOutput |
      | print('Hi') | Hi             |

  @QueueWithIncorrectInput
  Scenario Outline: User test Queue Data Structure with wrong python code
    When User test the queue data structure with wrong python code <wrongInput> and gives <errorMsg>

    Examples: 
      | wrongInput | errorMsg |
      | se34       | Error    |
