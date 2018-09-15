package lab2;
import java.util.Random;
public class Lab2
{

	public static void main(String[] args)
	{
		// taking in user input for numbers of question.
		System.out.println("How many sets of questions would you like to have?: ");
		int NumOQ = Integer.parseInt(System.console().readLine());
		
		System.out.println("Quiz starts now: ");
		
		Random random1 = new Random();
		int score = 0;
		for (int x=0; x<NumOQ;x++)
		{
			// randomly generating question with it's answer.
			int index = random1.nextInt(20);
			String question = FULL_NAMES[index];
			String correct_answer = SHORT_NAMES[index];
			
			System.out.println(question);
			
			// timing user input time costs.
			double start = System.currentTimeMillis();
			String user_answer = System.console().readLine().toUpperCase();
			double end = System.currentTimeMillis();
			
			double UsedTime = (end-start)/1000;
			
			// print user answer in upper-case.
			System.out.println(user_answer);
			
			// quit option
			if(user_answer.equals("QUIT"))
			{
				System.out.println("Test ends with score of "+ score);
				break;
			}
			
			// for right user input.
			else if(user_answer.equals(correct_answer))
			{
				++score;
				System.out.println("Right. Score = "+score + "; seconds = " + UsedTime + "\n\n");	
			}
			
			// for false user input and return correct answer.
			else
			{
				System.out.println("Wrong. should be " + correct_answer + "; Score = " + score + "; seconds = " + UsedTime + "\n\n");
			}
	
		}
		// ending phrase
		System.out.println(NumOQ + " questions completed.");
		System.out.println("Quiz ends with score of " + score);

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
