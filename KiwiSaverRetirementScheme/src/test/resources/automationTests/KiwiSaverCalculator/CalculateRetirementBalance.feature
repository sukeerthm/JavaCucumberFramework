#Author: Sukeerth Madaka
Feature: As a Product Owner
  I want that the KiwiSaver Retirement Calculator users are able to calculate what their KiwiSaver projected balance would be at retirement
  So that 
  The users are able to plan their investments better.

  @Regression
  Scenario: Given User enters information in the form to calculate projected balance

    Given I Open navigate to the Retirement Calculator Form
    And I fill the retirement FormDetails
      | currentAge | employmentStatus | salaryWage | kiwiSaverContribution | currentKiwiSaverBalance | voluntaryContribution | voluntaryContributionFre | riskProfile  | savingGoal |
      |         30 | Employed         |      82000 |                     4 |                         |                       | Weekly                   | Defensive    |            |
      |         45 | Self-employed    |            |                       |                  100000 |                    90 | Fortnightly              | Conservative |     290000 |
      |         55 | Not employed     |            |                       |                  140000 |                    10 | Annually                 | Balanced     |     200000 |
