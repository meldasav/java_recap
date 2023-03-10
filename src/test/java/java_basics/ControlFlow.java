package java_basics;

public class ControlFlow {
    public static void main(String[] args) {
        boolean hungry = true;
        if (hungry) {
            System.out.println("I am starving");//this line will be executed because hungry is true
        } else {
            System.out.println("I am not hungry");
        }
        int hungerRating = 5;
        if (hungerRating < 6) {
            System.out.println("Not Hungry");
        } else {
            System.out.println("I'm starving");
        }

        int favoriteTemp = 75;
        int currentTemp = 60;
        String opinion;

        if (currentTemp == favoriteTemp) {
            if (currentTemp < favoriteTemp - 30) {
                opinion = "It's pretty darn cold";
            } else if (currentTemp < favoriteTemp - 20) {
                opinion = "it's kinda cold out";
            } else if (currentTemp > favoriteTemp + 10) {
                opinion = "it's hot out";
            } else {
                opinion = "it's a beautiful day";
            }

        } else {
            opinion = "unknown temp";
        }
        System.out.println(opinion);

        int month = 4;
        String monthString;

        switch (month) {
            case 1:
                monthString = "January";
                break;
            case 2:
                monthString = "February";
                break;
            case 3:
                monthString = "March";
                break;
            case 4:
                monthString = "April";
                break;
            default:
                monthString = "unknown month";
                break;
        }
        System.out.println(monthString);
    }
}