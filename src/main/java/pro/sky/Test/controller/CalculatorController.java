package pro.sky.Test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.Test.service.CalculatorServise;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    public final CalculatorServise calculatorServise;

    public CalculatorController(CalculatorServise calculatorServise) {
        this.calculatorServise = calculatorServise;
    }

    public String showGreeting(){
        return calculatorServise.showGreeting();
    }
    @GetMapping("/calculator/plus")
    public String addition(@RequestParam Integer num1, Integer num2){
        return (num1 + " + " + num2 + " = " + calculatorServise.addition(num1,num2));
    }
    @GetMapping("/calculator/minus")
    public String subtraction(@RequestParam Integer num1, Integer num2){
        return (num1 + " - " + num2 + " = " + calculatorServise.subtraction(num1,num2));
    }
    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam Integer num1, Integer num2){
        return (num1 + " * " + num2 + " = " + calculatorServise.multiply(num1,num2));
    }
    @RequestMapping("/calculator/divide")
    public String divide(@RequestParam Integer num1, Integer num2){
        return (num1 + " / " + num2 + " = " + calculatorServise.divide(num1,num2));
    }



}
