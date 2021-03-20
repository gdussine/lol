package fr.gdussine.lol.core;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeUnit;

import fr.gdussine.lol.constant.PlatformHost;
import okhttp3.Cache;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class RiotRequesterHelper {

	private final Headers headers;
	private final String scheme;
	private final PlatformHost platform;
	private final OkHttpClient client;

	public RiotRequesterHelper(String token, PlatformHost platform) {
		client = new OkHttpClient();
		headers = Headers.of("User-Agent", "Okhttp/3.0", "X-Riot-Token", token);
		scheme = "https";
		this.platform = platform;
	}

	public RiotRequesterHelper(String token, PlatformHost platform, File cacheDir, int cacheSize) {
		client = new OkHttpClient.Builder().cache(new Cache(cacheDir, cacheSize)).build();
		headers = Headers.of("User-Agent", "Okhttp/3.0", "X-Riot-Token", token);
		scheme = "https";
		this.platform = platform;
	}

	public HttpUrl getApiUrl(String segmentsFormat, Object... args) {
		return new HttpUrl.Builder().scheme(scheme).host(platform.getHost())
				.addPathSegments(String.format(segmentsFormat, args)).build();
	}

	public HttpUrl getPlatformlUrl(PlatformHost host, String segmentsFormat, Object... args) {
		return new HttpUrl.Builder().scheme(scheme).host(host.getHost())
				.addPathSegments(String.format(segmentsFormat, args)).build();
	}

	public HttpUrl getApiUrlWithParams(String segmentsFormat, Map<String, String> params, Object... args) {
		Builder url = new HttpUrl.Builder().scheme(scheme).host(platform.getHost())
				.addPathSegments(String.format(segmentsFormat, args));
		for (Entry<String, String> param : params.entrySet()) {
			url.addQueryParameter(param.getKey(), param.getValue());
		}
		return url.build();
	}

	public String runOld(HttpUrl httpUrl) {
		Request request = new Request.Builder()
				.cacheControl(new CacheControl.Builder().maxAge(10, TimeUnit.MINUTES).build()).url(httpUrl)
				.headers(headers).build();
		try (Response response = client.newCall(request).execute()) {
			return response.body().string();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

	public RiotRequestCallback enqueue(HttpUrl httpUrl) {
		Request request = new Request.Builder()
				.cacheControl(new CacheControl.Builder().maxAge(10, TimeUnit.MINUTES).build()).url(httpUrl)
				.headers(headers).build();
		RiotRequestCallback callback = new RiotRequestCallback();
		client.newCall(request).enqueue(callback);
		return callback;
	}

}
