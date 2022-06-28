package com.socraagile.kata.bankkatajavaspringcleanarchitecture.usecase;

import com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount.OpenAccountRequest;
import com.socraagile.kata.bankkatajavaspringcleanarchitecture.web.controler.BankAccountControler;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.assertThat;

public class BankAccountShould {

    @Autowired
    BankAccountControler controler;

    private String accountNumber;

    @Given("I don't have any account")
    public void i_don_t_have_any_account() {
    }
    @When("I open a new account")
    public void i_open_a_new_account() {
        var request = new OpenAccountRequest();
        var response = controler.openAccount(request);
        accountNumber = response.getBody().getAccountNumber();
    }
    @Then("I get his accountNumber")
    public void i_get_his_account_number() {
        assertThat(accountNumber).isNotNull().isNotEmpty();
    }
}
