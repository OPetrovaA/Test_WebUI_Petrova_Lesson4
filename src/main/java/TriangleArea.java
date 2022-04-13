public class TriangleArea {
    public static void main(String[] args) {
        Integer side1 = 7;
        Integer side2 = 8;
        Integer side3 = 9;

        Integer s = (side1 + side2 + side3)/2;
        double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
        System.out.println("Площадь треугольника равна: " + area);
    }
}
