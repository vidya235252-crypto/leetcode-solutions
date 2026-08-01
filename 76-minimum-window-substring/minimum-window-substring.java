class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length())
        return "";
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char c:t.toCharArray()){
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        int left=0,right=0;
        int have=0,need=map1.size(),bestlen=Integer.MAX_VALUE,bestleft=-1;
        while(right<s.length()){
            char c=s.charAt(right);
            map2.put(c,map2.getOrDefault(c,0)+1);
            if(map1.containsKey(c) && map2.get(c).equals(map1.get(c)))
            have++;
            while(have==need){
                if((right-left+1)<bestlen){
                    bestlen=right-left+1;
                    bestleft=left;
                }
                char leftchar=s.charAt(left);
                map2.put(leftchar,map2.get(leftchar)-1);
                if(map1.containsKey(leftchar) && map2.get(leftchar)<map1.get(leftchar))
                have--;
                left++;
            }
            right++;
        }
        if(bestleft==-1)
        return "";
        else
        return s.substring(bestleft,bestleft+bestlen);
    }
}