package com.tw.design_parttern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BellTowerTest {

    @Test
    void should_get_same_instance_when_multiple_requests() {
        BellTower instance1 = BellTower.getInstance();
        BellTower instance2 = BellTower.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}
