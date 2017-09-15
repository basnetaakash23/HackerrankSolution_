/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
  // Complete this method
    int pos = 0;
    Node current = head;
    Node previous = null;
    
    if(position == 0 && head.next == null){
        return null;
    }
    
    if(head==null){
        return null;
    }
    
    while(current.next!=null){
        pos = pos + 1;
        current = current.next;
        if(pos==position){
            previous.next = current.next;
       
        }
        previous = current;
        
    }
    return head;
    

}