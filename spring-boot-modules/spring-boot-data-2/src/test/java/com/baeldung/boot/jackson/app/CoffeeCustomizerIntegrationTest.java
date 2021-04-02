package com.nabgc.boot.jackson.app;

import com.nabgc.boot.jackson.config.CoffeeCustomizerConfig;
import org.springframework.context.annotation.Import;

@Import(CoffeeCustomizerConfig.class)
public class CoffeeCustomizerIntegrationTest extends AbstractCoffeeIntegrationTest {
}
