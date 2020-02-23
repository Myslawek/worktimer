package pl.gpcs.worktimer.controller;

import pl.gpcs.worktimer.view.MenuView;

public class MainController{
    private MenuView menuView;
    
    private MainController(){ //TODO: will be used for interactive mode
        
    }

    public MainController(String[] args){ //used for non-interactive mode
        handleArguments(args);
    }

    private void handleArguments(String[] parameters){
        System.out.println("Welcome to Worktimer");
        for(String parameter : parameters){
            switch(parameter){
                case "-a":
                break;
                case "-h":
                break;
                case "-s":
                break;
                case "-f":
                break;
            }
        }
    }
}