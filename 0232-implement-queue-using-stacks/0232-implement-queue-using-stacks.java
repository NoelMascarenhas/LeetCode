class MyQueue {
    
    Stack<Integer> stk1,stk2;
    public MyQueue() {
        stk1 = new Stack();
        stk2 = new Stack();
    }
    
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        while(stk1.size() > 1){
            stk2.push(stk1.pop());
        }
        int data = stk1.pop();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        return data;
    }
    
    public int peek() {
        while(stk1.size() > 1){
            stk2.push(stk1.pop());
        }
        int data = stk1.peek();
        while(!stk2.isEmpty()){
            stk1.push(stk2.pop());
        }
        return data;
    }
    
    public boolean empty() {
        return stk1.size()==0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */