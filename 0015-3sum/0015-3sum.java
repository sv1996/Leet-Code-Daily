class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
          Set<List<Integer>> result = new HashSet<>();
        if (arr.length == 0 || Objects.isNull(arr)) {
            return new ArrayList<>(result);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

            int j = i + 1;
            int k = arr.length - 1;

            while (j < k) {

                int sum = arr[i] + arr[j] + arr[k];
                if (sum == 0) {
                    result.add(Arrays.asList(arr[i], arr[j++], arr[k--]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }


        }
return new ArrayList<>(result);

//    Set<List<Integer>> result = new HashSet<>();
//         int length = nums.length;
//         for (int i = 0; i < length - 2; i++) {

//             for (int j = i + 1; j < length - 1; j++) {

//             for (int k = j + 1; k < length; k++) {
//                     if ((nums[i] + nums[j] + nums[k] == 0)) {
//                         List<Integer> list = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
//                         Collections.sort(list);
//                         result.add(list);
//                     }

//                 }

//             }


//         }


//         return new ArrayList<>(result);        
    }
}