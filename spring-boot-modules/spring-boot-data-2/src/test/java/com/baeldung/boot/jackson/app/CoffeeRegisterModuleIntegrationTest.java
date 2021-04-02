package com.nabgc.boot.jackson.app;

import com.nabgc.boot.jackson.config.CoffeeRegisterModuleConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeRegisterModuleConfig.class)
public class CoffeeRegisterModuleIntegrationTest extends AbstractCoffeeIntegrationTest {
}
