import java.util.ArrayList;

class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = digits.length - 1;
        if (digits[i] != 9) {
            digits[i] = digits[i] + 1;
            return digits;
        } else {
            while (i >= 0 && digits[i] == 9) {
                list.addLast(0);
                i--;
            }
        }
        if (i != -1) {
            digits[i] = digits[i] + 1;
        } else {
            list.addFirst(1);
        }
        for (; i >= 0; i--) {
            list.addFirst(digits[i]);
        }
        int ar[] = new int[list.size()];
        for (i = 0; i < ar.length; i++) {
            ar[i] = list.get(i);
        }
        return ar;
    }

    public static void main(String[] args) {
        Solution ob = new Solution();
        int ar[] = { 1, 0, 9, 0, 9 };
        ar = ob.plusOne(ar);
        for (int a = 0; a < ar.length; a++)
            System.out.println(ar[a]);
    }
}
