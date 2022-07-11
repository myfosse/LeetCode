package m2_add_two_numbers;

public class Main {
  public static void main(String[] args) {

    Solution solution = new Solution();

    ListNode l1_1_1 = new ListNode(9);

    ListNode l1_2_10 = new ListNode(9);
    ListNode l1_2_9 = new ListNode(9, l1_2_10);
    ListNode l1_2_8 = new ListNode(9, l1_2_9);
    ListNode l1_2_7 = new ListNode(9, l1_2_8);
    ListNode l1_2_6 = new ListNode(9, l1_2_7);
    ListNode l1_2_5 = new ListNode(9, l1_2_6);
    ListNode l1_2_4 = new ListNode(9, l1_2_5);
    ListNode l1_2_3 = new ListNode(9, l1_2_4) ;
    ListNode l1_2_2 = new ListNode(9, l1_2_3);
    ListNode l1_2_1 = new ListNode(1, l1_2_2);


    ListNode l2_1_1 = new ListNode(0);
    ListNode l2_2_1 = new ListNode(0);


    ListNode l3_1_4 = new ListNode(9);
    ListNode l3_1_3 = new ListNode(9, l3_1_4);
    ListNode l3_1_2 = new ListNode(9, l3_1_3);
    ListNode l3_1_1 = new ListNode(9, l3_1_2);

    ListNode l3_2_7 = new ListNode(9);
    ListNode l3_2_6 = new ListNode(9, l3_2_7);
    ListNode l3_2_5 = new ListNode(9, l3_2_6);
    ListNode l3_2_4 = new ListNode(9, l3_2_5);
    ListNode l3_2_3 = new ListNode(9, l3_2_4);
    ListNode l3_2_2 = new ListNode(9, l3_2_3);
    ListNode l3_2_1 = new ListNode(9, l3_2_2);

    System.out.println(solution.addTwoNumbers(l1_1_1, l1_2_1));
    System.out.println(solution.addTwoNumbers(l2_1_1, l2_2_1));
    System.out.println(solution.addTwoNumbers(l3_1_1, l3_2_1));
  }
}
