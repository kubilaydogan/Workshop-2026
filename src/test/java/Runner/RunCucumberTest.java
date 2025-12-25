package Runner;

import org.junit.platform.suite.api.*;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "@day4 and not @ignore")
@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME, value = "not @ignore")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "StepDefinitions")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "summary, " +
                "html:target/cucumber-reports/cucumber-report.html, " +
                "junit:target/cucumber-reports/cucumber.xml, " +
                "json:target/cucumber-reports/cucumber.json, " +
                "rerun:target/rerun.txt, " +
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
)
public class RunCucumberTest {
}



// OLD VERSION

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
//import org.junit.runner.RunWith;
//
//@RunWith(Cucumber.class)
//@CucumberOptions(
//        tags = "@day4 and not @ignore",
//        tags = "not @ignore",
//        features = {"src/test/resources/Features"},
//        glue = {"StepDefinitions"},
//        plugin = {
//                "html:target/Cucumber-JVM-Reports/cucumber-reports/html-report",
//                "junit:target/Cucumber-JVM-Reports/cucumber-reports/cucumber.xml",
//                "json:target/json-report/cucumber.json",
//                "rerun:target/rerun.txt",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//        },
//        monochrome = true,
//        dryRun = false,
//        publish = true
//)
//public class RunCucumberTest {
//}
