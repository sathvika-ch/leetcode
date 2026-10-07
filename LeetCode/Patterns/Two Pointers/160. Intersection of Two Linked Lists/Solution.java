public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1 = 0;
        int len2 = 0;
        ListNode temp1 = headA;
        ListNode temp2 = headB; 
        while (temp1 != null) {
            temp1 = temp1.next;
            len1++;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            len2++;
        }
        temp1=headA;
        temp2=headB;
        if (len1 > len2) {
            int a = len1 - len2;
            while (a > 0) {
                temp1 = temp1.next;
                a--;
            }
        } 
        else {
            int b = len2 - len1;
            while (b > 0) {
                temp2 = temp2.next;
                b--;
            }
        }
        while (temp1 != temp2) {
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp2;
    }
}