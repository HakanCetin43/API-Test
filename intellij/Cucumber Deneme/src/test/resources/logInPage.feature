Feature: Login Page
  Scenario Outline: Different User Login
    Given I am in the login page
    When I type a "<password>"
    And I tape a "<username>"
    And I check "<statusCode>"
    Then The main page opens

    Examples:
    | password | username | statusCode |
    | abc      | klmc     | 200        |
    | lmd      | wta      | 200        |
    | yba      | almn     | 200        |
    | oplam    | qaw      | 200        |
    | uda      | amn      | 200        |
    | qlmn     | fdgc     | 200        |
    |1234      | hlmn     | 200        |
    | 178      | opl      | 200        |
    | 098      | pms      | 200        |
    | 6789     | tlmn     | 200        |

