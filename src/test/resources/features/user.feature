Feature: User Verification


  Scenario: verify information about logged user
    Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
    When I get the current user information from api
    Then status code should be 200

  @wip @db
  Scenario: verify information about logged user from api and database
    Given I logged Bookit api using "sbirdbj@fc2.com" and "asenorval"
    When I get the current user information from api
    Then the information about current user from api and database should be match

  Scenario: three point verification (UI,DATABASE,API)
    Given user logs in using "teacherilsamnickel@gmail.com" "samnickel"
    When user is on the my self page
    And I logged Bookit api using "teacherilsamnickel@gmail.com" and "samnickel"
    And I get the current user information from api
    Then UI,API and Database user information must be match


