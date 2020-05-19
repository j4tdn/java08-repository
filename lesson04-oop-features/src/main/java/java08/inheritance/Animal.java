package java08.inheritance;

public class Animal {
    private String color;
    private boolean gender;

    public Animal() {
    }

    public Animal(String color, boolean gender) {
        this.color = color;
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void move() {
        System.out.println(getClass().getName() + "=> Moving ...");
    }

    public void eat() {
        System.out.println(getClass().getName() + "=> Eating ...");
    }

    @Override
    public String toString() {
        return "color=" + color + ", " + (gender ? "male" : "female") ;
    }
}
