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
    private ListNode rotate(ListNode head){
        ListNode temp = head;
        if (head == null || head.next == null) {
            return head;
        }
        while (temp.next!=null && temp.next.next!=null){
            temp = temp.next;
        }
        temp.next.next = head;
        
        head = temp.next;
        temp.next = null;
        return head;
    }
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        if (count!=0){
            k = k % count;
        }
        
        while (k!=0){
            head = rotate(head);
            k--;
        }
        return head;
    }
}