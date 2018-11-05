package ruslan.hibernate.entityExtends.JpaTest;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
public class Mersedes extends  Car {

    private String uniqueString;

}
