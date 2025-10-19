package array;
import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<T> {
    // constant default size
    private static final int SIZE = 2;

    private int topIndex;
    private T[] data;

    // constructor no arg
    public MyStack() {
        this(SIZE);
    }

    // constructor with size
    public MyStack(int startSize) {
        topIndex = 0;
        data = (T[]) new Object[startSize];
    }

    // check size
    public int size() {
        return topIndex;
    }

    // push element
    public void push(T value) {
        if (size() == data.length)
            expand();
        data[topIndex] = value;
        topIndex++;
    }

    // pop element
    public T pop() {
        if (isEmpty())
            throw new EmptyStackException();
        T temp = data[--topIndex];
        data[topIndex] = null;
        return temp;
    }

    // top element
    public T peek() {
        if (isEmpty())
            throw new EmptyStackException();
        return data[topIndex - 1];
    }

    // check empty
    public boolean isEmpty() {
        return topIndex == 0;
    }

    // expand array
    private void expand() {
        data = Arrays.copyOf(data, data.length * 2);
    }

    // display all
    public void show() {
        if (isEmpty())
            System.out.println("Stack is empty");
        else {
            System.out.println("Stack elements:");
            for (int i = 0; i < topIndex; i++)
                System.out.println(data[i]);
 }
 }
  }
