package epicsquid.mysticallib.factories;

import epicsquid.mysticallib.item.AxeItem;
import epicsquid.mysticallib.item.KnifeItem;
import epicsquid.mysticallib.item.PickaxeItem;
import epicsquid.mysticallib.material.MaterialProperties;
import net.minecraft.item.HoeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;

public class ToolFactories {

	public static class SwordFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new SwordItem(props.getTier(), props.getDamage("SWORD"), props.getAttackSpeed("SWORD"), props.getItemProps());
		}
	}

	public static class PickaxeFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new PickaxeItem(props.getTier(), props.getDamage(), props.getAttackSpeed(), props.getItemProps());
		}
	}

	public static class AxeFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new AxeItem(props.getTier(), props.getDamage("AXE"), props.getAttackSpeed("AXE"), props.getItemProps());
		}
	}

	public static class ShovelFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new ShovelItem(props.getTier(), props.getDamage(), props.getAttackSpeed(), props.getItemProps());
		}
	}

	public static class HoeFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new HoeItem(props.getTier(), props.getAttackSpeed(), props.getItemProps());
		}
	}

	public static class KnifeFactory implements IItemFactory {
		@Override
		public Item create(MaterialProperties props) {
			return new KnifeItem(props.getTier(), props.getDamage("KNIFE"), props.getAttackSpeed("KNIFE"), props.getItemProps());
		}
	}
}
