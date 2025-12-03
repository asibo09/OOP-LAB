package it.unibo.collections.comparators;

import java.util.Comparator;

public class CompareeSet implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Double.compare(Double.parseDouble(o1), Double.parseDouble(o2));
        // 1 if o1 > o2, 0 if o2 == o1, -1 otherwise
    }

}
