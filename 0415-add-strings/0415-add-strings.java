class Solution {
    public String addStrings(String num1, String num2) {
         int i = num1.length() - 1;
        int j = num2.length() - 1;
        int sum;
        StringBuilder ans = new StringBuilder();
        int carry = 0;
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) {
                sum = sum + num1.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum = sum + num2.charAt(j) - '0';
                j--;
            }
            ans.append(sum % 10);
            carry = sum / 10;

        }

        if (carry > 0) {
            ans.append(carry);
        }

        return ans.reverse().toString();
        
    }
}