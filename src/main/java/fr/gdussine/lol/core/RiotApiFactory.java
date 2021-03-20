package fr.gdussine.lol.core;

import java.io.File;

import fr.gdussine.lol.constant.PlatformHost;

public class RiotApiFactory {

	public static RiotApi create(PlatformHost platform, String token) {
		return new RiotApiImpl(platform, token);
	}

	public static RiotApi create(PlatformHost platform, String token, String cachePath, int cacheSize) {
		File cacheDir = new File(cachePath);
		return new RiotApiImpl(platform, token, cacheDir, cacheSize);
	}

}
