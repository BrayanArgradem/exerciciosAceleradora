package com.thoughtworks.aceleradora.logica;

public class TradutorFizzBuzz {

    String traduz(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0 ){
        return "FizzBuzz";
    }
        if (numero % 3 == 0) {
            return "Fizz";
        } else {
            System.out.println("nada");
        }
//        String numero = Integer.parseInt(3); //numero == "2"

        if (numero % 5 == 0){
            return "Buzz";
        }
        return null;
    }

}