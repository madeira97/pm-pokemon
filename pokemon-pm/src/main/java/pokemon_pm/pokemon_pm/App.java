package pokemon_pm.pokemon_pm;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class App 
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Movements sequence is: " + args[0]);
		
		String input = args[0];
		int numberPokemons = getNumberPokemons(input);
		System.out.println("Number of pokemons is : " +numberPokemons);
		sc.close();
	}

	/**
	 * returns number of pokemon caught, from a movements sequence
	 * @param input movements sequence
	 * @return number of Pokemons caught
	 */
	public static int getNumberPokemons(String input) {
		int counter = 1;
		MyPair currentPosition = new MyPair(0, 0);
		List<MyPair> visited = new ArrayList<>();
		visited.add(new MyPair(0, 0));
		input = input.toUpperCase();
		for (int i = 0; i < input.length(); i++) {
			counter+= (getValueFromDirection(input.charAt(i), visited, currentPosition) ? 1 : 0);
		}

		return counter;
	}

	/**
	 * Changes ash's position and checks if ash already visited the new position
	 * @param direction one of the cardinal points
	 * @param visited list of positions already visited
	 * @param currentPosition ash's position
	 * @return whether new position has pokemon or not
	 */
	private static boolean getValueFromDirection(char direction, List<MyPair> visited, MyPair currentPosition) {
		switch (direction) {
		case 'N':
			currentPosition.incrementDirectionVertical();
			break;

		case 'S':
			currentPosition.decrementDirectionVertical();
			break;

		case 'E':
			currentPosition.incrementDirectionHorizontal();
			break;

		case 'O':
			currentPosition.decrementDirectionHorizontal();
			break;
			
		default:
			break; // returns false due to being in the same position
		}
		
		if(visited.contains(currentPosition)) {
			return false;
		}else 
			return visited.add(new MyPair(currentPosition.getX(),currentPosition.getY()));
		
	}
}
