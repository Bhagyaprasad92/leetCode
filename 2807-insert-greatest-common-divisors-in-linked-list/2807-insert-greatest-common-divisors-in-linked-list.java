/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp = head;
        while(temp.next != null) {
            int value = gcd(temp.val, temp.next.val);
            ListNode node = new ListNode();
            node.val = value;
            ListNode tempCopy = new ListNode();
            tempCopy.val = temp.val;
            tempCopy.next = temp.next;
            temp.next = node;
            node.next = tempCopy.next;
            temp = tempCopy.next;
        }
        return head;
    }
    private int gcd(int a, int b) {
        return (b == 0) ? a : gcd(b, a % b);
    }
}