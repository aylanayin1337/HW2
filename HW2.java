import java.util.Random;

public class HW2 {
    public static void main(String[] args) {
        System.out.println(permission(generateRandomAge(), 10));
        System.out.println(permission(generateRandomAge(), -15));
        System.out.println(permission(generateRandomAge(), 30));
        System.out.println(permission(generateRandomAge(), 20));
        System.out.println(permission(generateRandomAge(), 5));
    }

    public static String permission(int ageOfPerson, int temperatureOutside) {
        if ((ageOfPerson <= 45 && ageOfPerson >= 20) && (temperatureOutside >= -20 && temperatureOutside <= 30)) {
            return ("Можно идти гулять");
        } else if (ageOfPerson < 20 && temperatureOutside >= 0 && temperatureOutside <= 28) {
            return ("Можно идти гулять");
        } else if (ageOfPerson > 45 && temperatureOutside >= -10 && temperatureOutside <= 25) {
            return ("Можно идти гулять");
        } else {
            return ("Оставайтесь дома");
        }
    }

    public static int generateRandomAge() {
        Random age = new Random();
        return age.nextInt(100);
    }
}