package com.nabgc.boot.jackson.app;

import com.nabgc.boot.jackson.config.CoffeeJacksonBuilderConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeJacksonBuilderConfig.class)
public class CoffeeJacksonBuilderIntegrationTest extends AbstractCoffeeIntegrationTest {
}
