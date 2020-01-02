package com.cake.interview;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class MaxStackTest {
    @Test
    public void maxStackTest() {
        final MaxStack s = new MaxStack();
        s.push(5);
        assertEquals(5, s.getMax());
        s.push(4);
        s.push(7);
        s.push(7);
        s.push(8);
        assertEquals(8, s.getMax());
        assertEquals(8, s.pop());
        assertEquals(7, s.getMax());
        assertEquals(7, s.pop());
        assertEquals( 7, s.getMax());
        assertEquals( 7, s.pop());
        assertEquals( 5, s.getMax());
        assertEquals(4, s.pop());
        assertEquals( 5, s.getMax());
    }
}
