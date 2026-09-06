public class SecondsConverter {
    //days, hours, minutes, seconds
    
    public static void main(String[] args){
        int amount = 98765;

        int numberDays = amount /(3600*24); 

        amount = amount % (3600 * 24);

        int numberHours = amount / 3600;

        amount = amount % 3600;

        int numberMinutes = amount / 60;

        amount = amount % 60;

        int numberSeconds = amount;

        System.out.println(numberDays);
        System.out.println(numberHours);
        System.out.println(numberMinutes);
        System.out.println(numberSeconds);

        System.out.println(reconstruction(numberDays, 
            numberHours, numberMinutes, numberSeconds));
    }

    public static int reconstruction(int numberDays, 
        int numberHours, int numberMinutes, int numberSeconds){
        int total = 0;
        total += 3600 * 24 * numberDays;
        total += 3600 * numberHours;
        total += 60 * numberMinutes;
        total += numberSeconds;
        return total;
    }
}
