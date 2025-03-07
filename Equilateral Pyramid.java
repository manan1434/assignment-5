class EquilateralPyramid extends Shape implements Volume {
    private double baseSide, height;

    public EquilateralPyramid(double baseSide, double height) {
        super("Equilateral Pyramid");
        this.baseSide = baseSide;
        this.height = height;
    }

    @Override
    double calculateArea() {
        double baseArea = baseSide * baseSide;
        double slantHeight = Math.sqrt((baseSide / 2) * (baseSide / 2) + height * height);
        double lateralArea = 2 * baseSide * slantHeight;
        return baseArea + lateralArea;
    }

    @Override
    double calculatePerimeter() {
        return 4 * baseSide;
    }

    @Override
    public double calculateVolume() {
        return (1.0 / 3) * (baseSide * baseSide) * height;
    }

    @Override
    public void displayResults() {
        super.displayResults();
        System.out.println("Volume: " + calculateVolume());
    }
}
