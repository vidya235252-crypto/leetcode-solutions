class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int bottom=matrix.length-1,left=0,top=0,right=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(top<=bottom && left<=right){
        for(int col=left;col<=right;col++){
            list.add(matrix[top][col]);
        }
        top++;
        for(int row=top;row<=bottom;row++){
            list.add(matrix[row][right]);
        }
        right--;
        if(top<=bottom){
        for(int col=right;col>=left;col--){
            list.add(matrix[bottom][col]);
        }
        bottom--;
        }
        if(left<=right){
        for(int row=bottom;row>=top;row--){
            list.add(matrix[row][left]);
        }
        left++;
        }
        }
        return list;
    }
}