package Main;

import java.util.Scanner;

public class implement {
    
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
    
    public void insert_front(int d) {
        node new_node = new node(d);
        new_node.next = head;
        head = new_node;
    }
    
    public void insert_end(int d) {
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
    
    public void insert_pos(int d,int n) {
        if(n == 1) {
            insert_front(d);
            return;
        }
        node new_node = new node(d);
        node temp = head;
        int c=2;
        while(n != c) {
            temp = temp.next;
            c++;
        }
        new_node.next = temp.next;
        temp.next = new_node;
    }
    
    void delete_front() {
        if(head == null) {
            System.out.println("List not available.");
            return;
        }
        head = head.next;
    }
    
    void delete_end() {
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
    
    void delete_pos(int n) {
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
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        implement llist = new implement();
        int n, d, ch=1;
        while(ch != 0) {
            System.out.println("0. Exit\n"
                    + "1. Insert front\n"
                    + "2. Insert end\n"
                    + "3. Insert in position\n"
                    + "4. Delete front\n"
                    + "5. Delete end\n"
                    + "6. Delete in position\n"
                    + "7. Traverse");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch) {
                case 0: 
                    System.out.println("Thank You!");
                    break;
                case 1: 
                    System.out.println("Enter the element to be inserted: ");
                    d = sc.nextInt();
                    llist.insert_front(d);
                    System.out.println();
                    break;
                case 2: 
                    System.out.println("Enter the element to be inserted: ");
                    d = sc.nextInt();
                    llist.insert_end(d);
                    System.out.println();
                    break;
                case 3: 
                    System.out.println("Enter the element to be inserted: ");
                    d = sc.nextInt();
                    System.out.println("Enter the position: ");
                    n = sc.nextInt();
                    llist.insert_pos(d, n);
                    System.out.println();
                    break;
                case 4: 
                    llist.delete_front();
                    System.out.println("Node delete.\n");
                    break;
                case 5: 
                    llist.delete_end();
                    System.out.println("Node delete.\n");
                    break;
                case 6: 
                    System.out.println("Enter the position: ");
                    n = sc.nextInt();
                    llist.delete_pos(n);
                    System.out.println("Node deleted.\n");
                    break;
                case 7:
                    System.out.println("The list is: ");
                    llist.traverse();
                    System.out.println();
                    break;
                default:
                    System.out.println("Wrong choice. Try again.\n");
            }
        }
    }
}
