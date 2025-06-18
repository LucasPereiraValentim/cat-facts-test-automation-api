Feature: Breads

  Scenario: CT01 - Obter a lista de raças de gatos com os parâmetros padrão
    When é realizado o envio de uma requisição GET para o endpoint "/breeds"
    Then o status code do response deve ser 200
    And o response deve conter uma lista de raças de gatos
    And o response deve incluir detalhes da paginação

  Scenario: CT02 - Enviar um valor não numérico para o parâmetro page
    When é realizado o envio de uma requisição GET para o endpoint "/breeds?page=test"
    Then o status code do response deve ser 400