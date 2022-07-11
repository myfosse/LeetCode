package m2_add_two_numbers;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0;

        ListNode sumNode = new ListNode();
        ListNode copyNode = sumNode;

        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            ListNode newNode = new ListNode();
            newNode.val = sum % 10;
            copyNode.next = newNode;
            copyNode = newNode;

            sum /= 10;
        }

        return sumNode.next;
    }
}

class ListNode {
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

    @Override
    public String toString() {
        StringBuilder str1 = new StringBuilder().append(val);
        ListNode node1 = this;
        while (node1.next != null) {
            node1 = node1.next;
            str1.append(node1.val);
        }
        return str1.toString();
    }
}