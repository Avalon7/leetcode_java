class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1, mid = (left + right) >> 1;
        while(left <= right){
		if(nums[mid] < target) left = mid + 1;
		else right = mid - 1;
		mid = (left + right) >> 1;
        }
	return left;
    }
}
