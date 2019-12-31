package com.cake.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.cake.interview.LinkedListNode.deleteNodeWhenGivenNode;



public class LinkedListNodeTest {

    @Test
    public void nodeAtBeginningTest() {
        LinkedListNode head = new LinkedListNode(1);
        appendToList(head, 2);
        appendToList(head, 3);
        appendToList(head, 4);

        deleteNodeWhenGivenNode(head);

        LinkedListNode node = head;
        assertEquals(2, node.value);

        node = node.next;
        assertEquals(3, node.value);

        node = node.next;
        assertEquals(4, node.value);

        assertNull(node.next);
    }

    @Test
    public void nodeInTheMiddleTest() {
        LinkedListNode head = new LinkedListNode(1);
        LinkedListNode nodeToDelete = appendToList(head, 2);
        appendToList(head, 3);
        appendToList(head, 4);

        deleteNodeWhenGivenNode(nodeToDelete);

        LinkedListNode node = head;
        assertEquals(1, node.value);

        node = node.next;
        assertEquals(3, node.value);

        node = node.next;
        assertEquals(4, node.value);

        assertNull(node.next);
    }
    

    private static LinkedListNode appendToList(final LinkedListNode head, int value) {
        LinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new LinkedListNode(value);
        return current.next;
    }
}
