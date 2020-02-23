package pl.gpcs.worktimer.view;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MenuView{
    private final Scanner scanner = new Scanner(new BufferedInputStream(System.in));
    private final File file;
    private final BufferedWriter fileWriter;
    private final BufferedReader fileReader;

    public MenuView(final String filePath) throws IOException{
        file = new File(filePath);        
        fileWriter = new BufferedWriter(new FileWriter(file));
        fileReader = new BufferedReader(new FileReader(file));
    }

    public void printMenu(){
        System.out.println("Available options:");
        System.out.println("-a switch adds the time to the work registration file.");
        System.out.println("-s switch displays the total work time in chose unit of time (available values: w - week, m - month, 2m - two months, 3m - three months, t - total work time)");
        System.out.println("-f switch used to specify the file that contains or should contain the data about the work time.");
        System.out.println("-h switch displays the program help and information about the switches.");
    }

    public void print(Object customMessage){
        System.out.println(customMessage);
    }
}