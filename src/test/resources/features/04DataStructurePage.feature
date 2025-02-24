@DsAlgo_1Brower_new
Feature: DataStructuresintroduction
  I want to use this template for my feature file

  Background: 
    Given User is in the Home Page before logging in to test DataStructures introduction
    When User clicks Signin and logged in from the login page to test DataStructure introduction
    Then User successfully logged in to test DataStructure introduction

  @DataStructuresWithCorrectInput
  Scenario Outline: User working on DataStructures Introduction with python code
    When User tests the DataStructures introduction with simple python code <input> and gives the <output>

    Examples: 
      | input        | output |
      | print"Hello" | Hello  |

  @DataStructuresWithIncorrectInput
  Scenario Outline: User working on DataStructures Introduction with wrong input
    When User tests the DataStructures introduction with wrong <wronginput> and gives the <errortext>

    Examples: 
      | wronginput | errortext |
      | hi         | ERROR     |
