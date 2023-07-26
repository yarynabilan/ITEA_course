Feature: SearchForJavaBook

  Scenario: Successful search and add to basket
    Then Click "LoginButton"
    Then Input login
    Then Input password
    Then Click "Submit" button
    Then Content "Нація, що читає – непереможна!" visible





