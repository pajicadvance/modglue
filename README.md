# Mod Glue

This mod provides compatibility patches and data between certain mods.

There is no configuration, the patches automatically enable themselves if supported mods are detected.

This is primarily made for my personal modpacks and I'm hosting it on Modrinth for convenience and in case someone needs the same patches. Expect little to no support.

## Current patch list

- **EMI + Guarding**: Adds Netherite Shield recipe to EMI
- **EMI + Better Tridents**: Adds repair recipe for Trident to EMI
- **Mouse Tweaks + Bundle Scroll**: Disables item scrolling from Mouse Tweaks on bundles to let Bundle Scroll functionality take precedence
- **Notes**: Fixes the notes list being cut off at the bottom of the screen
- **Nullscape**: Added translations for biomes from Nullscape so the biome names can display properly on info overlays
- **Nyf's Quivers + Raised**: Adjusts the selected slot HUD element according to Raised hotbar positioning if its set to display next to the hotbar
- **ItemSwapper** list and palette support for the following mods:
  - Chalk (with Colorful Addon)
  - Comforts
  - Farmer's Delight
  - Guarding
- ~~**Particle Rain + Particular**: Adds Particular rain ripples to Particle Rain rain particles~~ Removed in 1.2.0 - Particle Rain 3.0+ can be configured to work with Particular in the mod config
- ~~**ElytraSwimFix + Trinkets**: Makes ElytraSwimFix work when the Elytra is equipped in a Trinkets slot~~ Removed in 1.2.0 - Accessorify has the same fix and lets you equip the Elytra in the Cape slot using Accessories API
- ~~**Farmer's Delight + Raised**: Adjusts the HUD elements from Farmer's Delight according to Raised hotbar positioning~~ Removed in 1.2.1 - Farmer's Delight Refabricated 2.3.0 added support for Raised