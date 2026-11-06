abstract class Media {

    String title;
    int lateDays;

    Media(String t, int d) {
        title = t;
        lateDays = Math.max(0, d);
    }

    abstract double lateFee();
}

class Book extends Media {

    Book(String t, int d) {
        super(t, d);
    }

    double lateFee() {
        return lateDays * 2.0;
    }
}

class DVD extends Media {

    DVD(String t, int d) {
        super(t, d);
    }

    double lateFee() {
        return lateDays * 5.0;
    }
}

class Magazine extends Media {

    Magazine(String t, int d) {
        super(t, d);
    }

    double lateFee() {
        return lateDays * 1.0;
    }
}

public class MediaLateFees {

    public static void main(String[] args) {

        Media[] returned = {
            new Book("Java", 3),
            new DVD("Movie", 2),
            new Magazine("Science", 4)
        };

        double total = 0;

        for (Media m : returned) {

            System.out.println(m.title + " fee: " + m.lateFee());

            total += m.lateFee();
        }

        System.out.println("Total late fees: " + total);
    }
}
           
