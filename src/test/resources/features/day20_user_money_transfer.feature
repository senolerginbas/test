@money_transfer @smoke
Feature: money transfer feature

  Scenario Outline: login_with_customer_credentials

    Given user is on the login page
    And user clicks on login dropdown
    And user clicks on sign in button
    And user sends username "<username>"
    And user sends password "<password>"
    And user clicks on the login button

    Examples: credentials
      |username                   |password              |
      |shaylee.lindgren           |mVSk$eq1YoZwq         |


  Scenario: user_should_make_money_transfer

    Given user clicks on my operations
    And user clicks on transfer money
    When user select the current account to transfer money from
    And user select the other account to transfer money to
    When user provides the balance "1"
    When user provides the balancecent "1"
    And user types the description
    Then user makes the money transfer and verify success message
