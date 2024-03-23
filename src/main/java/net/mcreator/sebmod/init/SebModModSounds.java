
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.sebmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.sebmod.SebModMod;

public class SebModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, SebModMod.MODID);
	public static final RegistryObject<SoundEvent> AMONGUSDEATH = REGISTRY.register("amongusdeath", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "amongusdeath")));
	public static final RegistryObject<SoundEvent> DEATHOFAMONGUS = REGISTRY.register("deathofamongus", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "deathofamongus")));
	public static final RegistryObject<SoundEvent> AMONGUSHURTED = REGISTRY.register("amongushurted", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "amongushurted")));
	public static final RegistryObject<SoundEvent> SKIBDI_DOP_DOP = REGISTRY.register("skibdi_dop_dop", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "skibdi_dop_dop")));
	public static final RegistryObject<SoundEvent> SKIP_A_T = REGISTRY.register("skip_a_t", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "skip_a_t")));
	public static final RegistryObject<SoundEvent> FORGOTHAM = REGISTRY.register("forgotham", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "forgotham")));
	public static final RegistryObject<SoundEvent> JUSTICE = REGISTRY.register("justice", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("seb_mod_", "justice")));
}
