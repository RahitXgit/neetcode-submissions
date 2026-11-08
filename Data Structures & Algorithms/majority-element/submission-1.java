class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr = nums[0];
        int count = 1; 
        for(int i=0; i<nums.length; i++){
            if(curr!=nums[i]){
                curr = nums[i];
                count = 1;
            }

            if(count> nums.length/2)return nums[i];

            if(curr == nums[i]){
                count++;
            }
        }

        return -1;

    }
}