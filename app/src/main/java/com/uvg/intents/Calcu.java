package com.uvg.intents;

public class Calcu {

    public double calculo(String val1, String val2, int calculo){
        double v1 = Double.valueOf(val1);
        double v2 = Double.valueOf(val2);
        if(calculo == 1){
            double res = v1*v2;
            return res;
        }else if(calculo == 2){
            double res = v1+v2;
            return res;
        }else if(calculo == 3){
            double res = v1-v2;
            return res;
        }else{
            double res = v1/v2;
            return res;
        }
    }
}
