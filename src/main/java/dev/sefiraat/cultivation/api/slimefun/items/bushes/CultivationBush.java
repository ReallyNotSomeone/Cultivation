package dev.sefiraat.cultivation.api.slimefun.items.bushes;

import dev.sefiraat.cultivation.api.interfaces.CultivationFlora;
import dev.sefiraat.cultivation.api.interfaces.CustomPlacementBlock;
import dev.sefiraat.cultivation.api.slimefun.RecipeTypes;
import dev.sefiraat.cultivation.api.slimefun.groups.CultivationGroups;
import dev.sefiraat.cultivation.api.slimefun.items.CultivationFloraItem;
import dev.sefiraat.cultivation.api.slimefun.plant.Growth;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import org.bukkit.Location;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.inventory.ItemStack;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;

/**
 * This class is used to define a Bush that will grow as a {@link CultivationFlora}
 */
public abstract class CultivationBush extends CultivationFloraItem<CultivationBush>
    implements CultivationFlora, CustomPlacementBlock {

    @ParametersAreNonnullByDefault
    protected CultivationBush(SlimefunItemStack item, Growth growth) {
        this(item, RecipeTypes.BUSH_TRIMMING, new ItemStack[0], growth);
    }

    @ParametersAreNonnullByDefault
    protected CultivationBush(SlimefunItemStack item,
                              RecipeType recipeType,
                              ItemStack[] recipe,
                              Growth growth
    ) {
        this(item, recipeType, recipe, growth, null);
    }

    @ParametersAreNonnullByDefault
    protected CultivationBush(SlimefunItemStack item,
                              RecipeType recipeType,
                              ItemStack[] recipe,
                              Growth growth,
                              @Nullable ItemStack recipeOutput
    ) {
        super(CultivationGroups.BUSHES, item, recipeType, recipe, recipeOutput, growth);
    }

    @Override
    public int getMaxGrowthStages() {
        return 4;
    }

    @Override
    public void updateGrowthStage(@NotNull Location location, int growthStage) {
        // TODO
    }

    @Override
    protected void onBreak(@NotNull BlockBreakEvent event) {
        // TODO
    }
}