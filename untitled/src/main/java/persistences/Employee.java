package persistences;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="employee")
public class Employee {

    @Id
    @Column(name="manv")
    private Integer id ;

    @Column(name="email")
    private String email ;

    @Column(name="ten")
    private String firstName ;

    @Column(name="ho")
    private String lastName ;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    @JoinColumn(name = "manv")

    @OneToMany
    @JoinTable(

                    name="taikhoan_nhanvien",
                    joinColumns  = {
                    @JoinColumn(name="manv",referencedColumnName = "manv")
                    },
                    inverseJoinColumns = {
                            @JoinColumn(name ="matk",referencedColumnName = "matk")
                    }

    )
    private Set<Account> accounts = new HashSet<>();


    // JPA/Hibernate default constructor


    public Employee(){

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
