class Solution {

    public boolean isAnagram(String s, String t) {
        if (Objects.isNull(s) || Objects.isNull(t)) {
            return false;
        }

        int n1 = s.length();
        int n2 = t.length();
        // check for length
        if (n1 != n2) {
            return false;
        }

        // using
        char ch1[] = s.toCharArray();
        Arrays.sort(ch1);

        char[] ch2 = t.toCharArray();
        Arrays.sort(ch2);

        for (int i = 0; i < ch1.length; i++) {
            if (ch1[i] != ch2[i]) {
                return false;
            }
        }

        return true;
    }
}
