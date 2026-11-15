class Main{
    public static void main(String[] args){
        int[][] matrix = {
            {1,2,3},
            {4,5,6}
        };
        int target = 2;
        int temp=0;
        for(int i=0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==target){
                    temp=1;
                }
            }
        }
        if(temp==1){
            System.out.println("found");
        }else{
            System.out.println("Not found");
        }
        
    }
}
