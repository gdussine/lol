package fr.gdussine.lol.api.model.match;

public enum Job {

	SUPPORT, BOT, TOP, JUNGLE, MID, UNKNOWN;

	public static Job get(Lane lane, Role role) {
		if (lane == Lane.TOP)
			return TOP;
		if (lane == Lane.MID)
			return MID;
		if (lane == Lane.JUNGLE)
			return JUNGLE;
		if ((lane == Lane.BOT || lane == Lane.BOTTOM) && role == Role.DUO_CARRY)
			return BOT;
		if ((lane == Lane.BOT || lane == Lane.BOTTOM) && role == Role.DUO_SUPPORT)
			return SUPPORT;
		return UNKNOWN;
	}

}
