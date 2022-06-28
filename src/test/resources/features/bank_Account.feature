Feature: BankAccount

  Scenario: Open Account
    Given I don't have any account
    When I open a new account
    Then I get his accountNumber


