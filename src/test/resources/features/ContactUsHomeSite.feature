Feature: Contact Us Test

  Scenario: User send message via Contact Us
    Given navigate to Homepage
    When  click on Contact Us Button on Home Page
    And   enter Contact Us Name "<ContactUsName>"
    And   enter Contact Us Email "<ContactUsEmail>"
    And   enter his Mind  "<ContactUsMind>"
    When  click on ContactUs Button
    Then  verify Contact Us successfully