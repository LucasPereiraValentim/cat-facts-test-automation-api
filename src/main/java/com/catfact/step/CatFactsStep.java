package com.catfact.step;

import com.catfact.logic.BreedLogic;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import java.util.List;

import static com.catfact.utils.Assert.*;

public class CatFactsStep {

    private BreedLogic breedLogic;

    private Response response;

    @Before
    public void before() {
        this.breedLogic = new BreedLogic();
    }

    @When("é realizado o envio de uma requisição GET para o endpoint {string}")
    public void when_e_realizado_o_envio_de_uma_requisicao_get(String endpoint){
        this.response = this.breedLogic.listarBreads(endpoint);
    }

    @Then("o status code do response deve ser {int}")
    public void then_o_status_code_do_response(int statusCode) {
        checkEquals(statusCode, this.response.statusCode());
    }

    @And("o response deve conter uma lista de raças de gatos")
    public void and_o_response_deve_conter_uma_lista_de_raças_de_gatos() {
        List<String> breads = this.response.jsonPath().getList("data");
        checkNotNull(breads);
        checkFalse(breads.isEmpty());
    }

    @And("o response deve incluir detalhes da paginação")
    public void o_response_deve_incluir_detalhes_da_paginacao() {
        Integer currentPage = this.response.jsonPath().getInt("current_page");
        Integer lastPage = this.response.jsonPath().getInt("last_page");

        checkNotNull(currentPage);
        checkNotNull(lastPage);

        checkTrue(currentPage > 0);
        checkTrue(lastPage > 0);
    }
}
