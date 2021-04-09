package persistence;

import javax.persistence.*;
import javax.persistence.Id;

@Entity
@Table(name = "project")
public class Project {
    @Id
    @Column(name = "pro_id")
    private String proId;

    @Column(name = "pro_name")
    private String proName;

    @Column(name = "budget")
    private String budget;

    @ManyToOne
    private Department department;

    public Project() {
    }

    public Project(String proId, String proName, String budget, Department department) {
        this.proId = proId;
        this.proName = proName;
        this.budget = budget;
        this.department = department;
    }

    public String getProId() {
        return proId;
    }

    public void setProId(String proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public String getBudget() {
        return budget;
    }

    public void setBudget(String budget) {
        this.budget = budget;
    }

    public Department getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Project{" +
                "proId='" + proId + '\'' +
                ", proName='" + proName + '\'' +
                ", budget='" + budget + '\'' +
                ", department=" + department +
                '}';
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
