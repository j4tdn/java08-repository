package bean;

public class Box {
    private int width;
    private int height;

    // Default constructor
    public Box(){

    }

    //Constructor
    public Box(int width, int height){
        this.width = width;
        this.height = height;
    }

    // setter
    public void setWidth(int width) {
        //"this" is current pointer
        this.width = width;
    }

    public void setHeight(int height) {
        //"this" is current pointer
        this.height = height;
    }

    // getter
    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
