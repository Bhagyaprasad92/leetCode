class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int st = 0; st < arr.length; st += 2 * k) {
            int i = st;
            int j = Math.min(st + k - 1, arr.length - 1);
            while (i < j) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        return new String(arr);
    }
}