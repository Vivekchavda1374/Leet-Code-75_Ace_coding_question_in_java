class Solution {
    List<String> res = new ArrayList<>();
    StringBuffer path = new StringBuffer();
    String[] buttons = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if(digits == null || digits.length() == 0) return res;

        traverse(digits, 0);
        return res;
    }

    private void traverse(String digits, int start)
    {
        if(path.length() == digits.length())
        {
            res.add(path.toString());
            return;
        }

        for(int i = start; i < digits.length(); i++)
        {
            int currDigit = digits.charAt(i) - '0';
            String possibleNumbers = buttons[currDigit];

            for(char c : possibleNumbers.toCharArray())
            {
                path.append(c);
                traverse(digits, i + 1);
                path.deleteCharAt(path.length() - 1);
            }
        }
    }
}