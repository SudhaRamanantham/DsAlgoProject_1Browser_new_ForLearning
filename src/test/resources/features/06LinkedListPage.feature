@DsAlgo_1Brower_new
Feature: Test Linked List Data Structure
  I want to use this template for my feature file

  Background: 
    Given User is in the home page before loging in to test linked list
    When User clicks sign in and loged in from logIn page to test linked list
    Then User successfully logged in to test linked list

  @LinkedListWithCorrectInput
  Scenario Outline: User test Linked List Data Structure with python code
    When User test the linked list data structure with simple python code <input> and gives <expectedOutput>

    Examples: 
      | input       | expectedOutput |
      | print('Hi') | Hi             |

  @LinkedListWithIncorrectInput
  Scenario Outline: User test Linked List Data Structure with wrong python code
    When User test the linked list data structure with wrong python code <wrongInput> and gives <errorMsg>

    Examples: 
      | wrongInput | errorMsg |
      | hello      | Error    |
