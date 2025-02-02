public class Main {
    public static void main(String[] args) {
        String orig = "Hello, World!";
        String orig2 = "StringBuilder Version!";
        String reversed = reverseString(orig);
        String reversed2 = reverseStringSB(orig2);
        System.out.printf("%s becomes %s\n", orig, reversed);
        System.out.printf("%s becomes %s\n", orig2, reversed2);
    }

//    public static String reverseString(String str) {
//        char[] chars = str.toCharArray();
//        int left = 0, right = chars.length - 1;
//        while (left < right) {
//            char temp = chars[left];
//            chars[left] = chars[right];
//            chars[right] = temp;
//            left++;
//            right--;
//        }
//        return new String(chars);
//    }

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            result += chars[i];
        }
        return result;
    }

    public static String reverseStringSB(String str) {
        char[] chars = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            result.append(chars[i]);
        }
        return result.toString();
    }
}