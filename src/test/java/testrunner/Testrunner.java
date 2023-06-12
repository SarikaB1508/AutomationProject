package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature",
glue ="stepdefsignin", tags= "@under-test",
plugin= {"pretty","html:target/HTmlreports.html"})

public class Testrunner {
	

}
