package com.socraagile.kata.bankkatajavaspringcleanarchitecture.web.controler;

import an.awesome.pipelinr.Pipeline;
import org.springframework.beans.factory.annotation.Autowired;

public class BaseController {

    @Autowired
    protected Pipeline pipeline;
}
