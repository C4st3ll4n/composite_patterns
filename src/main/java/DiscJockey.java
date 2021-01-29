public class DiscJockey {
    private SongComponent songList;

    public DiscJockey(SongComponent songList) {
        this.songList = songList;
    }

    void getSongList(){
        songList.displaySongInfo();
    }


}
