class CustomStack {
    private  int maxSize;
    private int[] stackArray;
    private int top;

    public CustomStack (int size) {
    this.maxSize = size;
    this.stackArray = new int [maxSize];
    this.top = -1;
    }

    public void push (int value) {
    if (top == maxSize - 1) {
        System.out.println ("Stack is full. Cannot push " + value);
    } else {
        stackArray[++top] = value;
    }
    }

    public int pop () {
        if (top == -1) {
            System.out.println ("Stack is empty. Cannot pop"); 
            return -1;
        } else {
            return stackArray[top--];
        }
    }

    public int peek () {
        if (top == -1) {
            System.out.println ("Stack is empty. Cannot peek"); 
            return -1;
        } else {
            return stackArray[top];
        }
    }

    public boolean isEmpty () {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        CustomStack stack = new CustomStack(4);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println ("Top element:" + stack.peek());

        System.out.println ("Popped element:" + stack.pop());
        System.out.println ("Popped element:" + stack.pop());

        System.out.println ("Is stack empty?" + stack.isEmpty());

        System.out.println ("Popped element:" + stack.pop());
        System.out.println ("Is stack empty?" + stack.isEmpty());        
    }
}

