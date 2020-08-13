Feature: FizzBuzz Game test
  Background:
    Given Game starts
  Scenario: Play to get Fizz
    When User add a number 3
    Then Waiting "Fizz"
  Scenario: Play to get Buzz
    When User add a number 5
    Then Waiting "Buzz"
  Scenario: Play to get FizzBuzz
    When User add a number 15
    Then Waiting "FizzBuzz"
  Scenario Outline: Just Play
    When User add a number <number>
    Then Waiting "<result>"
    Examples:
      | number  | result    |
      | 3       | Fizz      |
      | 5       | Buzz      |
      | 30      | FizzBuzz  |
      | 2       | 2         |