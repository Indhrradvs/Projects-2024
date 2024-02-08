Feature: Feature to test Swag Labs Application Login Functionality

  Scenario Outline: check login is successful with valid Credentials
    Given user is on login page
    When user enters<username> and <password>
    And clicks on login button
    Then user is navigated to the Home Page

    Examples: 
      | username      | password     |
      | standard_user | secret_sauce |

  Scenario: Add the items to the cart
    When select the items to the cart
    Then move to the cart
    And remove some item from the cart
    Then Move back to Previous page
    Then Add another item to the cart
    Then Move to cart Again
    And Click on Checkout button
    Then Enter customer details
      | Frank | Martin | 20854 |
    Then Finish order and capture the confirmation
