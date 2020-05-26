import java.util.ArrayList;
import java.util.List;

public class Athletes implements ISaveable{
    private String name;
    private String teamName;
    private int jerseyNumber;

    public Athletes(String name, String teamName, int jerseyNumber) {
        this.name = name;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public void setJerseyNumber(int jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    @Override
    public String toString() {
        return "Athletes{" +
                "name='" + name + '\'' +
                ", teamName='" + teamName + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                '}';
    }

    @Override
    public List<String> savedCharacters() {
        List<String> playerList = new ArrayList<>();
        playerList.add(0, this.name);
        playerList.add(1, "" + this.jerseyNumber);
        playerList.add(2,this.teamName);

        return playerList;
    }

    @Override
    public void read(List<String> savedValues) {
        if(savedValues != null && savedValues.size() > 0){
            this.name = savedValues.get(0);
            this.jerseyNumber = Integer.parseInt(savedValues.get(1));
            this.teamName = savedValues.get(2);
        }
    }
}
