class Stack{
    static int size = 1000;
    static int a[]=new int[size];

    static int top = -1;
    static boolean isfull(){
        return top == size - 1;
    }
    static boolean isempty(){
        return top == -1;
    }
    static int peek(){
        if(isempty()){
            System.out.println("No peak element");
            return -1;
        }
        else{
            return a[top];
        }
    }
    static void push(int ele){
        if(isfull()){
            System.out.println("stack overflow");
        }
        else{
            a[++top] = ele;
        }
    }
    static int pop(){
        if(isempty()){
            System.out.println("stack underflow");
            return -1;
        }
        else{
            return a[top--];
        }
    }
    static void display(){
        if(isempty()){
            System.out.println("Stack is empty");
        }
        else{
            for(int i = top; i >= 0; i--){
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack stack = new Stack();
        display();
        System.out.println("stack is empty: " + isempty());
        push(10);
        push(20);
        display();
              System.out.println(pop());
        push(30);
        display(); 
        System.out.println("Top element is: " + peek()); 
        System.out.println("Popped element is: " + pop());
        display();
    }
}