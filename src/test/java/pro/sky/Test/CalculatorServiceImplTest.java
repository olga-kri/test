package pro.sky.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.Test.exception.CannotDivideOnZero;
import pro.sky.Test.service.CalculatorServiseImpl;

public class CalculatorServiceImplTest {

    private final CalculatorServiseImpl out = new CalculatorServiseImpl();

    @Test
    public void sumMustBe10AfterAddition(){
        Assertions.assertEquals(10, out.addition(5,5 ));
    }
    @Test
    public void  sumMustBe5AfterAddition(){
        Assertions.assertEquals(10, out.addition(5,0 ));
    }
    @Test
    public void resultMustBe0AfterSubtraction(){
        Assertions.assertEquals(0, out.subtraction(5,5 ));
    }
    @Test
    public void resultMustBe5AfterSubtraction(){
        Assertions.assertEquals(5, out.subtraction(5,0 ));
    }
    @Test
    public void resultMustBe25AfterMultiply(){
        Assertions.assertEquals(25, out.multiply(5,5 ));
    }
    @Test
    public void resultMustBe0AfterMultiply(){
        Assertions.assertEquals(0, out.multiply(5,0 ));
    }
    @Test
    public void resultMustBe1AfterDivide(){
        Assertions.assertEquals(1, out.divide(5,5 ));
    }
    @Test
    public void resultMustBe5AfterDivide(){
        Assertions.assertEquals(5, out.divide(5,1 ));
    }
    @Test
    public void SholdThrowExceptionAfterDivideOnZero(){
        Assertions.assertThrows(CannotDivideOnZero.class, () -> out.divide(5,0));
    }
}
