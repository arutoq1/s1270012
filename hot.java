import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class hot{
    public static void main(String[] args){
	
	InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
	
	Random r = new Random();
	
	int h = 0;
	int t = 0;

	  System.out.println("Who are you?");
 
        String str = null;
        try {
            str = br.readLine();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
 
        System.out.println("Hello, " + str +"!");

	System.out.println("Tossing a coin...");

	for(int i=0; i<3; i++){

	    if(r.nextInt(2)==1){
		System.out.println("Round " +(i+1) +": Tails");
		t++;
	    }
	    else
		{
		System.out.println("Round " +(i+1) +": Heads");
		h++;
		}
	}
	System.out.println("Heads: " +h +", Tails: " +t);

	if(h > t)System.out.println(str +" won!");
	else System.out.println(str +" lost.");
    }
}
