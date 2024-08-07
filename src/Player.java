import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> wirte() {
        return List.of(name, Integer.toString(hitPoints), Integer.toString(strength), weapon);
    }

    @Override
    public void read(List<String> list) {
        if(list != null && list.size() > 0) {
            list.add(name);
            list.add(Integer.toString(hitPoints));
            list.add(Integer.toString(strength));
            list.add(weapon);
        }
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
