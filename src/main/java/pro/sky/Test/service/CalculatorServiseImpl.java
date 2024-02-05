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
    public String addition(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            int result = num1 + num2;
            String resultMessage = (num1 + " + " + num2 + " = " + result);
            return resultMessage;
        } else return ("Не введены значения для сложения");
    }

    @Override
    public String subtraction(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            int result = num1 - num2;
            String resultMessage = (num1 + " - " + num2 + " = " + result);
            return resultMessage;
        } else return ("Не введены значения для вычитания");
    }
    @Override
    public String multiply(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            int result = num1 * num2;
            String resultMessage = (num1 + " * " + num2 + " = " + result);
            return resultMessage;
        } else {
            return ("Не введены значения для умножения");
        }
    }

    @Override
    public String divide(Integer num1, Integer num2) {
        if (doesNumbersExist(num1, num2)) {
            if (num2 != 0) {
                int result = num1 + num2;
                String resultMessage = (num1 + " / " + num2 + " = " + result);
                return resultMessage;
            } else {
                throw new CannotDivideOnZero();
            }
        }
        else return ("Не введены значения для деления");
    }
    public boolean doesNumbersExist(Integer num1, Integer num2){
        if (num1 != null && num2 != null) {
            return true;
        } else return false;
    }
}

