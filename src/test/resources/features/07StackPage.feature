@DsAlgo_1Brower_new
Feature: Testing Stack DataStructure
  I want to use this template for my feature file

  Background: 
    Given User is in the Home Page before logging in to test Stack datastructure
    When User clicks Signin and logged in from the login page to test Stack datastructure
    Then User successfully logged in to test Stack datastructure

  @StackWithCorrectInput
  Scenario Outline: User working on Stack datastructure with Python code
    When User tests the Stack datastructure with simple python code <input> and gives the <output>

    Examples: 
      | input        | output |
      | print"Hello" | Hello  |

  @StackWithIncorrectInput
  Scenario Outline: User working on Stack datastructure with wrong input
    When User tests the Stack datastructure with wrong <wronginput> and gives the <errortext>

    Examples: 
      | wronginput | errortext |
      | hi | ERROR  |
