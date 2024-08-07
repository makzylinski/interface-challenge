import java.util.List;

public class Main {
    public static void main(String[] args) {
        Player player = new Player("Maximus", 250, 80);
        List<String> playerAttributes = player.wirte();
        player.read(playerAttributes);
        player.toString();
    }
}
