class Solution {
    public boolean containsDuplicate(int[] nums) {
        
               if(Objects.isNull(nums) || nums.length ==0)
        {
            return false;
        }

        
        
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            // if set contains any duplicates
            if( set.contains(nums[i])){
                return true;

            }

            set.add(nums[i]);

        }

return false;
        
        
        
    }
}