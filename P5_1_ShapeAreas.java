abstract class Shape {

    abstract double area();
}

class Circle extends Shape {

    double r;

    Circle(double r) {
        this.r = r;
    }

    double area() {
        return Math.PI * r * r;
    }
}

class Rectangle extends Shape {

    double l, w;

    Rectangle(double l, double w) {
        this.l = l;
        this.w = w;
    }

    double area() {
        return l * w;
    }
}

class Triangle extends Shape {

    double b, h;

    Triangle(double b, double h) {
        this.b = b;
        this.h = h;
    }

    double area() {
        return 0.5 * b * h;
    }
}

public class ShapeAreas {

    public static void main(String[] args) {

        Shape[] shapes = {
            new Circle(3),
            new Rectangle(4, 5),
            new Triangle(6, 4)
        };

        double total = 0;
        double largest = 0;

        for (Shape s : shapes) {

            double a = s.area();

            System.out.printf("%s area = %.2f%n",
                    s.getClass().getSimpleName(), a);

            total += a;
            largest = Math.max(largest, a);
        }

        System.out.printf("Total = %.2f, Largest = %.2f%n",
                total, largest);
    }
}
