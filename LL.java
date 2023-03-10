public class LL{
    Node head;
    class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    //add - can be first or last
public void addFirst(String data){
    Node newNode = new Node(data);

if(head ==null){
    head = newNode;
    return;
}
newNode.next= head;
head = newNode;
}

//add last 
public void addLast(String data){
    Node newNode = new Node(data);

if(head ==null){
    head = newNode;
    return;
}
Node currNode = head;
while(currNode.next != null){
    currNode = currNode.next;

}
currNode.next = newNode;
}

//print
public void printList(){
    Node currNode = head;
while(currNode != null){
    System.out.print(currNode.data + "->");
    currNode = currNode.next;

}
System.out.print("null");
}

//delete first
public void deleteFirst(){
    if(head== null){
        System.out.println("The list is empty");
   return;
    }
    head= head.next;
}
// delete last
public void deleteLast(){
    if(head== null){
        System.out.println("The list is empty");
   return;
    }
    if(head.next == null){
        head = null;
        return;
    }
    Node secondLast = head; 
    Node lastNode = head.next;
while(lastNode.next != null){
    lastNode = lastNode.next;
    secondLast = secondLast.next;
}
}

    public static void main(String args []){
LL list = new LL();
list.addFirst("a");
list.addFirst("is");
list.printList();
list.addLast("list");
list.printList();

list.addFirst("this");
list.printList();

list.deleteFirst();
list.printList();

    }
}