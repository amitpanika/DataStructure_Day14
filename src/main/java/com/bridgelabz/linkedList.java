package com.bridgelabz;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        this.next= null;
    }

}
public class linkedList {
    Node head;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        newNode.next= head;
        head = newNode;
    }
    public void addLast(int data) {
            Node cureentNode = head;
            while (cureentNode.next != null){
                cureentNode = cureentNode.next;
            }
            Node myNode = new Node(data);
            cureentNode.next = myNode;
    }
    public void printlist(){
        Node cureentNode = head;
        while (cureentNode != null){
            System.out.print(cureentNode.data +" -> ");
            cureentNode = cureentNode.next;
        }
        System.out.println("NUll");
    }
    public void insertElement(int data,int poss){
        Node newNode= new Node( data);
        Node currNode= head;
        for (int i=0; i<(poss-1); i++){
            currNode=currNode.next;
        }
        newNode.next=currNode.next;
        currNode.next=newNode;
    }
    public void deleteElement(int data){
        if ( head == null){
            System.out.println("empty");
        }
           head = head.next;
        }


        public static void main (String[]args){
            linkedList linkedList = new linkedList();
            linkedList.addFirst(60);
            linkedList.addFirst(17);
            linkedList.insertElement(30,2);
            linkedList.printlist();
            linkedList.deleteElement(30);
            linkedList.printlist();
        }
    }

