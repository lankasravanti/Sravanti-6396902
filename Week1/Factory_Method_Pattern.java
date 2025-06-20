class Factory_Method_Pattern{
    // Interface
    interface Shape {
        void draw();
    }

    // Implementations of Shape
    static class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    static class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    static class Square implements Shape {
        public void draw() {
            System.out.println("Drawing a Square");
        }
    }

    // Factory class
    static class ShapeFactory {
        public Shape getShape(String shapeType) {
            if (shapeType == null) return null;
            switch (shapeType.toLowerCase()) {
                case "circle":
                    return new Circle();
                case "rectangle":
                    return new Rectangle();
                case "square":
                    return new Square();
                default:
                    return null;
            }
        }
    }

    // Main method to test the pattern
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();  // Output: Drawing a Circle

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();  // Output: Drawing a Rectangle

        Shape shape3 = shapeFactory.getShape("square");
        shape3.draw();  // Output: Drawing a Square
    }
}
