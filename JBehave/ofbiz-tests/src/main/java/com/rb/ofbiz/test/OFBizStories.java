package com.rb.ofbiz.test;

import com.rb.ofbiz.test.pages.PageFactory;
import com.rb.ofbiz.test.pages.SeleniumPageFactory;
import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.condition.ConditionRunner;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.embedder.StoryControls;
import org.jbehave.core.failures.FailingUponPendingStep;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.CrossReference;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.ParameterControls;
import org.jbehave.core.steps.spring.SpringApplicationContextFactory;
import org.jbehave.core.steps.spring.SpringStepsFactory;
import org.jbehave.web.selenium.*;
import org.springframework.context.ApplicationContext;

import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;
import static org.jbehave.core.reporters.Format.CONSOLE;
import static org.jbehave.core.reporters.Format.XML;

public class OFBizStories extends JUnitStories {

//    Selenium selenium = SeleniumConfiguration.defaultSelenium();
    //private ConditionRunner conditionRunner = SeleniumConfiguration.defaultConditionRunner(selenium);

    private Selenium selenium = SeleniumConfiguration.defaultSelenium();
    private ConditionRunner conditionRunner = SeleniumConfiguration.defaultConditionRunner(selenium);
    private PageFactory pageFactory = new SeleniumPageFactory(selenium,conditionRunner);
//    Selenium selenium = new DefaultSelenium("localhost", 4444, "*firefox", "http://www.google.com");

    public OFBizStories() {

        CrossReference crossReference = new CrossReference().withJsonOnly().withOutputAfterEachStory(true)
                .excludingStoriesWithNoExecutedScenarios(true);
        ContextView contextView = new LocalFrameContextView().sized(640, 120);
        SeleniumContext seleniumContext = new SeleniumContext();

        SeleniumStepMonitor stepMonitor = new SeleniumStepMonitor(contextView, seleniumContext,
                crossReference.getStepMonitor());
        Format[] formats = new Format[] { new SeleniumContextOutput(seleniumContext), WebDriverHtmlOutput.WEB_DRIVER_HTML, CONSOLE, XML };
        StoryReporterBuilder reporterBuilder = new StoryReporterBuilder()
                .withCodeLocation(codeLocationFromClass(OFBizStories.class)).withFailureTrace(true)
                .withFailureTraceCompression(true).withDefaultFormats().withFormats(formats)
                .withCrossReference(crossReference);

        Configuration configuration = new SeleniumConfiguration().useSelenium(selenium).useSeleniumContext(seleniumContext)
                .useFailureStrategy(new FailingUponPendingStep())
                .useStoryControls(new StoryControls().doResetStateBeforeScenario(false)).useStepMonitor(stepMonitor)
                .useStoryLoader(new LoadFromClasspath(OFBizStories.class))
                .useStoryReporterBuilder(reporterBuilder);
        useConfiguration(configuration);

        ApplicationContext context = new SpringApplicationContextFactory("ofbiz-steps.xml").createApplicationContext();
        ParameterControls mostUsefulConfiguration = new ParameterControls().useDelimiterNamedParameters(true);
        useStepsFactory(new SpringStepsFactory(configuration, context));

    }

//     @Override
//    public InjectableStepsFactory stepsFactory() {
//         CatalogSteps catalogSteps = new CatalogSteps(pageFactory);
//        catalogSteps.setHostname("www.google.com");
//        catalogSteps.setPort("80");
//
//        return new InstanceStepsFactory(configuration(),
//                catalogSteps);
//    }


    @Override
    protected List<String> storyPaths() {
        return new StoryFinder().findPaths(codeLocationFromClass(this.getClass()).getFile(), asList("**/" + System.getProperty("storyFilter", "*")
                + ".story"), null);
    }

}
