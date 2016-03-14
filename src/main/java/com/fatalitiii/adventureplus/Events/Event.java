package com.fatalitiii.adventureplus.Events;

import java.util.HashMap;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class Event {

	private EventTypes type;
	private HashMap<String, Object> values;

	public Event(EventTypes type, int ID, World world, BlockPos pos, String e) {
		this.type = type;
		values.put("ID", ID);
		values.put("World", world);
		values.put("Position", pos);
		values.put("Event", e);
	}

	public EventTypes getType() {
		return type;
	}

	public World getWorld() {
		return (World) values.get("World");
	}

	public BlockPos getPosition() {
		return (BlockPos) values.get("Position");
	}

	public String getEvent() {
		return (String) values.get("Event");
	}
}
