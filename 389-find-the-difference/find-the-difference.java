class Solution {
    public char findTheDifference(String s, String t) {
        char res=0;
        for(char j:s.toCharArray()) res^=j;
        for(char i:t.toCharArray()) res^=i;
        return res;
    }
}