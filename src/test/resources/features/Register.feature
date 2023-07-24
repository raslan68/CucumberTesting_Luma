
Feature: User Register

  Background:
    Given navigate to Homepage
    When  click create an Account Button
    And   enter name "<firstname>"
    And   enter lastname "<lastname>"
    And   enter email "<email>"
    And   enter password "<password>"
    And   enter confirm password "<confirmPassword>"
    And   click on create an Account Button

  Scenario: User make Registration
    Then  verify Register succefully


   Scenario: Registration unable with same email

    Then verify Register not succefully


#    Examples:
#      | firstname    | lastname      |   email             | password      | confirmPassword   |
#     |              |              |                      |               |                   |
#

