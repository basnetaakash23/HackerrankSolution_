/*
  Print elements of a linked list in reverse order 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    Node current = head;
    List<Integer> my_array = new ArrayList<Integer>();
    int i = 0;
    while(current.next!=null){
        my_array.add(i,current.data);
        current = current.next;
        i=i+1;
    }
    my_array.add(i, current.data);
    
    for(int j = i; j>=0; j=j-1){
        System.out.println(my_array.get(j));
    }

}
