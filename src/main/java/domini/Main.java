package domini;

import domini.Dummy.Dummy;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;


public class Main extends JavaPlugin {

    private static Main plugin;
    public Logger log;
    public final String prefix = "§f[ §eDomini §f] ";
    public static Main getInstance() {
        return plugin;
    }

    @Override
    public void onEnable() {
        plugin = this;
        log = getLogger();
        log.info(prefix + "Domi 플러그인 활성화.");
        getCommand("커스텀이름표").setExecutor(new Dummy());
    }
}
