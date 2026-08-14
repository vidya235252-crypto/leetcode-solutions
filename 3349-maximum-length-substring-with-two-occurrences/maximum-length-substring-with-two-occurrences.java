class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        int left=0,size=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
                map.put(s.charAt(left),map.get(s.charAt(left))-1);
                left++;
            }
            size=Math.max(size,i-left+1);
        }
        return size;
    }
}