package com.haceb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/products_verification.feature",
        glue = "com.haceb.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ProductsVerificationRunner {

}
