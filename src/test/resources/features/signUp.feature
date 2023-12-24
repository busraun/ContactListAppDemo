Feature: Sign up

  Background:
    Given user navigates base page


  Scenario Outline:
    When click sign up button
    And view add user page
    And fill the mandatory blanks "<firstName>" "<lastName>" "<email>" "<password>"
    Then see the Contact List header
    Examples:
      | firstName | lastName | email                 | password   |
      | Hans      | Müller   | hansmueller98@gmail.com | hansmuller |
