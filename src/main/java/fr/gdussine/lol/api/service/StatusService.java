package fr.gdussine.lol.api.service;

import java.util.concurrent.CompletableFuture;

import fr.gdussine.lol.api.model.status.ShardStatus;

public interface StatusService {

	public CompletableFuture<ShardStatus> shardData();

}
