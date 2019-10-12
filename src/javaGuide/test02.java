package javaGuide;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cuichenyang
 * @Description 寻找两个有序数组的中位数
 * @date 2019/10/12 9:54
 * @Copyright
 */
public class test02
{
    public static void main(String[] args)
    {
        int[] nums1 = new int[]{1, 3, 2, 5, 4, 1, 4, 8};
        int[] nums2 = new int[]{2, 5, 4, 7, 1, 6};
        double num = findMedianSortedArrays(nums1, nums2);
        System.out.println(num);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2)
    {
        if (Objects.nonNull(nums1) && Objects.nonNull(nums2))
        {
            ArrayList<Integer> list = new ArrayList<>();
            for (int i : nums1)
            {
                list.add(i);
            }
            for (int i : nums2)
            {
                list.add(i);
            }
            List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
            System.out.println(collect);
            int size = collect.size();
            if (size % 2 == 0)
            {
                int i = size / 2;
                double num = (double) (collect.get(i) + collect.get(i - 1)) / 2;
                return num;
            }
            double num = collect.get(size / 2);
            return num;
        }
        return 0.0;
    }


}
