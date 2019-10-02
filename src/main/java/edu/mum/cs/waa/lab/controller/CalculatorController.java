package edu.mum.cs.waa.lab.controller;

import edu.mum.cs.waa.lab.domain.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class CalculatorController {

    @RequestMapping
    public String welcome(){
        return "welcome";
    }

    @RequestMapping("/showform")
    public String showForm(){
        return "calculator";
    }
    
    @PostMapping({"/calculate"})
    public String calculate(Calculator calculator, BindingResult bindingResult, Model model){

        String sum, product;
        if(!bindingResult.hasErrors()){
            try {
                Integer add1 = calculator.getAdd1();
                Integer add2 = calculator.getAdd2();
                sum = ""+(add1 + add2);
                calculator.setSum(sum);
            }
            catch (Exception e){
                e.printStackTrace();
                sum = "";
                calculator.setSum(sum);
            }
            try{
                Integer mult1 = calculator.getMult1();
                Integer mult2 = calculator.getMult2();
                product = ""+(mult1*mult2);
                calculator.setProduct(product);

            }catch (Exception e){
                e.printStackTrace();
                product = "";
                calculator.setProduct(product);
            }
            model.addAttribute("calculator", calculator);
            return"result";

        }
        else{
            model.addAttribute("errors", bindingResult.getAllErrors());
            model.addAttribute("calculator", calculator);
            return "result";
        }
    }
}
