package fr.gdussine.lol.constant.sprite;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public enum SpriteType {
	PROFILE_ICON("http://ddragon.leagueoflegends.com/cdn/10.11.1/img/profileicon/%d.png"),
	CHAMPION_SQUARE("http://ddragon.leagueoflegends.com/cdn/10.11.1/img/champion/%s.png");

	private String url;

	private SpriteType(String url) {
		this.url = url;
	}

	public static InputStream provide(SpriteType type, Object... args) {
		try {
			URLConnection connection = new URL(String.format(type.url, args)).openConnection();
			connection.setRequestProperty("User-Agent", "xxxxxx");
			return connection.getInputStream();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
