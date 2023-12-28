# PROBLEM NAME: Add Two Numbers
# DIFFICULTY: MEDIUM
# STATUS: SOLVED
'''
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.
'''



def addTwoNumber(l1, l2):
    max_len = max(len(l1), len(l2))

    l1_mod = l1 + (max_len - len(l1)) * [0]
    l2_mod = l2 + (max_len - len(l2)) * [0]

    carry = 0
    out_list = []

    for i in range(max_len):
        add_val = l1_mod[i] + l2_mod[i] + carry
        out_list.append(add_val % 10)
        carry = add_val // 10
    
    if carry:
        out_list.append(carry)
    
    return out_list

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def addTwoNumber(l1, l2):
    dummy = ListNode()
    cur = dummy

    carry = 0
    while l1 or l2 or carry:
        val1 = l1.val if l1 else 0
        val2 = l2.val if l2 else 0

        add_val = val1 + val2 + carry
        carry = add_val // 10
        cur.next = ListNode(add_val % 10)

        cur = cur.next
        l1 = l1.next if l1 else None
        l2 = l2.next if l2 else None
    
    return dummy.next


if __name__ == "__main__":
    # l1 = [9, 9, 9, 9, 9]
    # l2 = [9, 9]

    # print(addTwoNumber(l1, l2))

    ln = ListNode(4)
    ln.next = ListNode(5)
    ln.next.next = ListNode(3)
    ln.next.next.next = None

    print(ln.next.next.val)
