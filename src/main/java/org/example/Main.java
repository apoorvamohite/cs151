package org.example;

import org.example.design_patterns.exercise2.ChocolateBoilerEnum;

public class Main {
    public static void main(String[] args) {
        OrderedPair<String, Integer> op = new OrderedPair<>("abc", 3);
        System.out.println(compare(new OrderedPair<>("abc", 1), new OrderedPair<>("xyz", "jhbd")));
    }

    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        return p1.getKey().equals(p2.getKey()) &&
                p1.getValue().equals(p2.getValue());
    }

}

interface Pair<K, V> {
    public K getKey();
    public V getValue();
}
class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;
    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
}
