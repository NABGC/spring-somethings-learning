package com.nabgc.boot.jackson.app;

import com.nabgc.boot.jackson.config.CoffeeHttpConverterConfiguration;
import org.springframework.context.annotation.Import;

@Import(CoffeeHttpConverterConfiguration.class)
public class CoffeeHttpConverterIntegrationTest extends AbstractCoffeeIntegrationTest {
}
