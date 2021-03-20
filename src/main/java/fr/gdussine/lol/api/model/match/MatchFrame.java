package fr.gdussine.lol.api.model.match;

import java.util.List;
import java.util.Map;

public class MatchFrame {

	private long timestamp;

	private List<MatchEvent> events;

	private Map<String, MatchParticipantFrame> participantFrames;

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public List<MatchEvent> getEvents() {
		return events;
	}

	public void setEvents(List<MatchEvent> events) {
		this.events = events;
	}

	public Map<String, MatchParticipantFrame> getParticipantFrames() {
		return participantFrames;
	}

	public void setParticipantFrames(Map<String, MatchParticipantFrame> participantFrames) {
		this.participantFrames = participantFrames;
	}

}
