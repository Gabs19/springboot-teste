package com.example.hello.Erro;

public class CustomErrorType {
    private String messageError;


    public CustomErrorType(){

    }

    public CustomErrorType(String messageError){
        this.messageError = messageError;
    }

    public String getMessageError() {
        return messageError;
    }
}
