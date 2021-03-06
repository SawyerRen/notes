package topics.design;

import java.util.*;

public class Q380 {
}

class RandomizedSet {
    Map<Integer, Integer> map;
    List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        int index = map.get(val);
        if (index != list.size() - 1) {
            Integer last = list.get(list.size() - 1);
            list.set(index, last);
            map.put(last, index);
        }
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        return list.get(new Random().nextInt(list.size()));
    }
}