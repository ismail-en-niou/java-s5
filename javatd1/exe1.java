package javatd1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class exe1 {
   
    public static void main(String[] args) {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double r ;
        try{
            String s = bf.readLine();
            r = Double.parseDouble(s);
            if (r <= 0 )
                System.out.println("the rayon should be >= 0");
            else 
                System.out.println("sc : " + cercel.sc(r) + "pc :" + cercel.pc(r));
        }catch(IOException e){
            System.out.println("node"+e.getMessage());
        }
    }
     
}