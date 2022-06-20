package at.campus02.iwi.cookathome;

public class CookSubscription {

    int age;
    boolean vegan;
    boolean veggie;
    int activePerWeek;

    public String firstBox(int age, boolean vegan, boolean veggie, int activePerWeek) {
        if (vegan) {
            return "Vegan";
        } else if (veggie) {
            return "Veggie";
        } else if (activePerWeek >= 4 && age <= 60) {
            return "Fish";
        } else if (age <= 20 || age > 60) {
            return "Veggie";
        } else {
            return "Vegan";
        }
    }

    public double[] suggestPrice(String box, int age) {
        double[] result = new double[2];

        if (box.equals("Fish")) {
            if (age <= 25) {
                result[0] = 39.90;
            } else {
                result[0] = 49.90;
            }
            result[1] = 80.00;
        }

        if (box.equals("Veggie")) {
            if (age <= 25 || age > 60) {
                result[0] = 19.90;
            } else {
                result[0] = 29.90;
            }
            result[1] = 42.00;
        }

        if (box.equals("Vegan")) {
            result[0] = 15.00;
            if (age < 30) {
                result[1] = 45.00;
            } else {
                result[1] = 49.90;
            }

        }
        return result;
    }
}