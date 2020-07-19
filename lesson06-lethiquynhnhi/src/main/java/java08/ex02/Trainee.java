package java08.ex02;

public class Trainee {
    private String MHV;
    private String name;
    private String password;
    private String birthday;

    public Trainee() {
    }

    public Trainee(String MHV, String name, String password, String birthday) {
        this.MHV = MHV;
        this.name = name;
        this.password = password;
        this.birthday = birthday;
    }

    public String getMHV() {
        return MHV;
    }

    public void setMHV(String MHV) {
        this.MHV = MHV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Trainee{" +
                "MHV= '" + MHV + '\'' +
                ", name= '" + name + '\'' +
                ", password= '" + password + '\'' +
                ", birthday= '" + birthday + '\'' +
                '}';
    }
}
