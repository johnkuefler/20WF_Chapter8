
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

        Random myRandom = new Random();
        double myRandomNumber = myRandom.nextDouble();

        System.out.println(EmailValidator.isValidEmail("john@test.com"));
        System.out.println(EmailValidator.isValidEmail("john"));

        Rectangle myRect = new Rectangle();
        myRect.setLength(10);
        myRect.setWidth(10);

        System.out.println(myRect);
        
        System.out.println(myRect);

        double area = GetArea(myRect);

        System.out.println(myRect);

    }

    public static double GetArea(Rectangle rect) {

        rect.setLength(50);

        return rect.getLength() * rect.getWidth();
    }
}
