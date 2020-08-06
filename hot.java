import java.util.Random;

public class hot{
    public static void main(String[] args){
	Random r = new Random();
	int h = 0;
	int t = 0;

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
    }
}
