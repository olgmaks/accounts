package com.epam.lab.accounts.e2e.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class WebDriverProperties {

    @Value("${webdriver.path}")
    private String webDriverPath;

    public String getWebDriverPath() {
        return webDriverPath;
    }

}
