
class Solution345 {
    public String reverseVowels(String s) {
        char[] ar = s.toCharArray();
        int k1 = 0, k2 = s.length() - 1;

        while (k1 < k2) {
            if (!isVowel(ar[k1])) {
                k1++;
                continue;
            }
            if (!isVowel(ar[k2])) {
                k2--;
                continue;
            }
            char temp = ar[k1];
            ar[k1] = ar[k2];
            ar[k2] = temp;
            k1++;
            k2--;
        }

        return new String(ar);
    }

    private boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
    }

    public static void main(String[] args) {
        Solution345 ob = new Solution345();
        System.out.println(ob.reverseVowels("IcecreAm"));
    }
};
