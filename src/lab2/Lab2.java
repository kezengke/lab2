package lab2;
import java.util.Random;
public class Lab2
{

	public static void main(String[] args)
	{
		Random random1 = new Random();
		int score = 0;
		while (true)
		{
			int index = random1.nextInt(20);
			String question = FULL_NAMES[index];
			String correct_answer = SHORT_NAMES[index];
			
			
			System.out.println(question);
			long start = System.currentTimeMillis();
			String user_answer = System.console().readLine().toUpperCase();
			long end = System.currentTimeMillis();
			
			
			System.out.println(user_answer);
			

			if(user_answer.equals("QUIT"))
			{
				System.out.println("Test ends with score of "+ score);
				break;
			}
			
			else if(user_answer.equals(correct_answer))
			{
				++score;
				System.out.println("Right. Score = "+score + "; seconds = " + (end-start)/1000+"\n\n");
				
			}
			else
			{
				System.out.println("Wrong. should be "+correct_answer + "; seconds = " + (end-start)/1000);
				System.out.println("Test ends with score of "+ score);
				break;
			}
			
			
		}

	}
	
	
	public static String[] SHORT_NAMES = 
		{ "A","R", "N", "D", "C", "Q", "E", 
		"G",  "H", "I", "L", "K", "M", "F", 
		"P", "S", "T", "W", "Y", "V" };
	
	public static String[] FULL_NAMES = 
		{
		"alanine","arginine", "asparagine", 
		"aspartic acid", "cysteine",
		"glutamine",  "glutamic acid",
		"glycine" ,"histidine","isoleucine",
		"leucine",  "lysine", "methionine", 
		"phenylalanine", "proline", 
		"serine","threonine","tryptophan", 
		"tyrosine", "valine"};


}
