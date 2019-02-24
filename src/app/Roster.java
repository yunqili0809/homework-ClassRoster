package app;

import java.util.ArrayList;
import java.util.Scanner;



public abstract class Roster {
    private ArrayList<String> names;
    private String title;
    public Roster(String title){
        this.title=title;
        this.names= new ArrayList<String>();
    }
    public void addName(){
        System.out.println("Please give a name.");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        for(String n : names){
           if(name.equals(n)){
               System.out.println("This name is already in the list.");
               return;
           }
        }
        names.add(name);
        sortNames();
            

    }
    public String getTitle(){
        return this.title;
    }
    public ArrayList<String> getNames(){
        return this.names;
    }
    public void setNames(ArrayList<String> names ){
        this.names=names;
    }
    public void sortNames(){
        for(int i = 0; i < names.size() - 1; i++){
            int smallest = i;
            for(int j = i + 1; j < names.size(); j++){
              if(names.get(j).compareTo(names.get(smallest))<0 )
                smallest = j;
            } 
          String x = names.get(i);
          names.set(i,names.get(smallest));
          names.set(smallest,x);
          }
    }
    
}