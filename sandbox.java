class sandbox {

    private static String repeatSubstringPattern(String s) {
        int n = s.length();
        for (int i = 2; i < n; i++) {
            for (int j = 1; j * i < n; j++) {
                System.out.println(s.substring(j * i, (j + 1) * i));
                if (!s.substring(0, i).equals(s.substring(j * i, (j + 1) * i))) {
                    return s.substring(j * i, (j + 1) * i);
                }
            }
            return "true";
        }
        return "false";
    }

    public static void main(String[] args) {
        System.out.println(repeatSubstringPattern("abab"));
    }
}