package com.solution.Behaviour.ChainOfResponsibility.LoggerSystem;

public class ErrorLogProcessor extends LoggerProcessor{
    public ErrorLogProcessor(LoggerProcessor nextlogProcessor) {
        super(nextlogProcessor);
    }

    @Override
    public void log(int loglevel, String message) {
        if(loglevel==ERROR){
            System.out.println("ERROR::::"+message);
        }else {
            super.log(loglevel,message);
        }
    }
}
