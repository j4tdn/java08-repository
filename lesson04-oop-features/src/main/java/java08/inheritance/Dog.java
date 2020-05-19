package java08.inheritance;

public class Dog extends Animal {
    private String type;
    private boolean isLoyal;

    public Dog(String color, boolean gender, String type) {
        this(color, gender, type, true);
    }

    public Dog(String color, boolean gender, String type, boolean isLoyal) {
        super(color, gender);
        this.type = type;
        this.isLoyal = isLoyal;
    }

    public void security() {
        if (isLoyal) {
            System.out.println(getClass().getName() + "security ...");
        } else {
            System.out.println("No value !!!");
        }
    }

    @Override
    public void move() {
        System.out.println("Dog(SubClass) is moving ...");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isLoyal() {
        return isLoyal;
    }

    public void setLoyal(boolean loyal) {
        isLoyal = loyal;
    }

    @Override
    public String toString() {
        return super.toString() +
                "type='" + type + '\'' +
                ", isLoyal=" + isLoyal;
    }
}
