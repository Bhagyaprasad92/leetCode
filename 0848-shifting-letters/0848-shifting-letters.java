class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        char[] arr = s.toCharArray();
        int prev = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            prev = (prev + shifts[i]) % 26;
            arr[i] = (char)((arr[i] - 'a' + prev) % 26 + 'a');
        }
        return new String(arr);
    }
}