package com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.internal.cleanarch.usecases;

import an.awesome.pipelinr.Command;
import com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount.OpenAccountRequest;
import com.socraagile.kata.bankkatajavaspringcleanarchitecture.core.ports.driver.openaccount.OpenAccountResponse;
import org.springframework.stereotype.Component;

@Component
public class OpenAccountUseCase implements Command.Handler<OpenAccountRequest, OpenAccountResponse> {
    @Override
    public OpenAccountResponse handle(OpenAccountRequest command) {
        throw new UnsupportedOperationException();
    }

}
