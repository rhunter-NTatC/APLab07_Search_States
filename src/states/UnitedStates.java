package states;
import java.util.*;
import java.io.*; 

public class UnitedStates
{
	// instance variables
	private ArrayList <State> states;
	
	public UnitedStates()
	{
	   states = new ArrayList <State> ();
	   
	   readFile();
	   printStates();
	   
	   searchStates();	
	}
	
	public void searchStates()
	{
		Scanner keyboard = new Scanner(System.in);
		String ans = "y";
		System.out.println();
		System.out.println("=====================");
		System.out.println("     Searching");
		System.out.println("=====================");
		
		while(ans.equalsIgnoreCase("y"))
		{
			System.out.println();
			System.out.print("Enter state --> ");
			String stateName = keyboard.nextLine();
			
			/*
			 * After binarySearch() is complete
			 * comment that line out and uncomment
			 * the line below it.  This way you can write
			 * and test binarySearchRecursive
			 */
			State state = binarySearch(stateName);
			//State state = binarySearchRecursive(stateName, 0, states.size()-1);
			
			if(state == null)
			   System.out.println("State not found");
			else
			{
		      System.out.println();
			  System.out.println("State Name       = " + state.getName());
			  System.out.println("State Capital    = " + state.getCapital());
			  System.out.println("State Nickname   = " + state.getNickname());
			  System.out.println("State Population = " + state.getPopulation());
			  System.out.println();	
			}
			
			   
			System.out.println();
			System.out.print("Search again[Y/N]? ");
			ans = keyboard.nextLine();

		}
	}
			
	// Performs a binarySearch on states searching for key
    // If key is found it returns the State object that
    // corresponds to key; otherwise it returns null
	public State binarySearch(String key)
	{


		return null;

	}
	
	
	
	// Performs a recursive binarySearch on states 
	//   searching for key.  NO LOOPS ALLOWED!!
    // If key is found it returns the State object that
    // corresponds to key; otherwise it returns null
	public State binarySearchRecursive(String key, int min, int max)
	{


		return null;

	}
	
	
	
	
	
	
	public void printStates()
	{
		for(State s : states)
		{
			System.out.printf("%-15s", s.getName());
			System.out.printf("%-15s", s.getCapital());
			System.out.printf("%-25s", s.getNickname());
			System.out.printf("%10s\n", s.getPopulation());	
		}
	}
	
	public void readFile()
	{
		Scanner scan = null;
		try
		{
			scan = new Scanner(new File("states.txt"));
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not Found!");
		}
		
		String name;
		String capital;
		String nickname;
		int population;
		while(scan.hasNextLine())
		{
			name = scan.nextLine();
			capital = scan.nextLine();
			nickname = scan.nextLine();
			population = scan.nextInt();
			if(scan.hasNextLine())
			{
			  String dummy = scan.nextLine();	
			}
			  
			
			State state = new State(name, capital, nickname, population);
			states.add(state);
		}
		
		
		
	}
}