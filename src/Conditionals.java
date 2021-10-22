public class Conditionals {

    public static boolean chimpTrouble(boolean aSmile, boolean bSmile){
        return aSmile == bSmile;
    }
    public static boolean negPos(int x,int y, boolean negative){
        if(negative == true){
            return x < 0 && y < 0;
        }
        else{
            return x*y<0;
        }
    }
    public static boolean pickUpPhone(boolean isMorning, boolean isMom, boolean isAsleep){
        if (isAsleep){
            return false;
        }
        else if (isMorning){
            if (isMom) {
                return true;
            }
            else{
                return true;
            }
        }
        else{
            return true;
        }
    }
    public static String setAlarm(int day, boolean isVac){
        if (isVac){
            if (day==0 || day == 6){
                return "off";
            }
            else{
                return "10:00";
            }
        }
        else{
            if (day==0 || day == 6){
                return "10:00";
            }
            else{
                return "7:00";
            }
        }
    }
    public static boolean onesDigitSame(int a, int b, int c){
        a%=10;
        b%=10;
        c%=10;
        return (a==b || b==c || a==c);
    }
    public static int blackjack(int x,int y){
        if (x > 21 && y > 21){
            return 0;
        }
        else if (x > 21){
            return y;
        }
        else if (y > 21){
            return x;
        }
        else{
            if (x>y){
                return x;
            }
            else{
                return y;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(chimpTrouble(true, true));
        System.out.println(chimpTrouble (false, false));
        System.out.println(chimpTrouble (true, false));
        System.out.println(chimpTrouble (false, true));

        System.out.println();

        System.out.println(negPos(1, -1, false));
        System.out.println(negPos (-1, 1, false));
        System.out.println(negPos(1, 1, false));
        System.out.println(negPos (-1, -1, false));
        System.out.println(negPos (-4, -5, true));
        System.out.println(negPos (-4, 5, true));
        System.out.println(negPos (4, 5, true));
        System.out.println(negPos (4, -5, true));

        System.out.println();

        System.out.println(pickUpPhone (false, false, true));
        System.out.println(pickUpPhone (true, true, true));
        System.out.println(pickUpPhone (true, true, false));
        System.out.println(pickUpPhone (false, true, false));
        System.out.println(pickUpPhone (true, false, false));
        System.out.println(pickUpPhone (false, false, false));

        System.out.println();

        System.out.println(setAlarm(1, false));
        System.out.println(setAlarm(5, false));
        System.out.println(setAlarm (0, false));
        System.out.println(setAlarm (2, true));
        System.out.println(setAlarm (4, true));
        System.out.println(setAlarm (6, true));

        System.out.println();

        System.out.println(onesDigitSame(23, 19, 13));
        System.out.println(onesDigitSame (23, 19, 12));
        System.out.println(onesDigitSame (23, 19, 3));
        System.out.println(onesDigitSame (423, 13, 3));
        System.out.println(onesDigitSame (23, 29, 25));

        System.out.println();

        System.out.println( blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
        System.out.println(blackjack(8, 8));
        System.out.println(blackjack(25, 24));
    }
}

//true
//true
//false
//false
//
//true
//true
//false
//false
//true
//false
//false
//false
//
//false
//false
//true
//true
//true
//true
//
//7:00
//7:00
//10:00
//10:00
//10:00
//off
//
//true
//false
//true
//true
//false
//
//21
//21
//19
//8
//0
//
//Process finished with exit code 0