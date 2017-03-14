import org.junit.Test;
import utility.GradeCalculator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * Created by macintoshhd on 3/14/2017 AD.
 */
public class GradeCalculatorTest {
    @Test
    public void testCalculate(){
        GradeCalculator gradeCalculator = new GradeCalculator();
        assertThat(gradeCalculator.calculate(25,28,32),is('B'));
    }

}
