Feature: User Login

  Scenario: User make Login

    Given navigate to Homepage
    Then  click on SignIn Button in Homapage
    And   enter Login email "email"
    And   enter Login password "password"
    And   click on Login SignbButton
    Then  verify Login succefully