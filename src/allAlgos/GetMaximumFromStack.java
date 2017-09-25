package allAlgos;

import java.util.Stack;

public class GetMaximumFromStack
{
	/**
	 * Cre­ate another another Stack(call it as track) which will keep track of max­i­mum in the given Stack(call it as main)
	 * When you insert an ele­ment in the main stack for the first time ( means it is empty), insert it in the track Stack as well.
	 * Now onwards when you insert a new element(say it is x) in the main Stack, peek() the ele­ment from the track Stack ( say it is ‘a’).
	 * Com­pare x and a and which ever is greater, insert it into track Stack.
	 * When you pop the ele­ment from the main stack, pop from the track Stack as well.
	 * So to get to know the max­i­mum ele­ment in the main Stack, peek the ele­ment in the track Stack.
	 */
	
	private static Stack main;
	private static Stack track;
	
	public static void main(String[] args) {
		main = new  Stack<>();
		track = new Stack<>();
		insertToMain(10);
		insertToMain(5);
		insertToMain(20);
		System.out.println(main.pop());
		track.pop();
		System.out.println(track.peek());
		System.out.println("------------------------");
		System.out.println(main.pop());
		track.pop();
		System.out.println(track.peek());
		
	}
	
	static void insertToMain(int value)
	{
		main.push(value);
		insertToTrack(value);
	}
	
	static void insertToTrack(int value)
	{
		if(track.isEmpty())
		{
			track.push(value);
		}else 
		{
			int topValue = (int) track.peek();
			if(topValue>value)
			{
				track.push(topValue);
			}else
			{
				track.push(value);
			}
		}
	}

}
