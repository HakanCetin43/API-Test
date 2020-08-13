Feature: Login Page
  Scenario: Successful Login (happy path)
    Given I am in the login page
    When I type a valid username
    And I type a valid password
    Then The main page opens


  Scenario: Successful Login with Message (happy path)
    Given I am in the login page
    And Login menu appears
    When I type a valid password
    And I type a valid username
    Then The main page opens
    And User profile appears
    And "Successful Login" message appears
    And "Happy Birthday" message appears

  Scenario Outline: Different User Login
    Given I am in the login page
    And Login menu appears
    When I type a "<password>"
    And I type a "<username>"
    Then The main page opens
    And Response code should be "<responseCode>"
    And Response message should be "<message>"

    Examples:

    |password        |username        |responseCode |message  |
    #valid passwords and usernames
    |12345           |username1234    | 200         | OK      |
    |123             |username123     | 200         | OK      |
    |asd             |userasd         | 200         | OK      |
    #invalid passwords and usernames
    | zzz            | abc2e          | 400         | Bad request|
    | xxx            | erc2            | 400        | Bad request|
    | yyy            | ylc             | 400        | Bad request|

