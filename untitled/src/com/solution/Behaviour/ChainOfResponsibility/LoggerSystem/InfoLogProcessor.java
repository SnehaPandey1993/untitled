package com.solution.Behaviour.ChainOfResponsibility.LoggerSystem;

public class InfoLogProcessor extends LoggerProcessor {
    public InfoLogProcessor(LoggerProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel == INFO){
            System.out.println("INFO::::"+message);
        }else{
            super.log(loglevel,message);
        }
    }
}
