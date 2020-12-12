package com.company.z1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Client {
    String name;
    String inn;

    public Client(String name, String inn) throws INNException {
        this.name = name;
        setInn(inn);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) throws INNException {
        Pattern pattern = Pattern.compile("^\\d{10}$");
        Matcher matcher = pattern.matcher(inn);
        if(matcher.find()){
            this.inn = inn;
        }
        else {
            throw new INNException("Недействительный ИНН", inn);
        }
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", inn='" + inn + '\'' +
                '}';
    }
}
