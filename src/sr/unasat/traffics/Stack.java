package sr.unasat.traffics;

public class Stack {
    private int maxSize;
    private long[] carArray;
    private int top;

    public Stack(int s) {
        maxSize = s;
        carArray = new long[maxSize];
        top = -1;
    }

    public void push(long j) {
        carArray[++top] = j;
    }

    public long pop() {
        return carArray[top--];
    }

    public long peek() {
        return carArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }
}
