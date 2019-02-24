package app;

import java.util.ArrayList;
import java.util.Collections;

public class  ClassRoster extends Roster {
    private int maxSize;
    public ClassRoster(String title,int maxSize){
        super(title);
        this.maxSize=maxSize;
    }
    @Override
    public void addName(){
        if(this.getNames().size()<maxSize){
          super.addName();
        }
        else{
          System.out.println("You're stupid");
        }
    }
    @Override
    public void sortNames(){
        int i,j;
        String key;
        for (j = 1; j < this.getNames().size(); j++) {
          key = this.getNames().get(j);
          i = j - 1;
          while (i >= 0) {
            if (key.compareTo(this.getNames().get(i)) > 0) {
              break;
            }
            this.getNames().set(i+1,this.getNames().get(i));
            i--;
          }
          this.getNames().set(i+1, key);
         
        }
    }
    public String coldCall(){
      int a = (int)Math.random()*this.getNames().size();  
      return getNames().get(a);

    }
    public ArrayList<String> shuffleNames(){
        ArrayList<String> n = getNames();
        for(int x = 0; x<this.getNames().size();x++){
          int i = (int)(Math.random()*this.getNames().size());
          String a = this.getNames().get(x);
          n.set(x,this.getNames().get(i));
          n.set(i,a);
        }
        return n;
    
    }
    public String[][] randomGroups(int groupCount){
      String[][] result;
      int a=0;
      if(groupCount < 2 || groupCount >= this.getNames().size()){
          System.out.println("Your requst doesnot make sense.");
          result = new String[1][1];
      }
      else{
          if(this.getNames().size() % groupCount == 0){ 
              result = new String[groupCount][(this.getNames().size() / groupCount)];
          }
          else{
              result = new String[groupCount][(this.getNames().size() / groupCount) + 1];
          }
      
          ArrayList<String> x = this.getNames();
          Collections.shuffle(x);

          for(int i = 0; i< groupCount; i++){
              for(int j = 0; j < result[0].length; j++){
                  result[i][j] = x.get(a);
                  a++;
                  if(a == x.size()){
                  break;}
              }
          }
  }

      return result;
  }

}