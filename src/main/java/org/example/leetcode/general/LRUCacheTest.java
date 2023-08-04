package org.example.leetcode.general;

public class LRUCacheTest {
    public static void main(String[] args) {
        int capacity = 2;
//        LRUCache lRUCache = new LRUCache(capacity);
//        lRUCache.put(1, 1); // cache is {1=1}
//        lRUCache.put(2, 2); // cache is {1=1, 2=2}
//        System.out.println(lRUCache.get(1));    // return 1
//        System.out.println("her");
//        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        System.out.println(lRUCache.get(2));    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        System.out.println(lRUCache.get(1));    // return -1 (not found)
//        System.out.println(lRUCache.get(3));    // return 3
//        System.out.println(lRUCache.get(4));    // return 4

        LRUCache lRUCache = new LRUCache(2);
        System.out.println(lRUCache.get(2));    // return -1
        lRUCache.put(2, 6); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(1));    // return -1
        lRUCache.put(1, 5); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        lRUCache.put(1, 2); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(1));    // return 2
        System.out.println(lRUCache.get(2));    // return 6


    }
}


class LRUCache {
    int[][] arr;
    int max = 0;
    boolean full = false;

    public LRUCache(int capacity) {
        arr = new int[capacity][3];
        max = 1;
    }

    public int get(int key) {
        key--;
        if (!full)
            for (int i = 0; i < arr.length; i++) {
                if (arr[i][0] == key) {
                    arr[i][2] = ++max;
//                    System.out.println("returned " + i);
                    return arr[i][1];
                }
            }
        else if (key < arr.length) {
            arr[key][2] = ++max;
            return arr[key][1];

        }
        return -1;
    }

    public void put(int key, int value) {
        key--;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i][2] == 0 && key == i) {
                arr[i][0] = key;
                arr[i][1] = value;
                arr[i][2] = ++max;
//                System.out.println("inserted in " + i);
                return;
            }
        }
        int minIndex = getMin();
        arr[minIndex][0] = key;
        arr[minIndex][1] = value;
        arr[minIndex][2] = ++max;
        full = isFull();

    }

    private boolean isFull() {
        for (int[] ints : arr) {
            if (ints[2] == 0)
                return false;
        }
        return true;
    }


    private int getMin() {
        int min = Integer.MAX_VALUE, minIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (min >= arr[i][2]) {
                min = arr[i][2];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
