@FeatureUno
Feature: Caso de Prueba 1.

  Background:
    Given El usuario Ciro se encuentra en la aplicacion

  @CP_1.1
  Scenario Outline: Registro y seleccion del libro
    When El usuario ingresa sus datos personales "<FirstName>","<LastName>","<UserName>","<Password>"
    And Selecciona la opción registrarse
    Then El sistema alertara que verifique el reCaptcha
    When Busca y agrega el libro "<Book>"

    Examples:
      |FirstName|LastName|UserName|Password  |Book                    |
      |Test01   |Test01  |test01  |Test2023* |Programming JavaScript  |

  @CP_1.2
  Scenario Outline: Autenticación y seleccion del libro
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se muestra el perfil del usuario
    When Busca y agrega el libro "<Book>"

    Examples:
      |UserName|Password  |Book                       |
      |test01  |Test2023* |Understanding ECMAScript 6 |

  @CP_1.3
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
      |test01  |Test2023* |

  @CP_1.4
  Scenario Outline: Validar autenticación con cuenta eliminada
    When El usuario ingresa sus credenciales "<UserName>","<Password>"
    And Selecciona la opción login
    Then Se alerta al usuario que las credenciales son invalidas

    Examples:
      |UserName|Password  |
      |test01  |Test2023* |