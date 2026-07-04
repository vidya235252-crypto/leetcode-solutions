class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1=new HashMap<>();
        HashMap<String,Character> map2=new HashMap<>();
        String[] word=s.split(" ");
        if(pattern.length()!=word.length) return false;
        for(int i=0;i<pattern.length();i++){
            char pc=pattern.charAt(i);
            String sc=word[i];
            if(map1.containsKey(pc)){
                if(!map1.get(pc).equals(sc)) return false;
            }
            if(map2.containsKey(sc)){
                if(map2.get(sc)!=pc) return false;
            }
            map1.put(pc,sc);
            map2.put(sc,pc);
        }
        return true;
    }
}