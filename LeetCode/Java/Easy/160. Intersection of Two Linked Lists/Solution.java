public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int len1 = 0;
        int len2 = 0;

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        // Find length of list A
        while (temp1 != null) {
            temp1 = temp1.next;
            len1++;
        }

        // Find length of list B
        while (temp2 != null) {
            temp2 = temp2.next;
            len2++;
        }

        // Reset pointers
        temp1 = headA;
        temp2 = headB;

        // Move longer list ahead
        if (len1 > len2) {
            int diff = len1 - len2;

            while (diff > 0) {
                temp1 = temp1.next;
                diff--;
            }
        } 
        else {
            int diff = len2 - len1;

            while (diff > 0) {
                temp2 = temp2.next;
                diff--;
            }
        }

        // Find intersection
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return temp1;
    }
}