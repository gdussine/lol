package fr.gdussine.lol.api.model.match;

import java.util.List;

public class MatchEvent {

	private MatchEventType type;

	private String laneType, skillShot, ascendedType, eventType, levelUpType, wardType, towerType, pointCaptured,
			monsterType, monsterSubType, buildingType;

	private int skillSlot, creatorId, afterId, participantId, itemId, beforeId, teamId, killerId, victimId;

	private long timestamp;

	private List<Integer> assistingParticipantIds;

	private MatchPosition position;

	public MatchEventType getType() {
		return type;
	}

	public void setType(MatchEventType type) {
		this.type = type;
	}

	public String getLaneType() {
		return laneType;
	}

	public void setLaneType(String laneType) {
		this.laneType = laneType;
	}

	public String getSkillShot() {
		return skillShot;
	}

	public void setSkillShot(String skillShot) {
		this.skillShot = skillShot;
	}

	public String getAscendedType() {
		return ascendedType;
	}

	public void setAscendedType(String ascendedType) {
		this.ascendedType = ascendedType;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getLevelUpType() {
		return levelUpType;
	}

	public void setLevelUpType(String levelUpType) {
		this.levelUpType = levelUpType;
	}

	public String getWardType() {
		return wardType;
	}

	public void setWardType(String wardType) {
		this.wardType = wardType;
	}

	public String getTowerType() {
		return towerType;
	}

	public void setTowerType(String towerType) {
		this.towerType = towerType;
	}

	public String getPointCaptured() {
		return pointCaptured;
	}

	public void setPointCaptured(String pointCaptured) {
		this.pointCaptured = pointCaptured;
	}

	public String getMonsterType() {
		return monsterType;
	}

	public void setMonsterType(String monsterType) {
		this.monsterType = monsterType;
	}

	public String getMonsterSubType() {
		return monsterSubType;
	}

	public void setMonsterSubType(String monsterSubType) {
		this.monsterSubType = monsterSubType;
	}

	public String getBuildingType() {
		return buildingType;
	}

	public void setBuildingType(String buildingType) {
		this.buildingType = buildingType;
	}

	public int getSkillSlot() {
		return skillSlot;
	}

	public void setSkillSlot(int skillSlot) {
		this.skillSlot = skillSlot;
	}

	public int getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(int creatorId) {
		this.creatorId = creatorId;
	}

	public int getAfterId() {
		return afterId;
	}

	public void setAfterId(int afterId) {
		this.afterId = afterId;
	}

	public int getParticipantId() {
		return participantId;
	}

	public void setParticipantId(int participantId) {
		this.participantId = participantId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getBeforeId() {
		return beforeId;
	}

	public void setBeforeId(int beforeId) {
		this.beforeId = beforeId;
	}

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public int getKillerId() {
		return killerId;
	}

	public void setKillerId(int killerId) {
		this.killerId = killerId;
	}

	public int getVictimId() {
		return victimId;
	}

	public void setVictimId(int victimId) {
		this.victimId = victimId;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public List<Integer> getAssistingParticipantIds() {
		return assistingParticipantIds;
	}

	public void setAssistingParticipantIds(List<Integer> assistingParticipantIds) {
		this.assistingParticipantIds = assistingParticipantIds;
	}

	public MatchPosition getPosition() {
		return position;
	}

	public void setPosition(MatchPosition position) {
		this.position = position;
	}

}
