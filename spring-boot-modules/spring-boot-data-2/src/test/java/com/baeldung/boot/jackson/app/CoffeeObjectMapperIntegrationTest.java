package com.nabgc.boot.jackson.app;

import com.nabgc.boot.jackson.config.CoffeeObjectMapperConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeObjectMapperConfig.class)
public class CoffeeObjectMapperIntegrationTest extends AbstractCoffeeIntegrationTest {
}
