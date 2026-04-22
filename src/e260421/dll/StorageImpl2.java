package e260421.dll;

public class StorageImpl2<T, E> implements Storage<T> {
    private E entry;

    public E getEntry() {
        return this.entry;
    }

    public void setEntry(E entry) {
        this.entry = entry;
    }

    @Override
    public void add(T item, int index) {
    }

    @Override
    public T get(int index) {
        T obj = (T) (new Object());
        return obj;
    }

}
