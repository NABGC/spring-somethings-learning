package com.nabgc.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.nabgc.properties.basic.ExtendedPropertiesWithJavaIntegrationTest;
import com.nabgc.properties.external.ExternalPropertiesWithJavaIntegrationTest;

@RunWith(Suite.class)
@SuiteClasses({ //@formatter:off
    ExternalPropertiesWithJavaIntegrationTest.class,
    ExtendedPropertiesWithJavaIntegrationTest.class,
})// @formatter:on
public final class IntegrationTestSuite {
    //
}
