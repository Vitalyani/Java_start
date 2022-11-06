package lesson_01;

public class hw_01_removeElement {
    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        //System.out.println(Arrays.toString(nums));
        return k;
    }
    public static void main(String[] args) {
        int[] arr = { 3, 2, 2, 3 };
        int val = 3;
        System.out.println(removeElement(arr, val));
    }
}
