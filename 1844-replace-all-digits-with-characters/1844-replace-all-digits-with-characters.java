class Solution {
    public String replaceDigits(String s) {
        char[] arr = s.toCharArray();
        for(int i = 1; i < arr.length; i += 2) {
            arr[i] = shift(arr[i - 1], arr[i]);
        }
        return new String(arr);
    }
    public char shift(char c, char shiftCount) {
        return (char) (((int)c) + (shiftCount - '0'));
    }
}