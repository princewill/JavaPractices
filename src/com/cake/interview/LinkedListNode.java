package com.cake.interview;

import sun.awt.image.ImageWatched;

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

    public static boolean containsCycle(LinkedListNode startNode){
        LinkedListNode fastRunner = startNode;
        LinkedListNode slowRunner = startNode;

        while(fastRunner != null && fastRunner.next != null) {
            fastRunner = fastRunner.next.next;
            slowRunner = slowRunner.next;

            if(fastRunner == slowRunner) return true;
        }

        return false;
    }

    public static LinkedListNode reverse(LinkedListNode headOfList) {

        LinkedListNode currentNode = headOfList;
        LinkedListNode nextNode = null;
        LinkedListNode prevNode = null;

        while(currentNode != null) {

            nextNode = currentNode.next;
            currentNode.next = prevNode;

            prevNode = currentNode;
            currentNode = nextNode;
        }



        return prevNode;
    }

    public static LinkedListNode nthToTheLastNode1(LinkedListNode headNode, int n){
        LinkedListNode headOfStick = headNode;
        LinkedListNode tailOfStick = headNode;

        for(int i = 0; i< n-1; i++){
            if(headOfStick == null) return null;
            headOfStick = headOfStick.next;
        }

        while(headOfStick != null){
            headOfStick = headOfStick.next;
            tailOfStick = tailOfStick.next;
        }

        return tailOfStick;
    }

    public static LinkedListNode nthToTheLastNode2(int n, LinkedListNode headNode){

        int lengthOfLinkedList = 1;
        LinkedListNode currentNode = headNode;

        while(currentNode != null){
            currentNode = currentNode.next;
            lengthOfLinkedList++;
        }

        if(n > lengthOfLinkedList) return null;

        int howFarToGo = lengthOfLinkedList - n;

        currentNode = headNode;

        for(int i = 0; i < howFarToGo; i++){
            currentNode = currentNode.next;
        }
        return currentNode;
    }

}


