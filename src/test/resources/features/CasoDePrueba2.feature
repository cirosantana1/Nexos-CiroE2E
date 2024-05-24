@FeatureDos
Feature: Caso de Prueba 2.

  Background:
    Given El usuario Ciro se encuentra en la aplicacion

  @CP_2.1
  Scenario Outline: Autenticación y captura de textos en Alerts, Frame & Windows
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se muestra el perfil del usuario
    When Selecciona la opción nested frames
    Then Se muestra al usuario el formulario nested frames y captura los valores

    Examples:
      |UserName|Password  |
      |test02  |Test2023* |

  @CP_2.2
  Scenario Outline: Autenticación y diligenciamiento de información en Practice Form
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se muestra el perfil del usuario
    When Selecciona la opción practice form
    Then Se muestra al usuario el formulario practice form
    When El usuario diligencia la información solicitada "<firstName>","<lastName>","<email>","<mobile>","<dateBirth>","<subjects>","<hobbies>","<currentAddress>","<state>","<city>"
    And Selecciona la opción enviar

    Examples:
      |UserName|Password  |firstName|lastName|email             |mobile     |dateBirth  |subjects |hobbies|currentAddress            |state  |city  |
      |test02  |Test2023* |Prueba01 |Prueba01|prueba@yopmail.com|3004441234 |27 Sep 2000|Aspirante|Music  |Autopista Norte al oriente|Haryana|karnal|

  @CP_2.3
  Scenario Outline: Autenticación y eliminación de la cuenta
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se muestra el perfil del usuario
    When Selecciona la opción eliminar
    Then El sistema alerta al usuario si esta seguro de eliminar la cuenta
    When Selecciona la opción ok
    Then Se muestra informa que el usuario fue eliminado

    Examples:
      |UserName|Password  |
      |test02  |Test2023* |

  @CP_2.4
  Scenario Outline: Validar autenticación con cuenta eliminada
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se alerta al usuario que las credenciales son invalidas

    Examples:
      |UserName|Password  |
      |test02  |Test2023* |