package com.api.service;


import org.springframework.stereotype.Service;

@Service
public class UtilService {

    public String mayorMenor (int edad){
        if (edad > 17){
            return "Es Mayor";
        } else {
            return "Es menor";
        }
    }

    public Integer suma (int numero1, int numero2){
        return numero1 + numero2;
    }

}
