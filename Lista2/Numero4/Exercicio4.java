package Poo;

public class Exercicio4  {
    public String ConveterBina(int n){

        if (n == 0 ) {
            return "0";
        }
        if (n == 1 ) {
            return "1";
        }
        int a = n % 2;
        return ConverterBina(n/2)+ a;
    }
}
    

