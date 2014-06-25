package tutorial.mod;

/* Imports  */
import net.minecraft.block.material.Material;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

/* Needed for forge mods */
@Mod(modid = "TutorialMod", name = "Tutorial Mod", version = "v1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class TutorialMod {
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
        
    }
}