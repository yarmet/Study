package ruslan.minmaxsearcher;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@ToString
public  class MinMaxResult<Val> {
    private Val min;
    private Val max;
}