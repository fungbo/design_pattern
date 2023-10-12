package com.tw.design_parttern.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class WildGoosePagodaTest {

    @Test
    void should_get_same_instance_of_wild_goose_pagoda_when_multiple_requests() {
        WildGoosePagoda instance1 = WildGoosePagoda.getInstance();
        WildGoosePagoda instance2 = WildGoosePagoda.getInstance();

        assertNotNull(instance1);
        assertNotNull(instance2);
        assertSame(instance1, instance2);
    }
}
