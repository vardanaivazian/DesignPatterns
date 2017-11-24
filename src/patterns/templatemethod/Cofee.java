package patterns.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by User
 * Date: 11/24/2017
 * Time: 6:12 PM
 */
public class Cofee extends CaffeineBeverage {
	
	
	@Override
	protected void brew() {
		System.out.println("Dripping coffee through filter.");
	}

	@Override
	protected void addCondiments() {
		System.out.println("Adding sugar and milk.");
	}

	@Override
	protected boolean costumerWantsCondiments() {
		String answer = getUserInput();

		return answer.toLowerCase().startsWith("y");

	}

	private String getUserInput() {
		String answer = null;
		System.out.println("Would you like milk and sugar with your coffee (y/n) ?");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		try {
			answer = in.readLine();
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		if(answer == null) return "no";
		return answer;
	}
	
}
