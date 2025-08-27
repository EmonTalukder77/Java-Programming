public class Rectangle extends Shape {
    double lenght;
    double width;

    Rectangle(double lenght, double width) {
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    double area() {
        return lenght * width;
    }
}
