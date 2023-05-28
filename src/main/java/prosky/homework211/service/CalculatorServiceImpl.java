package prosky.homework211.service;

import org.springframework.stereotype.Service;
import prosky.homework211.exception.ZeroDivideException;
@Service
public class CalculatorServiceImpl implements CalculatorService {


    @Override
    public int sum(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int subtract(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if(num2==0){
            throw new ZeroDivideException();
        }

        return num1/num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1*num2;
    }
}
