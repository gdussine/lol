package fr.gdussine.lol.api.service.impl;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.mastery.ChampionMastery;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.MasteryService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "champion-mastery", version = 4)
public class MasteryServiceImpl extends AbstractService implements MasteryService {

	private final static String BY_SUMMONER = "champion-masteries/by-summoner/%s",
			BY_SUMMONER_AND_CHAMPION = "champion-masteries/by-summoner/%s/by-champion/%d",
			SCORE_BY_SUMMONER = "scores/by-summoner/%s";

	public MasteryServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	public CompletableFuture<List<ChampionMastery>> bySummoner(String encryptedSummonerId) {
		return list(ChampionMastery.class, BY_SUMMONER, encryptedSummonerId);
	}

	public CompletableFuture<ChampionMastery> bySummonerAndChampion(String encryptedSummonerId, Long championId) {
		return one(ChampionMastery.class, BY_SUMMONER_AND_CHAMPION, encryptedSummonerId, championId);
	}

	public CompletableFuture<Integer> score(String encryptedSummonerId) {
		return one(Integer.class, SCORE_BY_SUMMONER, encryptedSummonerId);
	}

}
