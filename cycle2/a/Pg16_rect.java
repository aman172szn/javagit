
class Pg16_rect {
    private double length;
    private double width;

    public Pg16_rect() {
        this.length = 1;
        this.width = 1;
    }

    public Pg16_rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public void displayDetails() {
        System.out.println("Length: " + length + ", Width: " + width);
        System.out.println("Area: " + calculateArea() + ", Perimeter: " + calculatePerimeter());
    }

    public static void main(String[] args) {
        Pg16_rect defaultRectangle = new Pg16_rect();
        System.out.println("Default Rectangle:");
        defaultRectangle.displayDetails();

        Pg16_rect customRectangle = new Pg16_rect(5, 10);
        System.out.println("Custom Rectangle:");
        customRectangle.displayDetails();
    }
}
