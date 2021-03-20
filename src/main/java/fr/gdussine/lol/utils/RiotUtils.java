package fr.gdussine.lol.utils;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import fr.gdussine.lol.api.model.match.MatchList;
import fr.gdussine.lol.api.model.match.MatchReference;

public class RiotUtils {

	public static List<Integer> favoriteChampions(MatchList matchs) {
		HashMap<Integer, Integer> champions = new HashMap<Integer, Integer>();
		for (MatchReference matchRefs : matchs.getMatches()) {
			Integer championId = matchRefs.getChampion();
			champions.compute(championId, (k, v) -> v == null ? 0 : v + 1);
		}
		return champions.entrySet().parallelStream().sorted(new Comparator<Entry<Integer, Integer>>() {
			@Override
			public int compare(Entry<Integer, Integer> arg0, Entry<Integer, Integer> arg1) {
				return arg1.getValue() - arg0.getValue();
			}
		}).map(x -> x.getKey()).collect(Collectors.toList());
	}

	public static List<Position> favoritePositions(MatchList matchs) {
		HashMap<Position, Integer> positions = new HashMap<Position, Integer>();
		for (MatchReference matchRefs : matchs.getMatches()) {
			Position position = Position.get(matchRefs.getLane(), matchRefs.getRole());
			if (position != Position.NONE)
				positions.compute(position, (k, v) -> v == null ? 0 : v + 1);
		}
		return positions.entrySet().parallelStream().sorted(new Comparator<Entry<Position, Integer>>() {
			@Override
			public int compare(Entry<Position, Integer> arg0, Entry<Position, Integer> arg1) {
				return arg1.getValue() - arg0.getValue();
			}
		}).map(x -> x.getKey()).collect(Collectors.toList());
	}
	

}
