package ruslan.hibernate.manyToMany;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ruslan on 23.07.2017.
 */


@Getter
@Setter
@Entity
@Table(name = "teatcher")
public class Teatcher {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;


    @ManyToMany(cascade =  CascadeType.ALL )
    @JoinTable(name = "student_teatcher"
            , joinColumns = {@JoinColumn(name = "teatcher_id")}
            , inverseJoinColumns = {@JoinColumn(name = "student_id")})
    private List<Student> students = new ArrayList<Student>();
}
