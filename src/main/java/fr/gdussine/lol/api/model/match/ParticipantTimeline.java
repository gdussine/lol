package fr.gdussine.lol.api.model.match;

import java.util.Map;

public class ParticipantTimeline {

	private int participantId;
	private Map<String, Double> csDiffPerMinDeltas;
	private Map<String, Double> damageTakenPerMinDeltas;
	private Role role;
	private Map<String, Double> damageTakenDiffPerMinDeltas;
	private Map<String, Double> xpPerMinDeltas;
	private Map<String, Double> xpDiffPerMinDeltas;
	private Lane lane;
	private Map<String, Double> creepsPerMinDeltas;
	private Map<String, Double> goldPerMinDeltas;

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public Map<String, Double> getCsDiffPerMinDeltas() {
		return csDiffPerMinDeltas;
	}

	public void setCsDiffPerMinDeltas(Map<String, Double> csDiffPerMinDeltas) {
		this.csDiffPerMinDeltas = csDiffPerMinDeltas;
	}

	public Map<String, Double> getDamageTakenPerMinDeltas() {
		return damageTakenPerMinDeltas;
	}

	public void setDamageTakenPerMinDeltas(Map<String, Double> damageTakenPerMinDeltas) {
		this.damageTakenPerMinDeltas = damageTakenPerMinDeltas;
	}

	public Map<String, Double> getDamageTakenDiffPerMinDeltas() {
		return damageTakenDiffPerMinDeltas;
	}

	public void setDamageTakenDiffPerMinDeltas(Map<String, Double> damageTakenDiffPerMinDeltas) {
		this.damageTakenDiffPerMinDeltas = damageTakenDiffPerMinDeltas;
	}

	public Map<String, Double> getXpDiffPerMinDeltas() {
		return xpDiffPerMinDeltas;
	}

	public void setXpDiffPerMinDeltas(Map<String, Double> xpDiffPerMinDeltas) {
		this.xpDiffPerMinDeltas = xpDiffPerMinDeltas;
	}

	public Map<String, Double> getCreepsPerMinDeltas() {
		return creepsPerMinDeltas;
	}

	public void setCreepsPerMinDeltas(Map<String, Double> creepsPerMinDeltas) {
		this.creepsPerMinDeltas = creepsPerMinDeltas;
	}

	public Map<String, Double> getGoldPerMinDeltas() {
		return goldPerMinDeltas;
	}

	public void setGoldPerMinDeltas(Map<String, Double> goldPerMinDeltas) {
		this.goldPerMinDeltas = goldPerMinDeltas;
	}

	public Map<String, Double> getXpPerMinDeltas() {
		return xpPerMinDeltas;
	}

	public void setXpPerMinDeltas(Map<String, Double> xpPerMinDeltas) {
		this.xpPerMinDeltas = xpPerMinDeltas;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Lane getLane() {
		return lane;
	}

	public void setLane(Lane lane) {
		this.lane = lane;
	}

}
