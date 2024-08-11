public class StaticStack<T> {
    private int top = -1;
    private T[] data;

     @SuppressWarnings("unchecked")
    public StaticStack(int size) {
        data = (T[]) new Object[size];  // Criação de um array genérico
    }

    public void push(T element) {
        if (isFull()) {
            throw new StackOverflowError("A pilha está cheia");
        }
        data[++top] = element;
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("A pilha está vazia!");
        }
        return data[top--];
    }

    public void clear() {
        top = -1;
    }

    public boolean isFull() {
        return top == data.length - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}
