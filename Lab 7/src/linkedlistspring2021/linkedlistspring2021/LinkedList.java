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
public class LinkedList {
    private Node first;
    private Node last;

    
    LinkedList()
    {
        first = null;
    }
  
    public void deleteList()
    {
        first = null;
    }
    public void add(int x){
       
        Node temp  = new Node(x);
        
            temp.setNext(first);
            if(first != null)
               first.setPrev(temp);
            first = temp;   
       
    }
    public void print()
    {
        Node temp = first;
        Node n = last;

        while(temp !=  null)    
        {
            System.out.println(temp.getData());
            temp = temp.getNext();
            if (temp == n){
                break;
            }
        }
            
     }
    
    public void search(int index) {
        Node temp = first;

        while (temp != null) {
            //node element wasn't stored
            if (temp.getData() == index) {
                System.out.println("Found " + index);
                temp = temp.getNext();
                return;
            }
            else {
                System.out.println("Didn't find " + index);
                break;

            }
        }
    }

     public void printBack(Node last, int index) {
         Node temp = new Node(0);
         for (int i = last.getData(); i < index; i--) {
             if (last.getPrev() == null) {
                 break;
             }
             System.out.println(i);
         }

     }

    public void deleteNode(int x){
        Node temp = first;
        
        if(temp == null)
            return;
        
        if (temp.getData() == x)
        {
            first.getNext().setPrev(null);
            first = temp.getNext();
            return;
        }
        else{
           //lagptr = first;
            temp = temp.getNext();
        }
        while(temp !=  null)    
        {
            if (temp.getData() == x)
            {
                temp.getPrev().setNext(temp.getNext());
                temp.getNext().setPrev(temp.getPrev());
                return;
             }
            //lagptr = temp;
            temp = temp.getNext();
        }
        
        System.out.println("Didn't find " + x);
    }
}
