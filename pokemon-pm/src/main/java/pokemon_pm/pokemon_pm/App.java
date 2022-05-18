package pokemon_pm.pokemon_pm;

import java.util.ArrayList;
import java.util.List;


public class App 
{
	public static void main( String[] args )
	{
		if(args.length == 1) {
			System.out.println("Movements sequence is: " + args[0]);
			
			String input = args[0];
			int numberPokemons = getNumberPokemons(input);
			System.out.println("Number of pokemons is : " +numberPokemons);
		}else
			System.err.println("Wrong input");

	}

	/**
	 * returns number of pokemon caught, from a movements sequence
	 * @param input movements sequence
	 * @return number of Pokemons caught
	 */
	public static int getNumberPokemons(String input) {
		MyPair currentPosition = new MyPair(0, 0);
		List<MyPair> visited = new ArrayList<>();
		visited.add(new MyPair(0, 0));
		input = input.toUpperCase();
		int i = 0;
		return 1+ getValueFromDirections(input,i, visited, currentPosition);
	}

	/**
	 * Changes ash's position and checks if ash already visited the new position
	 * @param direction one of the cardinal points
	 * @param visited list of positions already visited
	 * @param currentPosition ash's position
	 * @return whether new position has pokemon or not
	 */
	private static int getValueFromDirections(String sequence, int counter, List<MyPair> visited, MyPair currentPosition) {
		try {
			switch (sequence.charAt(counter)) {
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
				break;
			}
		}catch (IndexOutOfBoundsException e) { // end of input
			return 0;
		}
		++counter;
		if(!visited.contains(currentPosition)) {
			visited.add(new MyPair(currentPosition.getX(),currentPosition.getY()));
			return 1 + getValueFromDirections(sequence, counter, visited, currentPosition);
		}
		return getValueFromDirections(sequence, counter, visited, currentPosition);
	}
}
