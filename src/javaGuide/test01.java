package javaGuide;

import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;

/**
 * @author cuichenyang
 * @Description
 * @date 2019/10/11 15:38
 * @Copyright
 */
public class test01
{
    public static void main(String[] args)
    {
        int[] nums = {2, 2, 11, 15};
        int target = 4;
        int[] ints = twoSum(nums, target);
        int[] ints1 = twoNum2(nums, target);
        String s = Arrays.toString(ints);
        String s1 = Arrays.toString(ints1);
        System.out.println(s);
        System.out.println(s1);
    }

    public static int[] twoSum(int[] nums, int target)
    {
        int length = nums.length;
        int[] ints = null;
        for (int i = 0; i < length; i++)
        {
            for (int i1 = 0; i1 < length; i1++)
            {
                if (i != i1)
                {
                    if ((nums[i] + nums[i1]) == target)
                    {
                        ints = new int[]{i, i1};
                    }
                }
            }
        }
        return ints;
    }

    public static int[] twoNum2(int[] nums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        int length = nums.length;
        for (int i = 0; i < length; i++)
        {
            map.put(nums[i],i);
        }

        for (int i = 0; i < length; i++)
        {
            int num=target-nums[i];
            if(map.containsKey(num)&&map.get(num)!=i){
                return new int[]{i,map.get(num)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

}

