package persistence;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "nhanvien")
public class Employee {
    @Id
    @Column(name = "manv")
    private Integer id;

    @Column(name = "diachi_email")
    private String email;

    @Column(name = "ten")
    private String firstName;

    @Column(name = "ho")
    private String lastName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "taikhoan_nhanvien", joinColumns = {
            @JoinColumn(name = "manv", referencedColumnName = "manv")
    }, inverseJoinColumns = {
            @JoinColumn(name = "matk", referencedColumnName = "matk")
    })
    // Quickly way to demo avoid using "setAccounts()"
    private Set<Account> accounts = new HashSet<>();

    // JPA/ Hibernate default constructor
    public Employee() {
    }

    public Employee(Integer id, String email, String firstName, String lastName) {
        this.id = id;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
