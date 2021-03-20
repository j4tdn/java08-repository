package persistences;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "taikhoan")
@AllArgsConstructor
@Getter
@Setter
public class Account {

    // a JPA/Hibernate constructor to join
    public Account() {
    }

    @Id
    @Column(name="matk")
    private Integer id ;

    @Column(name="sotk")
    private String accountNumber ;

//    @ManyToOne()
//    private Employee employee ;

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                '}';
    }
}



