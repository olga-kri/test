package pro.sky.Test.service;

import org.springframework.stereotype.Service;
import pro.sky.Test.exception.CannotDivideOnZero;

@Service
public class CalculatorServiseImpl implements CalculatorServise {


    @Override
    public String showGreeting() {
        String greeting = ("Добро пожаловать в калькулятор");
        return greeting;
    }

    @Override
    public Integer addition(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            Integer result = num1 + num2;
            return result;
        } else throw new RuntimeException ("Не введены значения для сложения");
    }

    @Override
    public Integer subtraction(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            Integer result = num1 - num2;
            return result;
        } else throw new RuntimeException ("Не введены значения для вычитания");
    }
    @Override
    public Integer multiply(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            Integer result = num1 * num2;
            return result;
        } else throw new RuntimeException ("Не введены значения для умножения");

    }
    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            if (num2 != 0) {
                Integer result = num1 / num2;
                return result;
            } else {
                throw new CannotDivideOnZero();
            }
        }
        else throw new RuntimeException ("Не введены значения для деления");
    }
    public boolean doesNumbersExist(Integer num1, Integer num2){
        if (num1 != null && num2 != null) {
            return true;
        } else return false;
    }
}

