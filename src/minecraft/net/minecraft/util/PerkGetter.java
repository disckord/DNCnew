package net.minecraft.util;

import net.minecraft.src.Perk;

public class PerkGetter {
	
	public static Perk getPerkByName(String name)
	{
		
		if(name == "disckord")
		{
	
			return Perk.flame;
		}
		if(name == "Count Napula")
		{
			return Perk.bubbles;
		}
		else
		{
			return Perk.none;
		}
	}
}
