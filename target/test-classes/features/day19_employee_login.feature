@employee_login_scenario_outline @smoke
Feature: employee_login
  Scenario Outline: login_with_employee_credentials
    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button
    Then close the application

    Examples: credentials
      |username                  |password              |
      |gino.wintheiser           |%B6B*q1!TH            |
      |    dallas.batz           |  dOWjuXz8*es6        |
      |leonel.skiles             |x3uvY0f8hw1T          |
      |freddy.veum               |*f**3dafHW3Jx         |
      |syble.jerde               |2*0R*!K&GB3T%G        |
      |julius.keebler            |F&134#R%0d            |
    #1. cretae the faeture file
  #2. run runner and generate missing step definitions
  #3. put the step definitions in the loginstepsdefs class
  #4. start writing java code in the step definitions