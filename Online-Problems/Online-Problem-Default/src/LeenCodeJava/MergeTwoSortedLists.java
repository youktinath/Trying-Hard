/* Difficulty: EASY
 * Status: SOLVED
 * Merge two sorted linked lists and return it as a sorted list. 
 * The list should be made by splicing together the nodes of the first two lists.
 */
package LeenCodeJava;

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode sorted = new ListNode(0);
		ListNode currentNode = sorted;
		while (l1 != null && l2 != null) {
			if (l1.val >= l2.val) {
				currentNode.next = l2;
				l2 = l2.next;
			} else {
				currentNode.next = l1;
				l1 = l1.next;
			}
			currentNode = currentNode.next;
		}
		if (l1 != null) {
			currentNode.next = l1;
			l1 = l1.next;
		}
		if (l2 != null) {
			currentNode.next = l2;
			l2 = l2.next;
		}
		return sorted.next;
	}
}