package com.solution.Behaviour.Interpretator;

import java.util.Date;

public class DayFormat extends AbstarctFormat{
    @Override
    public void execute(Format format) {
     String format1=format.getFormat();
        Date d=format.getDate();
        Integer day=new Integer(d.getDate());
        String dataset= format1.replaceAll("DD",d.toString());
        format.setFormat(dataset);
    }
}
