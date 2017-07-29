public class TrianglePoolChapter3 {
    double area;
    int height;
    int length;

    public static void main(String[] args) {
        int x = 0;
        TrianglePoolChapter3[] ta = new TrianglePoolChapter3[4];

        while (x < 4) {
            ta[x] = new TrianglePoolChapter3();
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();
            System.out.println("Треугольник " + x + ", зона");
            System.out.println(" = " + ta[x].area);
            x++;
        }
        int y = x;
        x = 27;
        TrianglePoolChapter3 t5 = ta[2];
        ta[2].area = 343;
        System.out.println(" y = " + y);
        System.out.println(", зона t5 = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2;
    }
}
