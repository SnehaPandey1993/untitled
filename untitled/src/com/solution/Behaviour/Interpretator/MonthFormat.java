package com.solution.Behaviour.Interpretator;

import java.util.Date;

public class MonthFormat extends AbstarctFormat{
    @Override
    public void execute(Format format) {
        String format1= format.getFormat();
        Date d=format.getDate();
        Integer month= new Integer(d.getMonth()+1);
        String temp=format1.replaceAll("MM",month.toString());
        format.setFormat(temp);
    }
}
