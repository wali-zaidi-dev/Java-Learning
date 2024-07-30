class For {
    public static void main(String[] args) {
      for(int x = 4; x>=1; x--){
          System.out.println("Hello X : " + x);
      }

        for(int y = 1; y<=4; y++){
            System.out.println("Hello Y : " + y);
        }
        for(int z = 0; z<4; z++){
            System.out.println("Hello Z : " + z);
        }
        for(int w = 0; w<=3; w++){
            System.out.println("Hello W : " + w);
        }
        for(int day = 1; day<=5; day++){
            System.out.println("Day: " + day);
            for(int hour = 1; hour<=9; hour++){
                System.out.println("Hour: " + (hour+8) + "-" + (hour+9));
            }
        }
    }
}