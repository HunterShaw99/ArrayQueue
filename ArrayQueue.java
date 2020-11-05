import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue<T> implements Queue<T> {
  private Object [] queue;
  private int size;
  private int front;
  private int back;
  private int arrayCapacity;
  public static final int DEFAULT_CAPACITY = 25;

    public ArrayQueue() {
        this(DEFAULT_CAPACITY);
    }

    public ArrayQueue(int arrayCapacity) {
        this.arrayCapacity = arrayCapacity;
        queue = new Object[arrayCapacity];
    }

    @Override
    public boolean add(T obj) {
        if (size == arrayCapacity-1) {
            resizeArray(arrayCapacity*2);
        }
        queue[back] = obj;
        back = (back + 1)%arrayCapacity;
        size++;
        return true;
    }

    @Override
    public boolean offer(T obj) {
        try {
            return add(obj);
        } catch (Exception ex) {
            return false;
        }
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public T remove() {
        if (size == 0) {
            throw new NoSuchElementException("Empty queue");
        }
        Object o = queue[front];
        front = (front + 1)%arrayCapacity;
        size--;
        return (T)o;
    }

    @Override
    public T poll() {
        try {
            return remove();
        } catch (NoSuchElementException ex) {
            return null;
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    public T element() {
        if (size == 0) {
            throw new NoSuchElementException("Empty queue");
        }
        return (T)queue[front];
    }

    @Override
    public T peek() {
        try {
            return element();
        } catch (NoSuchElementException ex) {
            return null;
        }
    }

    @Override
    public boolean contains(T obj) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        size = 0;
        queue = new Object[arrayCapacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void resizeArray(int newCapacity) {
        Object [] arr = new Object[newCapacity];
        int index = front;
        int i = 0;
        while (index != back) {
            arr[i] = queue[index];
            i++;
            index = (index + 1)%arrayCapacity;
        }
        front = 0;
        back = size;
        arrayCapacity = newCapacity;
    }

    @Override
    public Object[] toArray() {
      Object [] arr = new Object[size];
      for (int i = front; i < size;)
    }

    @SuppressWarnings("unchecked")
    @Override
    public T[] toArray(T[] a) {
        return (T[])Arrays.copyOf(this.toArray(), size, a.getClass());
    }

}
