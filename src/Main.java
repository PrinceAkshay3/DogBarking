
public class Main {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(false, 0));
        System.out.println(shouldWakeUp(true, 6));
        System.out.println(shouldWakeUp(false, 10));
        System.out.println(shouldWakeUp(true, -1));

    }
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay >= 0 && hourOfDay <= 23){
            if(barking == true && (hourOfDay < 8 || hourOfDay > 22)){
                return true;
            }
            return false;
        }
        return false;
    }
    }
