class Computer {
    public void musicPlayer(){
        System.out.println("Music is playing..");
    }

    public String getMePen(int Cost){
        if(Cost>=10){
            return "Blue Pen";
        }
        else{
            return "Red Pen";
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.musicPlayer();
        String str = computer.getMePen(11);
        System.out.println(str);
    }
}