public class task4 {
    public static void main(String[] args) {
        String[] massaiv = new String[] { "gdhgfh", "hjfhgfhg", "khggfhg" };
        System.out.println(longestCommonPrefix(massaiv));

    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }
}
