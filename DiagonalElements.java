class Main{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {1,2,6}
        };
     
     
        for(int i=0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(i==j){
                    System.out.println(matrix[i][j]);
                }
            }
        }
       
        
    }
}
