// create a roster with a max size of 16

package app;
import app.ClassRoster;

public class RosterTester {
    
    public static void main(String[] args) throws Exception {
        ClassRoster a = new ClassRoster("Mr.A's Class", 16);
        
        // add names to the roster
        for(int i = 0; i<17;i++){
            a.addName();
        }
        System.out.println(a.getNames());
        // attempt to add more than maxSize names

        // show the names were sorted alphabetically
        // randomize the list of names
        System.out.println("Shuffle:");
        System.out.println(a.shuffleNames());
        // select a random name
        System.out.println("Coldcall:");
        System.out.println(a.coldCall());
        // split the roster into two groups
        System.out.println("2Group:");
        System.out.println(a.randomGroups(2));
        // split the roster into three groups
        System.out.println("3Group:");
        System.out.println(a.randomGroups(3));
        // split the roster into four groups
        System.out.print("4Group:");
        System.out.print(a.randomGroups(4));
        // attempt to split the roster into zero groups
        System.out.print("0Group:");
        System.out.print(a.randomGroups(0));
    }
}
        