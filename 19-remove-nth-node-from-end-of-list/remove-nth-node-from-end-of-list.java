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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = new ListNode(head.val, head.next);
        ListNode root = null;
        int count=0, c=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.println(count);
        if(count == 1){
            return root;
        }
        root = head;
        if(count != n){
            while(head!=null){
                c++;
                if(c==(count-n)){
                    head.next = head.next.next;
                }
                head = head.next;
            }
        }else{
            return head.next;
        }
        return root;
    }
}