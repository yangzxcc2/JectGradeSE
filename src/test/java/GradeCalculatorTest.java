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
<<<<<<< HEAD
        assertThat(gradeCalculator.calculate(0,0,-2),is('U'));
=======
        assertThat(gradeCalculator.calculate(50,50,1,12,23,3),is('x'));
>>>>>>> abf7bc31e50d107484f0ab3e03a29b6ebff370b5
    }

}
