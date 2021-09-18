public class test {
    public static void main (String[] args) {
       double PI=3.1415926;
       double radius=6;

       double circle=2*PI*radius;
       double area=PI*radius*radius;
        System.out.print("Circle: ");
        System.out.print(circle);

        System.out.print(" Area: ");
        System.out.println(area);

        System.out.print(circle>5 || area<125);
    }
}
