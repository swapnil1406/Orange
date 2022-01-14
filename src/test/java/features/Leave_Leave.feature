Feature: Feature to test leave functionality

  Background: 
    Given User login with username as "Admin" password as "admin123"
    When User navigate to leave link

  @RegTest
  Scenario Outline: Apply leave
    Then Click apply leave

  @SmokeTest
  Scenario Outline: Get my leaves
    Then Click my leaves

  @SmokeTest
  Scenario Outline: Check entitlements
    Then Click entitlements

  @SmokeTest
  Scenario Outline: Get leave reports
    Then Click leave reports

  @SmokeTest
  Scenario Outline: Configure leaves
    Then Click configure

  @SmokeTest
  Scenario Outline: Leave list
    Then Click leave list

  @SmokeTest
  Scenario Outline: Assign leave
    Then Click Assign leave
