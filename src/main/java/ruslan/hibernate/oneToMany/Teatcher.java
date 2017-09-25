package ruslan.hibernate.oneToMany;

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


    @OneToMany(mappedBy =  "teatcher", cascade = CascadeType.ALL)
    private List<Student> students = new ArrayList<Student>();

}
