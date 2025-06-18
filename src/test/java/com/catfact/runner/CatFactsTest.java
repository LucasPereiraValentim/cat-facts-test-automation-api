package com.catfact.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"com.catfact.step"},
        plugin = {"html:src/test/resources/evidences/cucumber-report.html"}
)
public class CatFactsTest {

}
