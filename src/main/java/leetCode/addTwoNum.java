package leetCode;

import java.util.LinkedList;

public class addTwoNum {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode(0);
        ListNode tmp = answer;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int sum = carry;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            // 자릿수 변환
            if (sum >= 10) {
                answer.next = new ListNode(sum - 10);
                carry = 1;
            } else {
                answer.next = new ListNode(sum);
                carry = 0;
            }
            answer = answer.next;
        }

        if (carry == 1) {
            answer.next = new ListNode(1);
        }
        return tmp.next;
    }
}
