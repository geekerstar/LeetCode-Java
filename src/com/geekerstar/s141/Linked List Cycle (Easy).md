给定一个链表，判断链表中是否有环。

使用双指针，一个指针每次移动一个节点，一个指针每次移动两个节点，如果存在环，那么这两个指针一定会相遇。
```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode l1 = head,l2 = head.next;
        while(l1 != null && l2 != null && l2.next != null){
            if(l1 == l2){
                return true;
            }else{
                l1 = l1.next;
                l2 = l2.next.next;
            }
        }
        return false;
    }
}
```