public class Engineering {
    private int length;
    private int width;

    public Engineering(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Engineering(int length) {

        this.length = length;
    }

    public int rect() {
        int area = (width * length);
        return area;
    }

    public double circle() {
        double area = (3.14 * length * length);
        return area;
    }

    public int changeLength(int newlength) {
        length = newlength;
        return newlength;
    }


    public static void main(String[] args) {
        Engineering r = new Engineering(6, 7);
        Engineering c = new Engineering(7);
        c.changeLength(4);
        double answer = c.circle();
        r.changeLength(-5);
        int secondAnswer = r.rect();
        int thirdAnswer = c.rect(); //this will print an error
        System.out.println(answer);
        System.out.println(secondAnswer);
        System.out.println(thirdAnswer);

        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 0; k <= 2; k++)
                    System.out.print("$");
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}



            // write your code here


