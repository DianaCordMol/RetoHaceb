package com.haceb.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/elements_validation.feature",
        glue = "com.haceb.stepDefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ElementsValidationRunner {


}
