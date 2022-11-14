Feature: Move
  Scenario: We move north
    Given the snake is moving east or west
    When we press up arrow
    Then the snake turns north

  Scenario: We move south
    Given the snake is moving east or west
    When we press down arrow
    Then the snake turns south

  Scenario: We move east
    Given the snake is moving north or south
    When we press right arrow
    Then the snake turns east

  Scenario: We move west
    Given the snake is moving north or south
    When we press left arrow
    Then the snake turns west