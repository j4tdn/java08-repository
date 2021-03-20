package persistences;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name="duan")
public class Project {

    @Id
    @Column(name="id")
    private Integer id ;

    @Column(name="thutu")
    private String desc ;


    @Column(name="sotien")
    private Integer budget ;

    // de ten table cua no
//    @ManyToMany(mappedBy = "duan",cascade = CascadeType.ALL)
//    private Set<Employee> employees ;

    public Project() {

    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", budget=" + budget ;
//                ", employees=" + employees +
//                '}';
    }
}
