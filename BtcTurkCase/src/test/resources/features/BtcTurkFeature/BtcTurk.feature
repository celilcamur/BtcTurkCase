Feature: btcturk

  Scenario: btc compare
    Given I navigate home page
    When I get the prices
    Then I compare the high and low price

  Scenario: usdt compare
    Given I navigate home page
    And I change ticker
    When I get the prices
    Then I compare the high and low price