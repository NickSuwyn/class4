import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnhancedForLoops {
	
//	
//	for (StringBuilder builder : someKindOfCollection<StringBuilder>) {
//		System.out.println(builder.toString());
//	}
//	
	public static void main(String[] args) {
		Collection<PokemonCard> cards = new ArrayList<PokemonCard>();
		
		for (PokemonCard card : cards) {
			//do something with the current PokemonCard (referred to as `card`) we're looking at
		}
		
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j < 20; j++) {
				System.out.println("i=" + i + " : j=" + j);
			}
		}
		
		Map<String, List<String>> pokemonTeams = new HashMap<String, List<String>>();
		
		List<String> team1 = new ArrayList<String>();
		team1.add("Charizard");
		team1.add("Pikachu");
		team1.add("Squirtle");
		
		List<String> team2 = new ArrayList<String>();
		team2.add("Mew");
		team2.add("Mewtwo");
		team2.add("Charmander");
		
		List<String> team3 = new ArrayList<String>();
		team3.add("Dodrio");
		team3.add("Golem");
		team3.add("Onix");
		
		pokemonTeams.put("Losers", team1);
		pokemonTeams.put("Legends", team2);
		pokemonTeams.put("Rock", team3);
		
		for (String team : pokemonTeams.keySet()) {
			System.out.println("Team: " + team + "\n ---------------------");
			for (String pokemon : pokemonTeams.get(team)) {
				System.out.println(pokemon);
			}
		}
	}
	
}


class PokemonCard{}