package com.nabgc.conditionalonproperty;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import com.nabgc.conditionalonproperty.config.NotificationConfig;
import com.nabgc.conditionalonproperty.service.EmailNotification;
import com.nabgc.conditionalonproperty.service.NotificationSender;

public class NotificationUnitTest {

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner();

    @Test
    public void whenValueSetToEmail_thenCreateEmailNotification() {
        this.contextRunner.withPropertyValues("notification.service=email")
            .withUserConfiguration(NotificationConfig.class)
            .run(context -> {
                assertThat(context).hasBean("emailNotification");
                NotificationSender notificationSender = context.getBean(EmailNotification.class);
                assertThat(notificationSender.send("Hello From nabgc!")).isEqualTo("Email Notification: Hello From nabgc!");
                assertThat(context).doesNotHaveBean("smsNotification");
            });
    }
}
