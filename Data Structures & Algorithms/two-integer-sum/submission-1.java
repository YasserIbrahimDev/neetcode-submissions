class Solution {

    private int[] findMax(int index1, int index2){
        if(index1 < index2){
            return new int[]{index1, index2};
        }
        return new int[]{index2, index1};
    }

    public int[] twoSum(int[] nums, int target) {

        int size = nums.length;
        HashMap<Integer,Integer>  seen = new HashMap<>();
        for(int i = 0; i < size; i++){
            int complement = target - nums[i];
            if(seen.containsKey(complement)){
                return this.findMax(i,seen.get(complement));
            }
            seen.put(nums[i],i);
        }
        return new int[]{};
        
    }
}
