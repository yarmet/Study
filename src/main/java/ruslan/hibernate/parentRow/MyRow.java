package ruslan.hibernate.parentRow;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by ruslan on 23.07.2017.
 */


@Getter
@Setter
@Entity
@Table(name = "my_row")
public class MyRow {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "name")
    private String name;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "parent_id", referencedColumnName = "id")
    private MyRow parent;




}
