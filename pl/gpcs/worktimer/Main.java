package pl.gpcs.worktimer;

import pl.gpcs.worktimer.exceptions.WrongNumberOfArgumentsException;

public class Main{
    public static void main(String[] args){
        if(args.length>3){
            throw new WrongNumberOfArgumentsException("Too many arguments have been specified. Please refer to help using -h switch.");
        }
        
    }
}