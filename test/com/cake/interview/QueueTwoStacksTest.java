package com.cake.interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;




public class QueueTwoStacksTest {
    @Test
    public void basicQueueOperationsTest() {
        final QueueTwoStacks q = new QueueTwoStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        assertEquals(1, q.dequeue());
        assertEquals(2, q.dequeue());
        q.enqueue(4);
        assertEquals(3, q.dequeue());
        assertEquals(4, q.dequeue());
    }


}
