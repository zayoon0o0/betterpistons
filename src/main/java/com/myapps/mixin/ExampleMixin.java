package com.myapps.mixin;

import net.minecraft.world.level.block.piston.PistonStructureResolver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;

@Mixin(value = PistonStructureResolver.class, priority = 2000) // because sOmEoThEr modes have similer features and uh they all have tiny limits which arent int limit
public class ExampleMixin {

	@ModifyExpressionValue(
			method = "addBlockLine",
			at = @At(
					value = "CONSTANT",
					args = "intValue=12"
			)
	)
	private int pushLimit(int original) {
		return Integer.MAX_VALUE; // yes.
	}
}