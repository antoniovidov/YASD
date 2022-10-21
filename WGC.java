package YASD.YASD;

public class WGC {
    static int boat = 1;
    static int wolf = 1;
    static int goat = 1;
    static int cabbage = 1;
    static int counting = 0;
    static boolean moreObjects = false;

      //Преброява стъпките и проверява дали от дясната страна има повече от един обект.
    public static void findOnlyOneObject(){
        counting++;

        if((goat == 10 && wolf != 10 && cabbage != 10) || (wolf == 10 && goat != 10 && cabbage != 10) || (cabbage == 10 && wolf != 10 && goat != 10)){
            moreObjects = true;
        } else moreObjects = (goat == 1 && wolf != 1 && cabbage != 1) || (wolf == 1 && goat != 1 && cabbage != 1) || (cabbage == 1 && wolf != 1 && goat != 1);
    }

    public static void main(String[] args) {
        while(!(wolf == 10 && goat == 10 && cabbage == 10 && boat == 10)){ //Върти цикъла докато всички обекти не са от дясно.
            for (int i = 1; i <= 3; i++) { //Обхожда всички обекти

                boat *= 10;
                System.out.print("Boat to RIGHT with ");

                if (i == 1 && wolf == 1) {
                    wolf *= 10;
                    System.out.println("Wolf ");
                }
                if (i == 2 && goat == 1) {
                    goat *= 10;
                    System.out.println("Goat");
                }
                if (i == 3 && cabbage == 1) {
                    cabbage *= 10;
                    System.out.println("Cabbage");
                }
                //Проверява дали всичко от левата страна е наред.
                if ((wolf == 1 && goat == 1 && boat == 10) || (goat == 1 && cabbage == 1 && boat == 10)) {

                    boat /= 10;
                    System.out.println("Boat to LEFT");

                    if (i == 1 && !moreObjects) {
                        wolf /= 10;
                        System.out.println("BAD MOVE: RETURNING WOLF TO LEFT");
                        System.out.println();
                    } else if (i == 1) {
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                        findOnlyOneObject();
                    }
                    if (i == 2 && !moreObjects) {
                        goat /= 10;
                        System.out.println("BAD MOVE: RETURNING GOAT");
                        System.out.println();
                    }

                    if (i == 3 && !moreObjects) {
                        cabbage /= 10;
                        System.out.println("BAD MOVE: RETURNING CABBAGE");
                        System.out.println();
                    } else if (i == 3) {
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                        findOnlyOneObject();
                    }
                    // Проверява за проблеми на дясната страна на реката.
                }
                else if ((wolf == 10 && goat == 10 && boat == 1) || (goat == 10 && cabbage == 10 && boat == 1)) {
                    boat /= 10;
                    System.out.println("Boat to LEFT");

                    if (i == 1 && !moreObjects) {
                        wolf /= 10;
                        System.out.println("BAD MOVE: RETURNING WOLF");
                        System.out.println();
                    } else if (i == 1) {
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                        findOnlyOneObject();
                    }
                    if (i == 2 && moreObjects) {
                        goat /= 10;
                        System.out.println("BAD MOVE: RETURNING GOAT");
                        System.out.println();
                    }
                    if (i == 3 && !moreObjects) {
                        cabbage /= 10;
                        System.out.println("BAD MOVE: RETURNING CABBAGE");
                        System.out.println();
                    } else if (i == 3) {
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                        findOnlyOneObject();
                    }
                    // Проверява за потенциални конфликти
                }
                else if ((goat == 10 && wolf == 10 && boat == 10 && cabbage != 10) || (goat == 10 && cabbage == 10 && boat == 10 && wolf != 10)){
                    findOnlyOneObject();
                    boat /=10;
                    System.out.println("Boat to LEFT");
                    if(i == 1){
                        goat /= 10;
                        System.out.println("Goat ot LEFT");
                    }
                    if(i == 2 && wolf == 10){
                        wolf /= 10;
                        System.out.println("Wolf to LEFT");
                    } else if(i == 2 && cabbage == 10){
                        cabbage /= 10;
                        System.out.println("Cabbage to LEFT");
                    }
                    if (i == 3){
                        goat /= 10;
                        System.out.println("Goat to LEFT");
                    }
                    findOnlyOneObject();
                    // Проверява за потенциални конфликти
                }
                else if ((goat == 1 && wolf == 1 && boat == 1 && cabbage != 1) || (goat == 1 && cabbage == 1 && boat == 1 && wolf != 1)) {
                    findOnlyOneObject();
                    boat *=10;
                    System.out.println("Boat to RIGHT");
                    if(i == 1){
                        goat *= 10;
                        System.out.println("Goat ot LEFT");
                    }
                    if(i == 2 && wolf == 1){
                        wolf *= 10;
                        System.out.println("Wolf to LEFT");
                    } else if(i == 2 && cabbage == 1){
                        cabbage *= 10;
                        System.out.println("Cabbage to LEFT");
                    }
                    if (i == 3){
                        goat *= 10;
                        System.out.println("Goat to LEFT");
                    }
                    findOnlyOneObject();
                }
                else {
                    if(goat != 10 || wolf != 10 || cabbage != 10 || boat != 10){
                        findOnlyOneObject();
                        boat /= 10;
                        System.out.println("Boat to LEFT");
                    } else {
                        findOnlyOneObject();
                        i++;
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Wolf: " + wolf);
        System.out.println("Goat: " + goat);
        System.out.println("Cabbage: " + cabbage);
        System.out.println("Boat: " + boat);
        System.out.println();
        System.out.println("Done in " + counting + " moves");
    }

}
