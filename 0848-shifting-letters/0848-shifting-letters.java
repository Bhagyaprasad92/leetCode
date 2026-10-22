class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        long totalShifts = 0;
        for (int i : shifts)
            totalShifts += i;
        StringBuilder sb = new StringBuilder();
        char firstC = (char) ((s.charAt(0) - 'a' + totalShifts % 26) % 26 + 'a');
        sb.append(firstC);
        System.out.println(firstC);
        System.out.println(sb);
        long prev = shifts[0] % 26;
        for (int i = 1; i < s.length(); i++) {
            char currChar = (char) ((s.charAt(i) - 'a' + (totalShifts - prev) % 26) % 26 + 'a');
            sb.append(currChar);
            prev += shifts[i] % 26;
        }
        return sb.toString();
    }
}