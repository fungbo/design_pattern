package com.tw.design_parttern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ForbiddenCityTest {

    @Test
    void should_get_same_instance_when_multiple_requests() {
        ForbiddenCity instance1 = ForbiddenCity.getInstance();
        ForbiddenCity instance2 = ForbiddenCity.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}
