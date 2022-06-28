package com.socraagile.kata.bankkatajavaspringcleanarchitecture.web.controler;

import com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount.OpenAccountRequest;
import com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount.OpenAccountResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
public class BankAccountControler extends BaseController {

    @PostMapping("/bank-accounts")
    public ResponseEntity<OpenAccountResponse> openAccount(@RequestBody OpenAccountRequest accountRequest){
        var response = pipeline.send(accountRequest);
        return new ResponseEntity<OpenAccountResponse>(response, CREATED);
    }
}
