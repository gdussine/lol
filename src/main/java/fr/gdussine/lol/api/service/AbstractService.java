package fr.gdussine.lol.api.service;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

import fr.gdussine.lol.core.RiotRequesterHelper;
import okhttp3.HttpUrl;
import okhttp3.Response;

public abstract class AbstractService {

	protected static final String FORMAT = "/%s/%s/v%d/";

	protected ObjectMapper mapper;
	protected Logger log;
	protected RiotRequesterHelper requester;
	protected RiotService service;

	public AbstractService(RiotRequesterHelper requester) {
		this.mapper = new ObjectMapper();
		this.log = LoggerFactory.getLogger("RiotApi");
		this.requester = requester;
		this.service = this.getClass().getAnnotation(RiotService.class);
	}

	protected String getBasePath() {
		return String.format(FORMAT, service.game(), service.name(), service.version());
	}

	protected <T> T provideOne(Response response, Class<T> type) {
		try {
			return mapper.readValue(response.body().string(), type);
		} catch (IOException e) {
			log.trace(e.getMessage(), e);
		}
		return null;
	}

	protected <T> List<T> provideList(Response response, Class<T> type) {
		JavaType listType = mapper.getTypeFactory().constructCollectionLikeType(List.class, type);
		try {
			return mapper.readValue(response.body().string(), listType);
		} catch (IOException e) {
			log.trace(e.getMessage(), e);
		}
		return null;
	}

	protected <T> Set<T> provideSet(Response response, Class<T> type) {
		JavaType setType = mapper.getTypeFactory().constructCollectionLikeType(Set.class, type);
		try {
			return mapper.readValue(response.body().string(), setType);
		} catch (IOException e) {
			log.trace(e.getMessage(), e);
		}
		return null;

	}

	protected <T> CompletableFuture<T> one(Class<T> type, String format, Object... args) {
		HttpUrl url = requester.getApiUrl(getBasePath() + format, args);
		Function<Response, CompletableFuture<T>> f = x -> CompletableFuture.supplyAsync(() -> provideOne(x, type));
		return requester.enqueue(url).thenComposeAsync(f);
	}
	
	protected <T> CompletableFuture<T> one(Class<T> type, String format, Map<String, String> params, Object...args) {
		HttpUrl url = requester.getApiUrlWithParams(getBasePath() + format, params, args);
		Function<Response, CompletableFuture<T>> f = x -> CompletableFuture.supplyAsync(() -> provideOne(x, type));
		return requester.enqueue(url).thenComposeAsync(f);
	}

	protected <T> CompletableFuture<List<T>> list(Class<T> type, String format, Object... args) {
		HttpUrl url = requester.getApiUrl(getBasePath() + format, args);
		Function<Response, CompletableFuture<List<T>>> f = x -> CompletableFuture
				.supplyAsync(() -> provideList(x, type));
		return requester.enqueue(url).thenComposeAsync(f);
	}

	protected <T> CompletableFuture<Set<T>> set(Class<T> type, String format, Object... args) {
		HttpUrl url = requester.getApiUrl(getBasePath() + format, args);
		Function<Response, CompletableFuture<Set<T>>> f = x -> CompletableFuture.supplyAsync(() -> provideSet(x, type));
		return requester.enqueue(url).thenComposeAsync(f);
	}

	protected <T> CompletableFuture<Set<T>> set(Class<T> type, String format, Map<String, String> params, Object...args) {
		HttpUrl url = requester.getApiUrlWithParams(getBasePath() + format, params, args);
		Function<Response, CompletableFuture<Set<T>>> f = x -> CompletableFuture.supplyAsync(() -> provideSet(x, type));
		return requester.enqueue(url).thenComposeAsync(f);
	}

}
