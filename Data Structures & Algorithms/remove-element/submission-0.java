class Solution {
    public int removeElement(int[] nums, int val) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            if(i!=val){
                list.add(i);
            }
        }
        int k = 0;
        for(int i=0; i<list.size(); i++){
            nums[k] = list.get(i);
            k++;
        }

        return list.size();
    }
}