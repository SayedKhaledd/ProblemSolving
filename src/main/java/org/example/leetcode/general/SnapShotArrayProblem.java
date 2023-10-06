package org.example.leetcode.general;

import java.util.HashMap;
import java.util.TreeMap;

public class SnapShotArrayProblem {
    public static void main(String[] args) {
        int length = 3;
        SnapshotArray obj = new SnapshotArray(length);
        set(obj, 0, 5);
        System.out.println(snapshot(obj));
        set(obj, 0, 6);
        System.out.println(get(obj, 0, 0));

//        System.out.println(snapshot(obj));
//        System.out.println(snapshot(obj));
//        System.out.println(get(obj, 0, 2));
//        System.out.println(snapshot(obj));
//        System.out.println(snapshot(obj));
//        System.out.println(get(obj, 0, 0));


    }

    public static int snapshot(SnapshotArray obj) {
        return obj.snap();
    }

    public static void set(SnapshotArray obj, int index, int val) {
        obj.set(index, val);

    }

    public static int get(SnapshotArray obj, int index, int snap_id) {
        return obj.get(index, snap_id);
    }
}

class SnapshotArray {
    TreeMap<Integer, Integer> treeMap[];
    int snapId = 0;

    public SnapshotArray(int length) {
        treeMap = new TreeMap[length];
        for (int i = 0; i < length; i++) {
            treeMap[i] = new TreeMap<>();
            treeMap[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        treeMap[index].put(snapId, val);
    }


    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        return treeMap[index].floorEntry(snap_id).getValue();
    }
}

class SnapshotArray3 {
    HashMap<Integer, Integer> treeMap[];
    int snapId = 0;

    public SnapshotArray3(int length) {
        treeMap = new HashMap[length];
        for (int i = 0; i < length; i++) {
            treeMap[i] = new HashMap<>();
            treeMap[i].put(0, 0);
        }
    }

    public void set(int index, int val) {
        treeMap[index].put(snapId, val);
    }


    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        int x = snap_id;
        while (treeMap[index].get(x) == null && x > 0) {
            x--;
        }
        return treeMap[index].get(x);
    }
}