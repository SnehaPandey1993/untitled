package com.solution.Behaviour.Command.AirCondition;

import java.util.Stack;

public class MyRemoteControl {
    CommandI commandI;
Stack<CommandI> sta= new Stack<>();

     MyRemoteControl() {}
    public void setCommandI(CommandI commandI){
         this.commandI=commandI;
    }
    public void pressbuton(){
         commandI.execute();
         sta.add(commandI);
    }
    public void undo(){
         if(!sta.empty()){
             CommandI undo=sta.pop();
             undo.undo();
         }
    }
}
