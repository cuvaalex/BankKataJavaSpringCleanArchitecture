package com.socraagile.kata.bankkatajavaspringcleanarchitecture.usecase;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/features/",
        dryRun = false,
        plugin = {
                "pretty", "html:target/cucumber.html", "json:target/cucumber.json", "rerun:target/cucumber-api.txt"
        }
)
public class CucumberFunctionalTest {
}
