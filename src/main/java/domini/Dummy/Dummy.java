package domini.Dummy;

import domini.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class Dummy implements CommandExecutor {

    private final Main plugin = Main.getInstance();

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull org.bukkit.command.Command command, @NotNull String label, @NotNull String[] args) {
        if (!sender.isOp()) {
            sender.sendMessage("§cYou don't have permission to use this command!");
            sender.sendMessage("§c권한이 없습니다.");
            return false;
        }
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /커스텀이름표 플레이어 <닉네임> ");
            sender.sendMessage("§cUsage: /커스텀이름표 보기");
            return false;
        }
        if (args[0].equalsIgnoreCase("플레이어")) {
            if (args.length == 1) {
                Player p = (Player) sender;
                p.sendMessage(plugin.prefix + "뭔가 잘못 입력 하셨어요!");}
            if (args.length == 2){
                Player tragetPlayer = Bukkit.getPlayer(args[1]);
                String Trgn = tragetPlayer.getName();
                tragetPlayer.setCustomName("\uE003\uE004\uE005\uF801\uF802\uf803\uF804\uF805\uf806\uF807\uF808\uf809\uF80a\uF80b\uf80c"+Trgn);
                Player p = (Player) sender;
                p.sendMessage(plugin.prefix + "이름표 변경을 완료 하였습니다!");
            }else {
                Player p = (Player) sender;
                p.sendMessage(plugin.prefix + "이름표 변경을 완료 하였습니다!");
            }
        }
        if (args[0].equalsIgnoreCase("보기")) {
            Player p = (Player) sender;
            ArmorStand ar = (ArmorStand) p.getPlayer().getWorld().spawnEntity(p.getPlayer().getLocation().add(0, 3, 0), EntityType.ARMOR_STAND);
            ar.setGravity(false);
            ar.setCustomNameVisible(true);
            ar.setCustomName("\uF809\uE003\uF801\uE004\uF801\uE004\uF801\uE004\uF805\uE005");

        }
        return false;
    }
}

