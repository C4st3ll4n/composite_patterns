import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

    ArrayList songComponents = new ArrayList();
    private String groupName;
    private String groupDescription;

    public SongGroup(String groupName, String groupDescription) {
        this.groupName = groupName;
        this.groupDescription = groupDescription;
    }

    @Override
    void add(SongComponent newComponent) {
        songComponents.add(newComponent);
    }

    @Override
    void remove(SongComponent newComponent) {
        songComponents.remove(newComponent);
    }

    @Override
    SongComponent get(int componentIndex) {
        return (SongComponent) songComponents.get(componentIndex);
    }

    @Override
    String getBandName() {
        return super.getBandName();
    }

    @Override
    String getSongName() {
        return super.getSongName();
    }

    @Override
    int getReleaseYear() {
        return super.getReleaseYear();
    }

    @Override
    void displaySongInfo() {
        System.out.println(groupName + " " + groupDescription + "\n");

        for (Object songComponent : songComponents) {
            SongComponent song = (SongComponent) songComponent;
            song.displaySongInfo();
        }
    }


    public String getGroupName() {
        return groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }
}
