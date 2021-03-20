package fr.gdussine.lol.core;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class RiotRequestCallback extends CompletableFuture<Response> implements Callback {

	@Override
	public void onFailure(Call call, IOException e) {
		super.completeExceptionally(e);
	}

	@Override
	public void onResponse(Call call, Response response) throws IOException {
		super.complete(response);
	}

}
