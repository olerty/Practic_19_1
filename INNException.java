package com.company.z1;

public class INNException extends Exception {
    private String inn;
    public String getInn(){return inn;}
    public INNException(String message, String str){
        super(message);
        inn = str;
    }
}
