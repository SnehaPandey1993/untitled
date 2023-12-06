package com.solution.Behaviour.ChainOfResponsibility.LoggerSystem;

public abstract class LoggerProcessor {
    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;
    LoggerProcessor nextlogProcessor;

    public LoggerProcessor(LoggerProcessor nextlogProcessor) {
        this.nextlogProcessor = nextlogProcessor;
    }
    public void log(int loglevel, String message){
        if(nextlogProcessor !=null){
            nextlogProcessor.log(loglevel, message);
        }
    }
}
