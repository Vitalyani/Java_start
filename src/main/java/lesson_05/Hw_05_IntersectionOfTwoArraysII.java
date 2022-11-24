package lesson_05;

import java.util.*;

public class Hw_05_IntersectionOfTwoArraysII {
    public static void main(String[] args) {
        int[] nums1 = {4, 9, 5}, nums2 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        List<Integer> intersection = new ArrayList<>();
        for (int j : nums2) {
            if (map.containsKey(j) && map.get(j) > 0) {
                intersection.add(j);
                map.put(j, map.get(j) - 1);
            }
        }
        int[] array = new int[intersection.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = intersection.get(i);
        }
        return array;
    }
}
