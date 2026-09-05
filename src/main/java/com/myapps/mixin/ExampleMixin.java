package com.myapps.mixin;

import net.minecraft.world.level.block.piston.PistonStructureResolver;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(value = PistonStructureResolver.class, priority = 2000) // its fineeeee
public class ExampleMixin
{
	@ModifyConstant(method = "addBlockLine", constant = @Constant(intValue = PistonStructureResolver.MAX_PUSH_DEPTH), expect = 3)
	private int pushLimit(int original)
	{
		return Integer.MAX_VALUE;
	}
}
