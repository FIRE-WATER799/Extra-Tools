
package net.mcreator.extratools.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.extratools.itemgroup.ExtraToolsItemGroup;
import net.mcreator.extratools.ExtraToolsModElements;

@ExtraToolsModElements.ModElement.Tag
public class GoldenBronzeSwordItem extends ExtraToolsModElements.ModElement {
	@ObjectHolder("extra_tools:golden_bronze_sword")
	public static final Item block = null;
	public GoldenBronzeSwordItem(ExtraToolsModElements instance) {
		super(instance, 3);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1473;
			}

			public float getEfficiency() {
				return 4f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 3, -2.8f, new Item.Properties().group(ExtraToolsItemGroup.tab)) {
		}.setRegistryName("golden_bronze_sword"));
	}
}
