public class Rectangle {
    private int width;
    private int height;

    public Rectangle() {
        this.width = 5;
        this.height = 4;
    }

    public Rectangle(int width) {
        this.width = width;
        this.height = 4;
    }

    public void setwidth(int width) {
        this.width = width;
    }

    public void setheight(int height) {
        this.height = height;
    }

    public int calculateArea() {
        return this.width * this.height;
    }

    public int calculatePerimeter(int width, int height) {
        this.width = width;
        this.height = height;
        return 2 * (width + height);
    }
}