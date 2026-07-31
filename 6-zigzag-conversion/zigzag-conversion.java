class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] rows=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            rows[i]=new StringBuilder();
        }
        int currow=0;
        boolean down=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            rows[currow].append(c);
            if(currow==0)
            down=true;
            else if(currow==numRows-1)
            down=false;
            currow+=down?1:-1;
        }
        StringBuilder result=new StringBuilder();
        for(int i=0;i<numRows;i++){
            result.append(rows[i]);
        }
        return result.toString();
    }
}