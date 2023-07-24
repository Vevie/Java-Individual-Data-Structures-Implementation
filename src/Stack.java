import java.util.ArrayList;
import java.util.List;

public class Stack<T> {
    private List<T> items;

    public Stack() {
        items = new ArrayList<>();
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void push(T item) {
        items.add(item);
    }

    public T pop() {
        if (!isEmpty()) {
            return items.remove(items.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }

    public T peek() {
        if (!isEmpty()) {
            return items.get(items.size() - 1);
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }

    public int size() {
        return items.size();
    }
}
