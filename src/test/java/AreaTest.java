import org.junit.*;
import org.junit.jupiter.api.Assertions;

public class AreaTest {

    @Test
    public void Test(){
    Integer side1 = 7;
    Integer side2 = 8;
    Integer side3 = 9;
    double expResult = 26.832815729997478;
    Integer s = (side1 + side2 + side3)/2;
    double area = Math.sqrt(s*((s-side1)*(s-side2)*(s-side3)));
    Assertions.assertEquals(expResult, area);
    }

}
