package javatd1;

public class cercel {
    private double r ;
    public cercel()
    {
        this.r = 0;
    }
    public cercel(double r)
    {
        this.r = r > 0 ? r : 0;
    }
    public double getr()
    {
        return r;
    }
    public void setR(double r) {
        if (r > 0) {
            this.r = r;
        } else {
            System.out.println("Radius must be positive!");
        }
    }
    public static double pc (double r)
    {
        return 2 * Math.PI * r;
    }
    public static double sc (double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
}
