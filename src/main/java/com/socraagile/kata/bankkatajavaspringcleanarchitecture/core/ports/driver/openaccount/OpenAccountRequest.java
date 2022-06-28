package com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount;

import an.awesome.pipelinr.Command;

public class OpenAccountRequest implements Command<OpenAccountResponse> {
    private String firstName;
    private String lastName;
    private int balance;
}
