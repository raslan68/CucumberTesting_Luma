
Feature: User Register

  Scenario: User make Registration
    Given navigate to Homepage
    When  click create an Account Button
    And   enter name "<firstname>"
    And   enter lastname "<lastname>"
    And   enter email "<email>"
    And   enter password "<password>"
    And   enter confirm password "<confirmPassword>"
    And   click on create an Account Button
    Then  verify Register succefully

#    Examples:
#      | firstname    | lastname      |   email             | password      | confirmPassword   |
#     |              |              |                      |               |                   |
#

