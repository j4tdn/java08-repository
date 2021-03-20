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

    @ManyToMany
    @JoinTable(

                    name="duan_nhanvien",
                    joinColumns  = {
                    @JoinColumn(name="emp_id",referencedColumnName = "manv")
                    },
                    inverseJoinColumns = {
                            @JoinColumn(name ="pro_id",referencedColumnName = "id")
                    }

    )
    private Set<Project> projects = new HashSet<>();


    // JPA/Hibernate default constructor


    public Employee(){

    }

    public Employee(Integer id, String email , String firstName , String lastName ){
        this.id = id ;
        this.email = email ;
        this.firstName = firstName;
        this.lastName = lastName ;
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
