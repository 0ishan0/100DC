package Linked_List;

public class delete {
    
    class node {
        node next;
        int data;
        
        node(int d) {
            data = d;
            next = null;
        }
    }
    
    node head;
    
    void front() {
        if(head == null) {
            System.out.println("List not available.");
            return;
        }
        head = head.next;
    }
    
    void end() {
        if(head == null) {
            System.out.println("List not available.");
            return;
        }
        if(head.next == null) {
            head = null;
            return;
        }
        node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }
    
    void pos(int n) {
        if (head == null) {
            System.out.println("List not available.");
            return;
        }
        node temp = head; 
        
        if (n == 0) { 
            head = temp.next; 
            return; 
        } 
        for (int i=0; temp!=null && i<n-1; i++) 
            temp = temp.next; 
        
        if (temp == null || temp.next == null) 
            return; 
        
        node next = temp.next.next; 
        temp.next = next;
    }
}
