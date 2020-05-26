import java.util.ArrayList;
import java.util.List;

public class Monsters implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monsters(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> savedCharacters() {
        List<String> monsterList = new ArrayList<>();
        monsterList.add(0 , this.name);
        monsterList.add(1, "" + this.hitPoints);
        monsterList.add(2,"" + this.strength);

        return monsterList;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues !=  null && savedValues.size() > 0){
           this.name = savedValues.get(0);
           this.hitPoints = Integer.parseInt(savedValues.get(1));
           this.strength = Integer.parseInt(savedValues.get(2));
        }
    }
}
