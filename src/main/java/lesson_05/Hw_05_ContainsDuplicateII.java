package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class Hw_05_ContainsDuplicateII {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));
        int[] nums2 = {1, 2, 3, 1, 2, 3};
        int k1 = 2;
        System.out.println(containsNearbyDuplicate(nums2, k1));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }
}
