package domini.commands;

import domini.util.DisplayedCharLength;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class NamePlateCommand implements CommandExecutor {

    private static final String BLANK = "...";  //TODO()
    private static String input = "Dasdasdasd";

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull org.bukkit.command.Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sender.sendMessage("§cUsage: /커스텀이름표 플레이어 <닉네임> ");
            sender.sendMessage("§cUsage: /커스텀이름표 보기");
            return false;
        }

        if (args[0].equalsIgnoreCase("플레이어")) {
            if (args.length == 1) {
                Player p = (Player) sender;
                p.sendMessage("뭔가 잘못 입력 하셨어요!");
            }

            if (args.length == 2) {
                Player tragetPlayer = Bukkit.getPlayer(args[1]);
                String Trgn = tragetPlayer.getName();

                input = tragetPlayer.getDisplayName();
                var length = DisplayedCharLength.getLength(input);
                int Emoji = length/9;


                tragetPlayer.setCustomName(input+Trgn);
                Player p = (Player) sender;
                p.sendMessage("이름표 변경을 완료 하였습니다!");
            } else {
                Player p = (Player) sender;
                p.sendMessage("이름표 변경을 완료 하였습니다!");
            }
        }
        if (args[0].equalsIgnoreCase("보기")) {
            Player p = (Player) sender;
            ArmorStand ar = (ArmorStand) p.getPlayer().getWorld().spawnEntity(p.getPlayer().getLocation().add(0, 3, 0), EntityType.ARMOR_STAND);
            ar.setGravity(false);
            ar.setCustomNameVisible(true);

        }
        return true;
        //\uF809\uE000\uF801\uE001\uF801\uE001\uF801\uF808\uF805\uE001\uF801\uE002\uF801\uF809\uF803\uF809\uF809
    }
}
