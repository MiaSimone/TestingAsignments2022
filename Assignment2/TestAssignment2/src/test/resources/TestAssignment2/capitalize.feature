Feature: CapitalizeString
  Scenario: aBc is capitalized to ABC
    Given the string is aBc
    When the string is capitalized
    Then the capitalized string is ABC
