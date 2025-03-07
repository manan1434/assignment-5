abstract class Shape {
    protected String shape;

    public Shape(String shape) {
        this.shape = shape;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public void displayResults() {
        System.out.println("\nShape: " + shape);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
