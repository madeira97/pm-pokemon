package pokemon_pm.pokemon_pm;

import java.util.HashSet;

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
		HashSet<MyPair> visited = new HashSet<>();
		MyPair currentPosition = new MyPair(0, 0);
		visited.add(new MyPair(0, 0));
		input = input.toUpperCase();
		for (int i = 0; i < input.length(); i++) {
			getValueFromDirection(input.charAt(i), visited, currentPosition);
		}

		return visited.size();
	}

	/**
	 * Changes ash's position and checks if ash already visited the new position
	 * @param direction one of the cardinal points
	 * @param visited list of positions already visited
	 * @param currentPosition ash's position
	 * @return result of adding position to set
	 */
	private static boolean getValueFromDirection(char direction, HashSet<MyPair> visited, MyPair currentPosition) {
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

		return visited.add(new MyPair(currentPosition.getX(),currentPosition.getY()));
	}
}
