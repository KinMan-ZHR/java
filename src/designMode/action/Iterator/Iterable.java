package designMode.action.Iterator;

public interface Iterable<T> {
    Iterator<T> createIterator();
}