class Node {
    int data;
    Node next;

    Node(int  val)
    {
        data = val;
        next = null;
    }
}
class LinkedList{
    Node head;
    void insertatbeg(int ele)
    {
        Node newnode = new Node(ele);
        if(head == null)
        {
            head = newnode;
            return;
        }
        else{
            newnode.next = head;
            head = newnode;
        }   
    }
    void insertatend(int ele)
    {
        Node newnode = new Node(ele);
        if(head == null)
        {
            head = newnode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newnode;
        }
    }
    void display(){
        if(head == null)
        {
            System.out.println("LinkedList is empty");
            return;
        }
        else{
            Node temp = head;
            while(temp != null)
            {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertatend(30);
        ll.insertatend(40);
        ll.insertatbeg(10);
        ll.insertatbeg(20);
        ll.display(); // Output: 20 10 30 40
    }

}