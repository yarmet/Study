package ruslan.hibernate.oneToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ruslan on 23.07.2017.
 */

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;


    @ManyToOne()
    @JoinColumn(name = "teatcher_id")
    private Teatcher teatcher;
}
