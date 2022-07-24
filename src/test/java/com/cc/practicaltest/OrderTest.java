package com.cc.practicaltest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import com.cc.practicaltest.model.Order;

@RunWith(MockitoJUnitRunner.class)
public class OrderTest {
    @Test
    public void testOrder() {
        Order testOrder = new Order(1L, 1L, 1L, 0.00f, 0.00f, LocalDateTime.now());
        Long result = testOrder.getOrderNumber();
        assertThat(result).isEqualTo(1);
    }
}
