#Author: Sukeerth Madaka
Feature: As a Product Owner
  I want that while using the KiwiSaver Retirement Calculator all fields in the calculator have got the information icon present
  So that 
  The user is able to get a clear understanding of what needs to be entered in the field .

  @Regression
  Scenario: Given User Clicks information icon besides <Label> the message <HelpText> is displayed below the current age field.
    Given I Open navigate to the Retirement Calculator Form
    And I validate the helptext for all the fields
      | Label                                 | HelpText                                                                                                                                                                                                                                                                                                                                                         |
      | Current age                           | This calculator has an age limit of 18 to 64 years old.                                                                                                                                                                                                                                                        |
      | Employment status                     | If you are earning a salary or wage, select ‘Employed’. Your employer contributions will be automatically calculated at a rate of 3% of your before-tax salary or wages. You can also select ‘Self-employed’ or ‘Not employed’ and then enter below (in the Voluntary contributions field), the amount and frequency of any contributions that you wish to make. |
      | Salary or wages per year (before tax) | Only include your total annual income that is paid to you by your employer(s). Other income sources such as rental income or dividends should not be included.                                                                                                                                                                                                   |
      | KiwiSaver member contribution         | You can choose to contribute a regular amount equal to 3%, 4%, 6%, 8% or 10% of your before-tax salary or wage. If you do not select a rate, your rate will be 3%.                                                                                                                                                                                               |
      | Current KiwiSaver balance             | If you do not have a KiwiSaver account, then leave this field blank.                                                                                                                                                                                                                                                                                             |
      | Voluntary contributions               | If you are 'Self-Employed' or 'Not employed', you can make direct contributions to your KiwiSaver account. If you are 'Employed', you can make voluntary contributions in addition to your regular employee contributions.                                                                                                                                       |
      | Risk profile                          | The risk profile affects your potential investment returns:                                                                                                                                                                                                                                                                                                      |
      | Savings goal at retirement            | Enter the amount you would like to have saved when you reach your intended retirement age. If you aren’t sure what this amount is, you can leave it blank or use the Sorted Retirement Planner                                                                                                                                                                   |