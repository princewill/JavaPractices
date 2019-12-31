package com.cake.interview;

public class LinkedListNode {

    int value;

    LinkedListNode next = null;

    LinkedListNode(int value){
        this.value = value;
    }

    LinkedListNode(int value, LinkedListNode nextNode){
        this.value = value;
        this.next = nextNode;
    }

    void addToTail(int value){
        LinkedListNode tailNode = new LinkedListNode(value);
        LinkedListNode node = this;
        while(node.next != null) node = node.next;
        node.next = tailNode;
    }

    public static void deleteNodeWhenGivenNode(LinkedListNode nodeToDelete){
        if(nodeToDelete.next == null) {
            nodeToDelete = null;
        }
        else {
            nodeToDelete.next = nodeToDelete.next.next;
            nodeToDelete.value = nodeToDelete.next.value;
        }
    }

    public static LinkedListNode deleteNodeWhenGivenValueAndHead(LinkedListNode head, int value){
        LinkedListNode currentNode = head;
        if(currentNode.value == value) return currentNode.next;
        else {
            while(currentNode.next != null) {
                if(currentNode.value == value) {
                    currentNode.next = currentNode.next.next;
                    currentNode.value = currentNode.next.value;
                    return currentNode;
                }
                currentNode = currentNode.next;
            }
        }
        return currentNode;
    }

}


