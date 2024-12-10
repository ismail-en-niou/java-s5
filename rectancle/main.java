package rectancle;

public class main {
    public static void main(String[] args) {
        rectangle test = new rectangle(3 ,5);
        System.out.println("Area : " + test.claculeArea(test));
        System.out.println("pirimeter :" +test.calculatePerimeter(test));
        System.out.println("is square :"+ test.isSquare(test));
        test.setLength(5);
        test.setWidth(5);
        System.out.println("update is square :"+ test.isSquare(test));
    }
}
