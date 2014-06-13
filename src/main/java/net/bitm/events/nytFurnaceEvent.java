package net.bitm.events;

import net.bitm.bonytechmod;
import net.minecraft.item.Item;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;

public class nytFurnaceEvent {
	@SubscribeEvent
	public void onPickup(PlayerEvent.ItemCraftedEvent e) {
		if (e.crafting.getItem() == Item.getItemFromBlock(bonytechmod.furnacenytidle)){
			e.player.addStat(bonytechmod.nytFurnaceAchievement, 1);
		}
	}
}
