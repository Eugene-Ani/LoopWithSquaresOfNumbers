package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class calculationModuleTest {

    @ParameterizedTest
    @CsvSource(value = {"'range 1-300',1,300","'range 9200-9801',9200,9801","'range 1-9801',1,9801"})
    void calculate(String name, int leftBorder, int rightBorder) {
        SQRService service = new SQRService();

        // вызываем целевой метод:
        int actual = (int) service.calculate(leftBorder, rightBorder);

        System.out.println(actual);
        System.out.println("made by Dad, enjoy!");
    }

        }