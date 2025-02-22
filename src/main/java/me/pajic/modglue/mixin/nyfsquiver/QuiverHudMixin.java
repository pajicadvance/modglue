package me.pajic.modglue.mixin.nyfsquiver;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import com.nyfaria.nyfsquiver.client.QuiverHud;
import com.nyfaria.nyfsquiver.config.Anchor;
import com.nyfaria.nyfsquiver.config.NQConfigClient;
import me.pajic.modglue.raised.NyfsQuiverCompat;
import net.fabricmc.loader.api.FabricLoader;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@IfModLoaded("nyfsquiver")
@Mixin(QuiverHud.class)
public class QuiverHudMixin {

    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/nyfaria/nyfsquiver/config/NQConfigClient;getHorizontalOffset()I"
            )
    )
    private int adjustHorizontalOffset(int original) {
        if (FabricLoader.getInstance().isModLoaded("raised") && (NQConfigClient.getAnchor() == Anchor.HOTBAR_LEFT || NQConfigClient.getAnchor() == Anchor.HOTBAR_RIGHT)) {
            return NyfsQuiverCompat.runX(original);
        }
        return original;
    }

    @ModifyExpressionValue(
            method = "render(Lnet/minecraft/client/gui/GuiGraphics;Lnet/minecraft/client/DeltaTracker;)V",
            at = @At(
                    value = "INVOKE",
                    target = "Lcom/nyfaria/nyfsquiver/config/NQConfigClient;getVerticalOffset()I"
            )
    )
    private int adjustVerticalOffset(int original) {
        if (FabricLoader.getInstance().isModLoaded("raised") && (NQConfigClient.getAnchor() == Anchor.HOTBAR_LEFT || NQConfigClient.getAnchor() == Anchor.HOTBAR_RIGHT)) {
            return NyfsQuiverCompat.runY(original);
        }
        return original;
    }
}
