import java.util.List;

public interface ISaveable {
    List<String> savedCharacters();
    void read(List<String> savedValues);

}