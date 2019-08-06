package com.thoughtworks.aceleradora.logica;

public class TradutorFizzBuzz {

    String traduz(int numero) {
        if(numero % 3 == 0 && numero % 5 == 0  ){
        return "FizzBuzz";
        }
        if(numero % 3 == 0){
            return "Fizz";
        }
        if(numero % 5 == 0){
            return "Buzz";
        }
        String outroNumero = String.valueOf(Integer.valueOf(String.valueOf(numero)));
        return outroNumero;
    }
}


