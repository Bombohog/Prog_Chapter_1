package Chapter_10;

class Circle2DTest {

    public static void main(String[] args) {

        Circle2D c1 = new Circle2D(2, 2, 5.5);

        System.out.printf(
                "Area is %.2f\n" +
                "Perimeter is %.2f\n" +
                "Does it contain point(3, 3) %b\n" +
                "Does it contain another circle(x = 4, y = 5, radius = 10.5) %b\n" +
                "Does it overlap with circle(x = 3, y = 5, radius = 2.3) %b",
                c1.getArea(), c1.getPerimeter(), c1.contains(3, 3),
                c1.contains(new Circle2D(4, 5, 10.5)),
                c1.overlaps(new Circle2D(3, 5, 2.3)));

    }

}