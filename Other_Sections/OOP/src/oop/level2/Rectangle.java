package oop.level2;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area() {
        return length * width;
    }

    public int perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return String.format("length - %d width - %d area - %d perimeter - %d", length, width, area(), perimeter());
    }
}
