class Solution {

    public int missingNumber(int[] nums) {
        //         int length = nums.length;
        //         int Totalsum =0;
        //         for(int i=0;i<=length;i++)
        //         {
        //             Totalsum = Totalsum+ i;
        //         }
        //         int lessSum =0;

        //         for(Integer s : nums)
        //         {
        //             Totalsum = Totalsum - s;
        //         }
        //         return  Totalsum;
        // XOR Operation
        //           int length = nums.length;
        //         int xorValue = 0;
        //         for (int i = 0; i <= length; i++) {
        //             xorValue = xorValue ^ i;
        //         }

        //         for (Integer a : nums) {
        //             xorValue = xorValue ^ a;
        //         }
        // return xorValue;

        // using map
        int length = nums.length;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i <= length; i++) {
            map.put(i, false);
        }

        for (int a : nums) {
            if (map.containsKey(a)) {
                map.put(a, true);
            }
        }
int ans = Integer.MIN_VALUE;
        for (Map.Entry a : map.entrySet())
        {
            if ((Boolean) a.getValue() == false)
            {
                ans= (Integer)a.getKey();
            }
        }
        
 return ans;
    }
}
