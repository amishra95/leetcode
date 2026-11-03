class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.push(x); // Always push into first stack
    }

    public int pop() {
        // Transfer elements only when second is empty
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop()); // Move elements from first to second
            }
        }

        return second.pop(); // Front element of the queue
    }

    public int peek() {
        // Transfer elements only when second is empty
        if (second.isEmpty()) {
            while (!first.isEmpty()) {
                second.push(first.pop()); // Move elements from first to second
            }
        }

        return second.peek(); // Front element of the queue
    }

    public boolean empty() {
        return first.isEmpty() && second.isEmpty();
    }
}
