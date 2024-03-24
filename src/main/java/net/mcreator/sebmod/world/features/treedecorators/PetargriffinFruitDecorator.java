
package net.mcreator.sebmod.world.features.treedecorators;

import com.mojang.serialization.Codec;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD) public class PetargriffinFruitDecorator extends CocoaDecorator {

    public static Codec<PetargriffinFruitDecorator> CODEC = Codec.unit(PetargriffinFruitDecorator::new);

    public static TreeDecoratorType<?> DECORATOR_TYPE = new TreeDecoratorType<>(CODEC);

    @SubscribeEvent public static void registerPointOfInterest(RegisterEvent event) {
        event.register(ForgeRegistries.Keys.TREE_DECORATOR_TYPES, registerHelper -> registerHelper.register("petargriffin_tree_fruit_decorator", DECORATOR_TYPE));
    }

    public PetargriffinFruitDecorator() {
        super(0.2f);
    }

    @Override protected TreeDecoratorType<?> type() {
        return DECORATOR_TYPE;
    }

    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */

}
