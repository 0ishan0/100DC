package Linked_List;

public class insert {

    class node {
        node next;
        int data;
        
        node(int d) {
            data = d;
            next = null;
        }
    }
    
    node head;
    
    public void traverse() {
        node temp = head;
        while(temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void front(int d) {
        node new_node = new node(d);
        new_node.next = head;
        head = new_node;
    }
    
    public void end(int d) {
        if(head == null) {
            head = new node(d);
            return;
        }
        node new_node = new node(d);
        new_node.next = null;
        node temp = head;
        while(temp.next != null)
            temp = temp.next;
        temp.next = new_node;
    }
    
    public void pos(int d,int n) {
        if(n == 1) {
            front(d);
            return;
        }
        node new_node = new node(d);
        node temp = head.next;
        int c=2;
        while(n != c) {
            temp = temp.next;
            c++;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }
}
