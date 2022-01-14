Feature: Feature to test leave functionality

  Background: 
    Given User login with username as "Admin" password as "admin123"
    When User navigate to leave link

  @Reg
  Scenario Outline: Apply leave
    Then Click apply leave

  @Smoke
  Scenario Outline: Get my leaves
    Then Click my leaves

  @Sanity
  Scenario Outline: Check entitlements
    Then Click entitlements

  @Sanity
  Scenario Outline: Get leave reports
    Then Click leave reports

  @Sanity
  Scenario Outline: Configure leaves
    Then Click configure

  @Smoke
  Scenario Outline: Leave list
    Then Click leave list

  @Smoke
  Scenario Outline: Assign leave
    Then Click Assign leave
