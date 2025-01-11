package com.tests.easyges.hooks;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.tests.easyges.constants.DriverType;
import com.tests.easyges.factory.DriverManagerFactory;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Setup {

    private static WebDriver driver;
    private static final Logger LOGGER = LogManager.getLogger(Setup.class);

    /**
     * Initializes the WebDriver and sets up the browser before each test scenario.
     * This method is automatically called before the execution of each Cucumber scenario.
     *
     * @param scenario The current test scenario being executed.
     */
    @Before
    public void startDriver(Scenario scenario) throws IOException {
        LOGGER.info("Scenario: '{}' - started", scenario.getName());

        try {
            // Retrieve browser type from system property or default to Chrome
            String browser = System.getProperty("browser", DriverType.CHROME.name()).toUpperCase();

            // Validate and initialize the WebDriver
            driver = DriverManagerFactory.getManager(DriverType.valueOf(browser)).createDriver();
            LOGGER.info("WebDriver initialized successfully for browser: {}", browser);
        } catch (IllegalArgumentException e) {
            LOGGER.error("Invalid browser type specified: {}", System.getProperty("browser"), e);
            throw new RuntimeException("Failed to initialize WebDriver due to invalid browser type.", e);
        } catch (Exception e) {
            LOGGER.error("Unexpected error while initializing WebDriver.", e);
            throw new RuntimeException("WebDriver initialization failed.", e);
        }

    }

    /**
     * Getter for the WebDriver instance.
     *
     * @return The current WebDriver instance.
     */
    public static WebDriver getDriver() {
        if (driver == null) {
            throw new IllegalStateException("WebDriver is not initialized. Ensure startDriver() is called before use.");
        }
        return driver;
    }

    /**
     * Getter for the Logger instance.
     *
     * @return The Logger instance.
     */
    public static Logger getLogger() {
        return LOGGER;
    }
}

