//********************************************************
// IMPORTS
// This is where you pull in code that's not in this file!
//********************************************************
import java.io.File;

//***********************
// This class does stuff!
//***********************
public class Stuff
{
    //*************************************************
    // This is the main method of a class
    // Only the class that is running needs this method
    //*************************************************
    public static void main(String[] args)
    {
        int i = 4;
        int a = 0;

        // while loop!
        while(i > 0)
        {
            a = a + 2;
            System.out.println("a: " + a);
            i--;
        }

        // How could this possibly be useful?
        System.out.println();

        // for loop!
        for(int b = 10; b < 20; b++)
        {
            if((b % 2) == 0)
            {
                System.out.println("b: " + b);
            }
        }
        
        // ???
        System.out.println();

        // This is how you comment out lots of code!
        Thing thing = new Thing();
        System.out.println(thing.stuff);

        int stuff = thing.doStuff(thing.stuff);
        System.out.println(stuff);

        String string = "String string";
        System.out.println(string);

        string = thing.doMoreStuff();
        System.out.println(string);
    }

    static class Thing
    {
        // This stuff belongs to Thing
        private int stuff;

        //*******************************
        // CONSTRUCTOR
        // This constructs things!
        //*******************************
        public Thing()
        {
            stuff = 27;
        }

        //******************************************
        // This is a method of thing that does stuff
        //******************************************
        private int doStuff(int moreStuff)
        {
            return (stuff*stuff) + moreStuff;
        }

        //************************************************
        // This is a method of thing that does other stuff
        //************************************************
        public String doMoreStuff()
        {
            return "This thing did stuff!";
        }
    }
    
    private class Banana
    {
        public Banana()
        {
            // Banana needs to be implemented
        }
    }
}