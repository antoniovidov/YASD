package YASD.YASD.Seventeenth_of_October;

public class WGC {
    public static void main(String[] args) {
        int boat = 2;
        int goat = 1;
        int wolf = 2;
        int cabbage = 3;
        int count = 0;
        boolean tooMuch = false;

        while (goat==1 || wolf==2 || cabbage==3){
            for (int i = 0; i < 3; i++) {
                System.out.println(">>> Let's go with: "+ i +"-objects: ");
                boat*=10;
                if(i==1 && goat==10){
                    goat*=10;
                }
                if(i==2 && wolf==20){
                    wolf*=10;
                }
                if(i==3 && cabbage==30){
                    cabbage*=10;
                }
                if(wolf==2 && goat==1 && boat==20 || goat==1 && cabbage==3 && boat==20){
                    tooMuch=true;
                    boat/=10;

                    if(goat==10 && boat==2 && wolf==30 || goat==10 && boat==2 && cabbage==30){
                        goat/=10;
                    }
                    if(i==1 && wolf==30){
                        wolf/=10;
                    }
                    if(i==2 && goat==10){
                        goat/=10;
                    }
                    if (i == 3 && cabbage == 30) {
                        cabbage/=10;
                    }
                    System.out.println("Wrong!!");
                }
                boat/=10;
                if(i==5 && tooMuch==true){
                    boat=2;
                    goat*=10;
                    wolf*=10;
                    boat*=10;
                    cabbage*=10;
                    count++;

                    System.out.println("["+ count +"] right");
                }

            }
        }

    }
}
