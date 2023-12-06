package com.solution.Behaviour.Interpretator;

import java.util.Date;

public class YearFormat extends AbstarctFormat{
    @Override
    public void execute(Format format) {
        String format1=format.getFormat();
        Date d=format.getDate();
        Integer year=new Integer(d.getYear()+2000);
        String temp=format1.replaceAll("YYYY",year.toString());
        format.setFormat(temp);
    }
}
