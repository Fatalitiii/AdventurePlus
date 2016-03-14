package com.fatalitiii.adventureplus.Events;

import com.fatalitiii.utilfatal.UtilFatal;

import net.minecraft.entity.Entity;

public class Events {

	public static void eventRun(Event event) {
		switch (event.getType()) {
		case EVENT_SPAWN:
			eventSpawn(event);
			break;
		case EVENT_TELEPORT:
			break;
		default:
			break;
		}

	}

	private static void eventSpawn(Event event) {
		Object entity = UtilFatal.Instance.getMobs().getMobClass(event.getEvent(), event.getWorld());
		if (entity != null) {
			((Entity) entity).setWorld(event.getWorld());
			((Entity) entity).setLocationAndAngles(event.getPosition().getX(), event.getPosition().getY(),
					event.getPosition().getZ(), 0F, 0.0F);
			event.getWorld().spawnEntityInWorld((Entity) entity);
		}
	}

}
