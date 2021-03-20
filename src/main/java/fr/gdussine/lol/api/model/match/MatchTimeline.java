package fr.gdussine.lol.api.model.match;

import java.util.List;

public class MatchTimeline {

	private List<MatchFrame> frames;

	private long frameInterval;

	public List<MatchFrame> getFrames() {
		return frames;
	}

	public void setFrames(List<MatchFrame> frames) {
		this.frames = frames;
	}

	public long getFrameInterval() {
		return frameInterval;
	}

	public void setFrameInterval(long frameInterval) {
		this.frameInterval = frameInterval;
	}

}
