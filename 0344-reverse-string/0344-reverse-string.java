class Solution {

    public void reverseString(char[] s) {
                int startIndex =0;

                int endIndex = s.length-1;

                while(startIndex<=endIndex)
                {
                    char temp = s[startIndex];
                    s[startIndex] = s[endIndex];
                    s[endIndex] = temp;
                    startIndex++;
                    endIndex--;
                }

//         String str = s.toString();

//         StringBuilder sb = new StringBuilder(str);
//         sb.reverse().toString().toCharArray();
    }
}
