public class Main {
    public static void main(String[] args) {
        int myArray[] = {2,8,7,8,4};
        myArray[0] = 5;
        System.out.println(myArray[0]);

        int[] myDynamicArray = new int[4];
        myDynamicArray[0] = 1;
        myDynamicArray[1] = 2;
        myDynamicArray[2] = 3;
        myDynamicArray[3] = 4;
//        System.out.println(myDynamicArray[0]);
//        System.out.println(myDynamicArray[1]);
//        System.out.println(myDynamicArray[2]);
//        System.out.println(myDynamicArray[3]);
        for(int i = 0; i<4; i++){
            System.out.println("value of myDynamicArray = " + myDynamicArray[i]);
        }
    }
}