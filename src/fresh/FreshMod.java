package fresh;

import arc.*;
import arc.graphics.Color;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class FreshMod extends Mod{

    public FreshMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Blocks.conveyor.hasShadow = false;
            Blocks.titaniumConveyor.hasShadow = false;

            Items.copper.color = Color.valueOf("b36b55");
            Items.lead.color = Color.valueOf("6d557e");
            Items.metaglass.color = Color.valueOf("adc4cf");
            Items.graphite.color = Color.valueOf("435467");
            Items.sand.color = Color.valueOf("f0d5a0");
            Items.coal.color = Color.valueOf("1f252f");
            Items.titanium.color = Color.valueOf("385997");
            Items.thorium.color = Color.valueOf("e469c5");
            Items.scrap.color = Color.valueOf("ad9f6d");
            Items.silicon.color = Color.valueOf("4a965a");
            Items.plastanium.color = Color.valueOf("97da58");
            Items.phaseFabric.color = Color.valueOf("17d2eb");
            Items.surgeAlloy.color = Color.valueOf("dcff16");
            Items.sporePod.color = Color.valueOf("9124eb");
            Items.blastCompound.color = Color.valueOf("f1552e");
            Items.pyratite.color = Color.valueOf("ffa621");
        });
    }

    @Override
    public void loadContent(){

    }

}
