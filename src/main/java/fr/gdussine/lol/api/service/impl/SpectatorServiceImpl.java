package fr.gdussine.lol.api.service.impl;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.spectator.CurrentGameInfo;
import fr.gdussine.lol.api.model.spectator.FeaturedGames;
import fr.gdussine.lol.api.service.AbstractService;
import fr.gdussine.lol.api.service.RiotService;
import fr.gdussine.lol.api.service.SpectatorService;
import fr.gdussine.lol.core.RiotRequesterHelper;

@RiotService(game = "lol", name = "spectator", version = 4)
public class SpectatorServiceImpl extends AbstractService implements SpectatorService {

	private static final String ACTIVE_GAME = "active-games/by-summoner/%s";
	private static final String FEATURED_GAMES = "featured-games";

	public SpectatorServiceImpl(RiotRequesterHelper requester) {
		super(requester);
	}

	@Override
	public CompletableFuture<CurrentGameInfo> activeGame(String encryptedSummonerId) {
		return one(CurrentGameInfo.class, ACTIVE_GAME, encryptedSummonerId);
	}

	@Override
	public CompletableFuture<FeaturedGames> featuredGames() {
		return one(FeaturedGames.class, FEATURED_GAMES);
	}

}
