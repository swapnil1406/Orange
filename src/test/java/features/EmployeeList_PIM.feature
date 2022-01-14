Feature: Retrieve employee list

  Background: 
    Given User login with username as "Admin" password as "admin123"
    When User navigate to pim link

  @RegTest
  Scenario Outline: View employee list
    Then Clicks employee list link to display employee

  @SmokeTest
  Scenario Outline: Get employee report
    Then Clicks report to get employee report

  @SmokeTest
  Scenario Outline: Add employee
    Then Clicks add employee to add employee
