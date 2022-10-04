Feature: Celcius-To-Fahrenheit
  Convert 30 Celcius to Fahrenheit
  Scenario:  30 celcius converted to fahrenheit
    Given 30 celcius
    When I click the button
    Then 30 celcius in fahrenheit should be displayed

#  Skulle have været:
#
#Feature: Celsius to fahrenheit conversion
#
#  Scenario: 42 is put in as celcius and fahrenheit is returned
#    Given I have 42.0 celcius
#    When I convert the temperature to fahrenheit
#    Then I should get 107.6 fahrenheit