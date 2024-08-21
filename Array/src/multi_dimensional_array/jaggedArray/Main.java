package multi_dimensional_array.jaggedArray;

public class Main {
    public static void main(String[] args){
       int[][] nums = new int[3][]; // jagged array of 3 rows
       nums[0] = new int[3];
       nums[1] = new int[2];
       nums[2] = new int[1];

       for(int i = 0; i < nums.length; i++){
           for(int j = 0; j < nums[i].length; j++){
               nums[i][j] = (int) (Math.random() * 10);
               System.out.print(nums[i][j] + " ");
           }
           System.out.println();
       }
        System.out.println("===Break Here===");
        // Enhanced for() loop
       for(int[] row : nums){
           for(int col : row){
              System.out.print(col + " ");
           }
           System.out.println();
       }

    }
}
