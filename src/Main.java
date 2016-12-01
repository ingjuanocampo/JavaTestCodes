/**
 * Created by juan.ocampo on 01/12/2016.
 */
public class Main {

    public static void main(String[] args) {
        runTestTwoSum();
        runTwoAdd();

    }

    private static void runTwoAdd() {
        ListNode l1 = new ListNode(2);
        ListNode n4 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        l1.next = n4;
        n4.next = n3;

        ListNode l2 = new ListNode(5);
        ListNode n6 = new ListNode(6);
        ListNode n44 = new ListNode(4);
        l2.next = n6;
        n6.next = n44;



    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

    }


    /**
     * Runs the two sum test.
     */
    private static void runTestTwoSum() {
        int[] arrayToCheck = {8};
        int[] filter = twoSum(arrayToCheck, 8);
        System.out.print(String.format("Response %d, %d", filter[0], filter[1]));
    }

    /**
     * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
     * <p>
     * You may assume that each input would have exactly one solution.
     * Given nums = [2, 7, 11, 15], target = 9,
     * <p>
     * Because nums[0] + nums[1] = 2 + 7 = 9,
     * return [0, 1].
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] response = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num < target && num < target) {
                for (int j = 0; j < nums.length; j++) {
                    if (num + nums[j] == target) {
                        response[0] = j;
                        response[1] = i;
                        break;
                    }
                }

            }
        }
        return response;
    }
}
