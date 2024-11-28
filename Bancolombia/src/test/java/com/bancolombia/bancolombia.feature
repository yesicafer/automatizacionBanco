Feature: Loging page by yesi

  @bancolombia
  Scenario: Ingresa pagina de bancolombia 
    Given Ingreso a la pagina principal de bancolombia 
 		And  Solicito productos
 		And  Solicito producto cuenta nomina
    When Registra informacion personal
    | numero documento   | 5282002215                 |
    | numero celular     | 3115454236                 |
    | correo electronico | meloinvente@bancolombia.com|
    Then valida inicio encuesta de bancolombia   