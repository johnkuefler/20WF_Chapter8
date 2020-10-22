
import java.lang.Math;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {

        DayOfTheWeek today = DayOfTheWeek.Thursday;
        if (today == DayOfTheWeek.Friday) {
            System.out.println("YAYYYYY");
        } else {
            System.out.println("SAD");
        }
        
        System.out.println(today);
        System.out.println(today.ordinal());

        
        switch(today) {
            case Monday:
                System.out.println("Sad");
                break;
            case Tuesday:
                System.out.println("Better");
                break;
            case Wednesday:
                System.out.println("Even Better");
                break;      
                // cases for the rest of the days
        }
        
        
        // prone to mistakes
        String todayAsString = "thursday";
        if (todayAsString == "Friday ") {
            System.out.println("YAYYYYY");
        } else {
            System.out.println("SAD");
        }

        Random myRandom = new Random();
        double myRandomNumber = myRandom.nextDouble();

        System.out.println(EmailValidator.isValidEmail("john@test.com"));
        System.out.println(EmailValidator.isValidEmail("john"));

        Rectangle myRect = new Rectangle();
        myRect.setLength(10);
        myRect.setWidth(10);

        Rectangle myRect2 = new Rectangle();
        myRect2.setLength(10);
        myRect2.setWidth(10);

        // don't do this
        // boolean areEqual = myRect2 == myRect;
        boolean areEqual = myRect2.equals(myRect);

        System.out.println(myRect);

        System.out.println(myRect);

        Rectangle rectToGetArea = new Rectangle(myRect);
        double area = GetArea(rectToGetArea);

        System.out.println(myRect);
    }

    public static double GetArea(Rectangle rect) {
        if (rect != null) {
            rect.setLength(50);

            return rect.getLength() * rect.getWidth();
        } else {
            return 0;
        }
    }
}
