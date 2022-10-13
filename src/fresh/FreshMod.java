package fresh;

import arc.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.mod.*;

public class FreshMod extends Mod{

    public FreshMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Blocks.conveyor.hasShadow = false;
            Blocks.titaniumConveyor.hasShadow = false;
        });
    }

    @Override
    public void loadContent(){

    }

}
