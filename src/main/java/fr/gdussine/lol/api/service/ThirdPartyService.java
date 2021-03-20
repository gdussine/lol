package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

public interface ThirdPartyService {

	public CompletableFuture<String> code(String encryptedSummonerId);

}
