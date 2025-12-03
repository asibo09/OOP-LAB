package it.unibo.inner.impl;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import it.unibo.inner.api.IterableWithPolicy;
import it.unibo.inner.api.Predicate;

public class IterableWithPolicyImpl<T> implements IterableWithPolicy<T> {

    private final List<T> elements;
    private Predicate<T> predicate;

    public IterableWithPolicyImpl(T[] element){
        this(element, new Predicate<T>() {
            @Override
            public boolean test(T elem) {
                return true;
            }     
        });
    }


    public IterableWithPolicyImpl(T[] element, Predicate<T> predicate) {
        this.elements=List.of(element);
        this.predicate = predicate;
    }


    @Override
    public Iterator<T> iterator() {
        return new InnerIterator();
    }

    @Override
    public void setIterationPolicy(Predicate<T> filter) {
        this.predicate=filter;
    }

    

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append("[");
        for (var elem : this) {
            sb.append(elem + "; ");
        }
        sb.append("]");
        return sb.toString();
    }

    private class InnerIterator implements Iterator<T>{

        int index=0;

        @Override
        public boolean hasNext() {
            while (index<elements.size()) {
                T element= elements.get(index);
                if (predicate.test(element)) {
                    return true;
                }
                index++;
            }
             return false;
        }

        @Override
        public T next() {
            if (hasNext()) {
                return elements.get(index++);
            }
            throw new NoSuchElementException();
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException();
        }

    }

}

