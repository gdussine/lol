package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.spectator.CurrentGameInfo;
import fr.gdussine.lol.api.model.spectator.FeaturedGames;

public interface SpectatorService {

	public CompletableFuture<CurrentGameInfo> activeGame(String encryptedSummonerId);
	
	public CompletableFuture<FeaturedGames> featuredGames();

}
