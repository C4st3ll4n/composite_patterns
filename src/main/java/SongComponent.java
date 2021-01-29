public abstract class SongComponent {
    void add(SongComponent newComponent){
        throw new UnsupportedOperationException();
    }

    void remove (SongComponent newComponent){
        throw new UnsupportedOperationException();
    }

     SongComponent get(int componentIndex){
        throw new UnsupportedOperationException();
    }

    String getBandName(){
        throw new UnsupportedOperationException();
    }

    String getSongName(){
        throw new UnsupportedOperationException();
    }

    int getReleaseYear(){
        throw new UnsupportedOperationException();
    }

    void displaySongInfo(){
        throw new UnsupportedOperationException();
    }
}
