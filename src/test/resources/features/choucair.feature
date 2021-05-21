#Author: Julian Patiño
# Language: En

@OneFeature
Feature: Choucair Testing

  @One
  Scenario: CH
    Given I open the main page
    And I click on the jobs button
    And I click on jobs
    Then I look at the available vacancies
    And write the name of the vacancy
    Then I select the vacancy
    And I click on the button apply to vacancy
    Then I write my personal information
    And Click on the button submit application
    Then Finish the application correctly