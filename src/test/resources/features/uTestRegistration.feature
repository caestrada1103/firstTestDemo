# Autor: Carlos Armando Estrada Torres

@stories
  Feature: Register uTest
    As a user, I want to create a new account on uTest page
  @scenario1
  Scenario Outline: create account at uTest page
    Given as Carlos want to create an account at uTest page
    When complete register form
      | strFirstName  | strLastName   | strEmail    |  strPassword    |  strPasswordConfirm   |
      | <FirstName>   | <LastName>    | <Email>     |  <Password>     |  <PasswordConfirm>    |
    Then verify the new account
      | strLabelFinal |
      | <LabelFinal>  |

    Examples:
    | FirstName  | LastName   |    Email                | Password    | PasswordConfirm  | LabelFinal     |
    |Pepito Perez|  Restrepo  | pepito.perezr@gmail.com | P3p1t02021* | P3p1t02021*      | The last step |