import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.Scanner;

public class cercle {
    public static double pc(double r) {
        double area = Math.PI * Math.pow(r, 2);
        area = Math.round(area * 100) / 100;
        return area;
    }

    public static double sc(double r) {
        double circumference = 2 * Math.PI * r;
        circumference = Math.round(circumference * 100) / 100;
        return circumference;
    }

    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("ara dikxi we sf \n");
        try {
            String s = br.readLine();
            double r = Double.parseDouble(s);
            double se = pc(r);
            double d = sc(r);
            System.out.println("res = " + se);
            System.out.println("res = " + d);
        } catch (IOException e) {
            System.out.println("fail to read concept");
        }

    }
}