#Author: Julian Patiño
# Language: En

@OneFeature
Feature: Choucair Testing

  @One
  Scenario Outline: CH
    Given I open the main page
    And I click on the jobs button
    And I click on jobs
    Then I look at the available vacancies
    And write the name of the vacancy
    Then I select the vacancy
    And I click on the button apply to vacancy
    Then I write my personal information <Nombre>,<Correo>,<Celular>,<Formacion>,<Experiencia>,<ConocimientoAut>,<Salario>,<Disponibilidad>,<MensajeAdicional>
    And Click on the button submit application
    Then It checks that the job aplication was fine by following <message>
    Examples:
      |Nombre|Correo         |Celular   |Formacion    |Experiencia|ConocimientoAut|Salario  |Disponibilidad|MensajeAdicional|message|
      |juan  |juanp@gmail.com|3013213211|Ing Sistemas |Ninguna    |Basicos        |1.500.000|si            |Deseo participar|Your job application has been submitted successfully|