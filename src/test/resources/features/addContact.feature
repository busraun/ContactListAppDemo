Feature: add contact
  Background:
    Given user navigates base page

  Scenario Outline:
    When user enters valid credentials  "<email>" "<password>"
    And clicks submit button
    And clicks Add a New Contact button
    And sends relevant info
    Examples:
      | email                 | password   |
      | hansmueller@gmail.com | hansmuller |