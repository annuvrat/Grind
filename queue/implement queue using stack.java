
public class MyQueue {
    private Stack<Integer> instack;
    private Stack<Integer> outstack;
    
    public MyQueue() {
        instack = new Stack<>();
        outstack = new Stack<>();
    }
    
    public void push(int x) {
        instack.push(x);
    }
    
    public int pop() {
        shiftStacks();
        // if (outstack.isEmpty()) throw new RuntimeException("Queue is empty");
        return outstack.pop();
    }
    
    public int peek() {
        shiftStacks();
        // if (outstack.isEmpty()) throw new RuntimeException("Queue is empty");
        return outstack.peek();
    }
    
    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();
    }
    
    // Private helper to shift values from instack to outstack
    private void shiftStacks() {
        if (outstack.isEmpty()) {
            while (!instack.isEmpty()) {
                outstack.push(instack.pop());
            }
        }
    }
}
