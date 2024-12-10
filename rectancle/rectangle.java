package rectancle;

public class rectangle {
    private double width;
    private double length;

    public rectangle() {
        this.width = this.length = 1.0;
    }

    public rectangle(double width, double length) {
        if (width >= 0 && length >= 0) {
            this.length = length;
            this.width = width;
        }
        else 
            this.length = this.width = 0;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double claculeArea(rectangle t)
    {
        return t.length * t.width;
    }
    public double calculatePerimeter(rectangle t)
    {
        return t.length * 2 + t.width * 2; 
    }
    public boolean isSquare(rectangle t)
    {
        return t.length == t.width ? true : false ;
    }
}
