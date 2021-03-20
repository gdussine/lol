package fr.gdussine.lol.utils;

import fr.gdussine.lol.api.model.match.Lane;
import fr.gdussine.lol.api.model.match.Role;

public enum Position {
	
	TOP, JUNGLE, MID, ADC, SUPPORT, NONE;
	
	public static Position get(Lane lane, Role role) {
		if(lane == Lane.MID)
			return MID;
		if(lane == Lane.TOP )
			return TOP;
		if(lane== Lane.JUNGLE )
			return JUNGLE;
		if(role == Role.DUO_CARRY)
			return ADC;
		if(role == Role.DUO_SUPPORT)
			return SUPPORT;
		return NONE;
	}

}
