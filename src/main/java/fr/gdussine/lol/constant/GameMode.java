package fr.gdussine.lol.constant;

public class GameMode {

	private String gameMode;
	private String description;

	public String getGameMode() {
		return gameMode;
	}

	public void setGameMode(String gameMode) {
		this.gameMode = gameMode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "GameMode [gameMode=" + gameMode + ", description=" + description + "]";
	}

}
