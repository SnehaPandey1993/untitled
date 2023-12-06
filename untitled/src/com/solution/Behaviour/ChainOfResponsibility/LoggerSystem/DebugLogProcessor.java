package com.solution.Behaviour.ChainOfResponsibility.LoggerSystem;

public class DebugLogProcessor extends LoggerProcessor {
    public DebugLogProcessor(LoggerProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }
    public void log(int loglevel,String message){
        if(loglevel==DEBUG){
            System.out.println("DEBUG:::::"+message);

        }else {
            super.log(loglevel,message);
        }
    }
}
