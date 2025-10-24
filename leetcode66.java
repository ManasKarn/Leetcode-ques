
class Solution66 {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static void main(String[] args) {
        Solution66 ob = new Solution66();
        int ar[] = { 9, 9, 9 };
        ar = ob.plusOne(ar);
        for (int a = 0; a < ar.length; a++)
            System.out.println(ar[a]);
    }
}
