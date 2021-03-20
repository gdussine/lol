package fr.gdussine.lol.core;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ResultFuture<T> extends CompletableFuture<T> {

	public T get() {
		try {
			return super.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		return null;
	}

}
