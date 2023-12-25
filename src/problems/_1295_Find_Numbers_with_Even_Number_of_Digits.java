package problems;

public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int result=0;
        for(int num:nums) if(((int)Math.log10(num)+1 & 1) == 0) result++;
        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {12, 345, 2, 6, 7896};
        int[] nums2 = {555, 901, 482, 1771};

        System.out.println(findNumbers(nums1));
        System.out.println(findNumbers(nums2));
    }
}
