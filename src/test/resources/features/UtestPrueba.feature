@stories
Feature: Prueba Utest
  como nuevo usuario del sitio Utest
  quiero registrarme para acceder a sus beneficios
  @scenario1
  Scenario:
    Given Estoy en Utest Para registrarme
    When Lleno el formulario de registro
    |firstName|lastName|eMail|month|day|year|city|zip|country|computer|version|languague|mobile|model|system|password|
    |Jhonatan |Ferreira|jferreirap@choucairtesting.com|June|16|1995|Medellín|050023|Colombia|Windows|10|Spanish|Motorola|Moto G6 Plus|Android 9.0|TuContraseña123|
    Then El Registro se completa
    |word|
    |The last step|
