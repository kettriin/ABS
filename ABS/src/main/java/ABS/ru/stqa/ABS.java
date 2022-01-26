package ABS.ru.stqa;

public class ABS {
    public static void main(String[] args) {
        Point A = new Point(7, 3);
        Point B = new Point(1, 5);

        System.out.println(A.distance(A, B));
    }

    /*функция
    public static double distance(Point p1, Point p2){
        return Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2));
    }*/
}