package com.cake.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.cake.interview.LinkedListNode.*;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertSame;




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

    @Test
    public void linkedListWithNoCycleTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final boolean result = containsCycle(nodes[0]);
        assertFalse(result);
    }

    @Test
    public void cycleLoopsToBeginningTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        nodes[3].next = nodes[0];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void cycleLoopsToMiddleTest()  {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4, 5});
        nodes[4].next = nodes[2];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void twoNodeCycleAtEndTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4, 5});
        nodes[4].next = nodes[3];
        final boolean result = containsCycle(nodes[0]);
        assertTrue(result);
    }

    @Test
    public void emptyListTest() {
        final boolean result = containsCycle(null);
        assertFalse(result);
    }

    @Test
    public void oneElementLinkedListNoCycleTest() {
        final LinkedListNode node = new LinkedListNode(1);
        final boolean result = containsCycle(node);
        assertFalse(result);
    }

    @Test
    public void oneElementLinkedListCycleTest() {
        final LinkedListNode node = new LinkedListNode(1);
        node.next = node;
        final boolean result = containsCycle(node);
        assertTrue(result);
    }

    @Test
    public void shortLinkedListTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2});
        final LinkedListNode result = reverse(nodes[0]);
        assertTrue(isListReversed(result, nodes));
    }

    @Test
    public void longLinkedListTest() {
        final LinkedListNode[] nodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4, 5, 6});
        final LinkedListNode result = reverse(nodes[0]);
        assertTrue(isListReversed(result, nodes));
    }

    @Test
    public void oneElementLinkedListTest() {
        final LinkedListNode node = new LinkedListNode(1);
        final LinkedListNode result = reverse(node);
        assertSame(node, result);
    }

    @Test
    public void emptyLinkedListTest() {
        final LinkedListNode result = reverse(null);
        assertNull(result);
    }


    private static boolean isListReversed(LinkedListNode list, LinkedListNode[] originalNodes) {
        int i = originalNodes.length - 1;
        while (list != null && i >= 0) {
            if (originalNodes[i] != list) {
                return false;
            }
            list = list.next;
            i--;
        }
        return list == null && i == -1;
    }

    @Test
    public void firstToLastNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 1;
        final LinkedListNode actual = nthToTheLastNode2(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    @Test
    public void secondToLastNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 2;
        final LinkedListNode actual = nthToTheLastNode2(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }

    @Test
    public void firstNodeTest() {
        final LinkedListNode[] listNodes = valuesToLinkedListNodes(new int[] {1, 2, 3, 4});
        final int k = 4;
        final LinkedListNode actual = nthToTheLastNode2(k, listNodes[0]);
        final LinkedListNode expected = listNodes[listNodes.length - k];
        assertSame(expected, actual);
    }


    private static LinkedListNode[] valuesToLinkedListNodes(int[] values) {
        final LinkedListNode[] nodes = new LinkedListNode[values.length];
        for (int i = 0; i < values.length; i++) {
            nodes[i] = new LinkedListNode(values[i]);
            if (i > 0) {
                nodes[i - 1].next = nodes[i];
            }
        }
        return nodes;
    }

}
