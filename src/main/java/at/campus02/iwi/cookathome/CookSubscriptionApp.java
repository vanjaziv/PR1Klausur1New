package at.campus02.iwi.cookathome;

import org.w3c.dom.ls.LSOutput;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.Arrays;

public class CookSubscriptionApp {

    public static void main(String[] args) {

        CookSubscription person1 = new CookSubscription();
        CookSubscription person2 = new CookSubscription();

        String boxPerson1 = person1.firstBox(24, true, false, 5);
        String boxPerson2 = person2.firstBox(55, false, true, 1);

        System.out.println(boxPerson1);
        System.out.println(boxPerson2);

        System.out.println(Arrays.toString(person1.suggestPrice(boxPerson1, 25)));
        System.out.println(Arrays.toString(person2.suggestPrice(boxPerson2, 35)));



    }
}
