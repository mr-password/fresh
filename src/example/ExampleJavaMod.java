package example;

import arc.*;
import arc.util.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.EventType.*;
import mindustry.gen.*;
import mindustry.mod.*;
import mindustry.ui.dialogs.*;

public class ExampleJavaMod extends Mod{

    public ExampleJavaMod(){
        Events.on(ClientLoadEvent.class, e -> {
            Blocks.conveyor.hasShadow = false;
        });
    }

    @Override
    public void loadContent(){

    }

}
