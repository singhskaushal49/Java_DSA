package LeetCode_solution;

import java.util.HashMap;
import java.util.Map;

import Lec5.For_loops;

class Solution {
	
	
    public int[] twoSum(int[] nums, int target) {
        Map <Integer , Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length;i++){
            int diff = target - nums[i];
        
           if(map.containsKey(diff)){
              return new int[] {map.get(diff),i};
           }
           map.put(nums[i], i);
        }
        return null;
    }

}

// https://leetcode.com/problems/two-sum/




