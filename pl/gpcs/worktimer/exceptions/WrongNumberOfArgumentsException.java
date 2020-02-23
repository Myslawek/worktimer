package pl.gpcs.worktimer.exceptions;

public class WrongNumberOfArgumentsException extends Exception{
    private static final long serialVersionUID = 2293901l;

    public WrongNumberOfArgumentsException(){
        super();
    }

    public WrongNumberOfArgumentsException(String message){
        super(message);
    }

    public WrongNumberOfArgumentsException(String message, Throwable cause){
        super(message, cause);
    }
}