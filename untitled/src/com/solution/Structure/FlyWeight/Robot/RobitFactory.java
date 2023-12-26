package com.solution.Structure.FlyWeight.Robot;

import java.util.HashMap;
import java.util.Map;

public class RobitFactory {
    private static Map<String,IRobot> robotCache = new HashMap<>();
    public static IRobot createRobot(String robotype){
        if(robotCache.containsKey(robotype)){
            robotCache.get(robotype);
            return robotCache.get(robotype);
        }else {
            if(robotype == "HUMANID"){
                Sprites sprites=new Sprites();
                IRobot ib=new HumanIRobot(robotype,sprites);
                robotCache.put(robotype,ib);
                return ib;
            } else if (robotype == "DOGID") {
                Sprites sprites=new Sprites();
                IRobot ib=new DogIRobot(robotype,sprites);
                robotCache.put(robotype,ib);
                return ib;
            }
        }
        return null;
    }

}
