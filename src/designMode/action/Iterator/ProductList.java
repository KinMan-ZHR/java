package designMode.action.Iterator;

import java.util.ArrayList;
import java.util.List;
 
// 聚合对象
class ProductList<T> implements Iterable<T> {
    private List<T> products;
    private int position;
 
    public ProductList() {
        products = new ArrayList<>();
        position = 0;
    }
 
    public void addProduct(T product) {
        products.add(product);
    }
 
    @Override
    public boolean hasNext() {
        return position < products.size();
    }
 
    @Override
    public T next() {
        if (hasNext()) {
            T product = products.get(position);
            position++;
            return product;
        }
        return null;
    }

    @Override
    public Iterator<T> createIterator() {
        return new MyIterator<>(this);
    }
    private static class MyIterator<T> implements Iterator<T> {
        private final List<T> collection;
        private int currentIndex = 0;

        public MyIterator(List<T> collection) {
            this.collection = collection;
        }

        @Override
        public boolean hasNext() {
            return currentIndex < collection.items.size();
        }

        @Override
        public T next() {
            if (!hasNext()) {
                throw new IllegalStateException("No more elements to iterate.");
            }
            return collection.items.get(currentIndex++);
        }
    }
}
}
 