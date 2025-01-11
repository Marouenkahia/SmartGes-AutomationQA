package com.tests.easyges.factory;

import com.tests.easyges.utils.ConfigFileReader;
import com.tests.easyges.utils.ProxyUtils;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.logging.Logger;

public class ChromeDriverManager implements DriverManager {

    private static final Logger LOGGER = Logger.getLogger(ChromeDriverManager.class.getName());
    private final ConfigFileReader configFileReader;

    public ChromeDriverManager() {
        this.configFileReader = new ConfigFileReader();
    }

    @Override
    public WebDriver createDriver() {
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--start-maximized");
            configureProxy(chromeOptions);
            LOGGER.info("ChromeDriver initialized with options: " + chromeOptions.toString());
            return new ChromeDriver(chromeOptions);
        } catch (Exception e) {
            LOGGER.info("Failed to create ChromeDriver: " + e.getMessage());
            throw new RuntimeException("Error initializing ChromeDriver", e);
        }
    }

    /**
     * Configures proxy settings for ChromeOptions.
     *
     * @param chromeOptions ChromeOptions to configure.
     */
    private void configureProxy(ChromeOptions chromeOptions) {
        String proxyUrl = configFileReader.getProperty("url.proxy");
        String proxyPort = configFileReader.getProperty("port.proxy");

        if (proxyUrl == null || proxyPort == null) {
            LOGGER.warning("Proxy configuration is missing or incomplete. Proceeding without proxy.");
            return;
        }

        try {
            String httpProxy = proxyUrl + ":" + proxyPort;
            String sslProxy = proxyUrl + ":" + proxyPort;

            Proxy proxy = ProxyUtils.getHttpAndSslProxy(httpProxy, sslProxy);
            chromeOptions.setCapability("proxy", proxy);
            LOGGER.info("Proxy configured: HTTP = " + httpProxy + ", SSL = " + sslProxy);
        } catch (IllegalArgumentException e) {
            LOGGER.severe("Invalid proxy configuration: " + e.getMessage());
            throw e;
        }
    }
}

