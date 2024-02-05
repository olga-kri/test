package pro.sky.Test;

import net.bytebuddy.asm.MemberSubstitution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.Test.service.CalculatorServiseImpl;

import java.util.stream.Stream;

public class CalculatorServiseImplParametrTest {
    private final CalculatorServiseImpl out = new CalculatorServiseImpl();

    @MethodSource("argumentsForCalculatorTest")
    @ParameterizedTest
    public void resultMustBeCorrectAfterAddition(Integer num1, Integer num2){
        Assertions.assertEquals(num1+num2, out.addition(num1,num2));
    }
    @MethodSource("argumentsForCalculatorTest")
    @ParameterizedTest
    public void resultMustBeCorrectAfterSubtraction(Integer num1, Integer num2){
        Assertions.assertEquals(num1-num2, out.subtraction(num1,num2));
    }
    @MethodSource("argumentsForCalculatorTest")
    @ParameterizedTest
    public void resultMustBeCorrectAfterMultiply(Integer num1, Integer num2){
        Assertions.assertEquals(num1*num2, out.multiply(num1,num2));
    }
    @MethodSource("argumentsForCalculatorTest")
    @ParameterizedTest
    public void resultMustBeCorrectAfterDivide(Integer num1, Integer num2){
        Assertions.assertEquals(num1/num2, out.divide(num1,num2));
    }
    public static Stream<Arguments> argumentsForCalculatorTest(){
        return Stream.of( Arguments.of(5,5),
                Arguments.of(10,1),
                Arguments.of(3,6),
                Arguments.of(5,4));
    }
}
