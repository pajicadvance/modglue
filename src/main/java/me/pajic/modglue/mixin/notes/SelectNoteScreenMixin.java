package me.pajic.modglue.mixin.notes;

import com.chaosthedude.notes.gui.NotesList;
import com.chaosthedude.notes.gui.SelectNoteScreen;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import com.moulberry.mixinconstraints.annotations.IfModLoaded;
import net.minecraft.client.Minecraft;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@IfModLoaded("notes")
@Mixin(SelectNoteScreen.class)
public class SelectNoteScreenMixin {

    @WrapOperation(
            method = "init",
            at = @At(
                    value = "NEW",
                    target = "(Lcom/chaosthedude/notes/gui/SelectNoteScreen;Lnet/minecraft/client/Minecraft;IIII)Lcom/chaosthedude/notes/gui/NotesList;"
            )
    )
    private NotesList fixListHeight(SelectNoteScreen notesScreen, Minecraft mc, int width, int height, int top, int bottom, Operation<NotesList> original) {
        return original.call(notesScreen, mc, width, height - 54, top, bottom);
    }
}
