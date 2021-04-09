package persistence;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "duan")
public class Project {
    @Id
    @Column(name = "mada")
    private Integer id;

    @Column(name = "mota")
    private String desc;

    @Column(name = "sotien")
    private Integer budget;

    public Project() {
    }

    public Project(Integer id, String desc, Integer budget) {
        this.id = id;
        this.desc = desc;
        this.budget = budget;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getBudget() {
        return budget;
    }

    public void setBudget(Integer budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", desc='" + desc + '\'' +
                ", budget=" + budget +
                '}';
    }
}
