class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder out = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (word.length() > 0) {
                    out.append(word.reverse()).append(" ");
                    word.setLength(0); 
                }
            } else {
                word.append(s.charAt(i));
            }
        }

        if (word.length() > 0) {
            out.append(word.reverse());
        }

        return out.toString();
    }
}
