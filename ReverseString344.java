class ReverseString344 {
    public static void reverseString(char[] s) {
        int n = s.length;
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }

        String reversedString1 = String.valueOf(s);
        System.out.println("Reversed String: " + reversedString1);
    }

    public static void main(String args[]) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reverseString(s);
    }
}
