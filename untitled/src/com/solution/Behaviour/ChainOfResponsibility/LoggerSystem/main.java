package com.solution.Behaviour.ChainOfResponsibility.LoggerSystem;

public class main {
    public static void main(String args[]){
        LoggerProcessor log=new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        log.log(LoggerProcessor.ERROR,"exception handle");
        log.log(LoggerProcessor.DEBUG,"debug handle");
        log.log(LoggerProcessor.INFO,"info handle");
    }
}
