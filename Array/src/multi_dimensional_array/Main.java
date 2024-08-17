package multi_dimensional_array;

public class Main {
    public static void main(String[] args) {
        int[][] myArray = new int[3][4];
        for(int row = 0; row <3; row++ ){
            for(int col = 0; col <3; col++){
                myArray[row][col]= (int) (Math.random() * 10);
                System.out.print(myArray[row][col]+" ");
            }
            System.out.println();
        }
    }

}
