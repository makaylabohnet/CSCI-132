/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlistspring2021;

/**
 *
 * @author Hunter
 */
public class Node {
    private int data;
    private Node next;
    private Node prev;
    
    public Node(int d){ data = d;}
    public Node getNext(){return next;}
    public void setNext(Node temp) {next = temp;}
    public Node getPrev(){return prev;}
    public void setPrev(Node temp) { prev = temp;}
    public int getData(){return data;}
}
