class Solution {
    public int removeElement(int[] nums, int val) {
        //in place
        int nonValIndex = 0;

        //if 1st element is the val
        int i = 0;
        while(i<nums.length){
            if(nums[i]!=val){
                //replace
                nums[nonValIndex] = nums[i];
                i++;
                nonValIndex++;
            }
            else{
                i++;
            }
        }

        System.out.println(Arrays.toString(nums));

        return nonValIndex;
    }
}