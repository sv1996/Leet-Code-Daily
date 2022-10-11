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
          int length = nums.length;
        int xorValue = 0;
        for (int i = 0; i <= length; i++) {
            xorValue = xorValue ^ i;
        }

        for (Integer a : nums) {
            xorValue = xorValue ^ a;
        }
return xorValue;
        
    }
}