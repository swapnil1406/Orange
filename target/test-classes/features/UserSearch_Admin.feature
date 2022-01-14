Feature: Feature to test search user functionality

  Background: 
    Given User login with username as "Admin" password as "admin123"
    When User navigate to admin link

  @Smoke
  Scenario Outline: Search valid user from admin link
    And User add user to search as "Garry.White"
    And Click search
    Then Search results with "Garry.White" or error display

  @Reg
  Scenario Outline: Search invalid user from admin link
    And User add user to search as "Swapnil"
    And Click search
    Then Search results with "Swapnil" or error display

 