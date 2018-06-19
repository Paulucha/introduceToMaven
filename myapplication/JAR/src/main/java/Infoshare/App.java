package Infoshare;

import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");


        Logger log = LoggerFactory.getLogger(App.class);

        DateTime dt = new DateTime();
        DateTime year2000 = dt.withYear(2000);
        DateTime twoHoursLater = dt.plusHours(2);
    }
}

