package persistence;


import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="project_employee")
public class ProjectEmployee {
    @javax.persistence.Id
    @Column(name = "id")
    private Id id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Embeddable
    class Id{
        private String proId;
        private String empId;

        public Id() {
        }
    }
}
