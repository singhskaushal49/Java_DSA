package LeetCode_solution;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {
	class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        Set<Integer> visited = new HashSet<>();
	        for(int i = 0; i < nums.length; i++){
	            if(visited.contains(nums[i])){
	                return true;
	            }
	             else {
	                visited.add(nums[i]);
	             }
	        }
	        return false;
	    }
	}
}

// https://leetcode.com/problems/contains-duplicate/