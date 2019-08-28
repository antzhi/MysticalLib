package epicsquid.mysticallib.item;

import epicsquid.mysticallib.LibRegistry;
import epicsquid.mysticallib.model.CustomModelItem;
import epicsquid.mysticallib.model.CustomModelLoader;
import epicsquid.mysticallib.model.ICustomModeledObject;
import epicsquid.mysticallib.model.IModeledObject;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.ItemHoe;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;

public class ItemHoeBase extends ItemHoe implements IModeledObject, ICustomModeledObject {

  private boolean hasCustomModel = false;
  private final int enchantability;

  public ItemHoeBase(ToolMaterial material, String name, int toolLevel, int maxDamage, int enchantability) {
    super(material);
    setTranslationKey(name);
    setRegistryName(LibRegistry.getActiveModid(), name);
    setHarvestLevel("pickaxe", toolLevel);
    setMaxDamage(maxDamage);
    this.enchantability = enchantability;
  }

  @Override
  public int getItemEnchantability() {
    return enchantability;
  }

  public ItemHoeBase setModelCustom(boolean custom) {
    this.hasCustomModel = custom;
    return this;
  }

  @Override
  public void initModel() {
    ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "handlers"));
  }

  @Override
  public void initCustomModel() {
    if (this.hasCustomModel) {
      CustomModelLoader.itemmodels
          .put(getRegistryName(), new CustomModelItem(false, new ResourceLocation(getRegistryName().getNamespace() + ":items/" + getRegistryName().getPath())));
    }
  }
}