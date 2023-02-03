package me.GGEZ.module.player;

import io.netty.util.internal.ThreadLocalRandom;
import me.GGEZ.module.Category;
import me.GGEZ.module.Module;
import me.GGEZ.utils.TimerUtils;
import net.minecraft.client.Minecraft;
import net.minecraft.network.play.client.C01PacketChatMessage;

public class tutSpammer extends Module{

	public TimerUtils timer = new TimerUtils();
	
	public tutSpammer() {
		super("tutSpammer", 0, Category.PLAYER);
	}
	
	@Override
	public void onUpdate() {
		if(!this.isToggled()) return;
		
		int var = ThreadLocalRandom.current().nextInt(0, 3);
		
		
		if(timer.hasReached(2000L)) {
			if(var == 0) {
				int var1 = ThreadLocalRandom.current().nextInt();
				C01PacketChatMessage packet1 = new C01PacketChatMessage("WHATTT!!!  YOU DIDNT SUB TO MATTHEW286 ON YT?? " + var1);
				Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(packet1);
				timer.reset();
			}			 
			if(var == 1) {
				int var1 = ThreadLocalRandom.current().nextInt();
				C01PacketChatMessage packet2 = new C01PacketChatMessage("sub to Matthew286 on YT for good legit videos :) " + var1);
				Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(packet2);
				timer.reset();
			}
			if(var == 2) {
				int var1 = ThreadLocalRandom.current().nextInt();
				C01PacketChatMessage packet3 = new C01PacketChatMessage("omg.. you didnt sub to Matthew286 on YT!?!??!!? " + var1);
				Minecraft.getMinecraft().thePlayer.sendQueue.addToSendQueue(packet3);
				timer.reset();
			}
		}
		
	}

}
