package keepcalm.mods.blockbreak;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.event.Event;

public class BlockBreakEvent extends Event {
		public final World world;
		public final int blockX;
		public final int blockY;
		public final int blockZ;
		public final Block block;
		public final int blockMeta;
		public final EntityPlayer player;
	    public BlockBreakEvent(World world, int x, int y, int z, Block block, int metadata, EntityPlayer entityPlayer) {
	    	super();
	    	this.world = world;
	    	blockX = x;
	    	blockY = y;
	    	blockZ = z;
	    	this.block = block;
	    	blockMeta = metadata;
	    	player = entityPlayer;
	    }
}
