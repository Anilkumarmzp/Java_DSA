// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

 class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;
            int sum = x + y + carry;

            carry = sum / 10; // Get carry for next digit
            current.next = new ListNode(sum % 10); // Store only the last digit
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry > 0) {
            current.next = new ListNode(carry);
        }

        return dummyHead.next;
    }

    // Helper function to print the linked list
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }

    // Helper function to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        // Test case 1
        ListNode l1 = createList(new int[]{2, 4, 3});
        ListNode l2 = createList(new int[]{5, 6, 4});
        ListNode result = solution.addTwoNumbers(l1, l2);
        printList(result); // Expected Output: 7 0 8

        // Test case 2
        l1 = createList(new int[]{0});
        l2 = createList(new int[]{0});
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // Expected Output: 0

        // Test case 3
        l1 = createList(new int[]{9, 9, 9, 9, 9, 9, 9});
        l2 = createList(new int[]{9, 9, 9, 9});
        result = solution.addTwoNumbers(l1, l2);
        printList(result); // Expected Output: 8 9 9 9 0 0 0 1
    }
}
