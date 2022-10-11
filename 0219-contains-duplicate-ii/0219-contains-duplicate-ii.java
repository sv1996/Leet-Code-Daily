class Solution {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        if (Objects.isNull(nums)) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                {
                    return true;
                }
            } else {
                map.put(nums[i], i);
            }
        }

        return false;
        //         for (int i = 0; i < nums.length; i++) {
        //             for (int j = i + 1; j < nums.length; j++) {
        //                 if (nums[i] == nums[j]) {
        //                     if (i - j <= k) {
        //                         return true;
        //                     }
        //                 }
        //             }
        //         }

        //         return false;
    }
}
