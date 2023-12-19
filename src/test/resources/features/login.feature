Feature: login

  Background:
    Given user navigates base page

  Scenario Outline:
    When user enters valid credentials  "<email>" "<password>"
    And clicks submit button
    Then sees the Contact List page
    Examples:
      | email                 | password   |
      | hansmueller@gmail.com | hansmuller |
