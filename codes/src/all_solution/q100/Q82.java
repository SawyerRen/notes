package all_solution.q100;

import model.ListNode;

public class Q82 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        ListNode left = head, right = head;
        while (right != null) {
            while (right != null && left.val == right.val) {
                right = right.next;
            }
            if (left.next == right) {
                cur.next = left;
                cur = cur.next;
                left.next = null;
            }
            left = right;
        }
        return dummy.next;
    }
}
