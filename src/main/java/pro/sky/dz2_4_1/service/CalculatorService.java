package pro.sky.dz2_4_1.service;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public String greetings() {
        return "Добро пожаловать в калькулятор";
    }

    public float plus(float a, float b) {
        return a + b;
    }

    public float minus(float a, float b) {
        return a - b;
    }

    public float multiply(float a, float b) {
        return a * b;
    }

    public float divide(float a, float b) {
        return a / b;
    }

}

