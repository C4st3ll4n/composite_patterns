public class SongMain {
    public static void main(String[] args) {
        SongComponent bregaMusics = new SongGroup("Brega (passado)", "Brega music");

        SongComponent tecnoBregaMusics = new SongGroup("Tecnobrega (Melody)", "Melody music");

        SongComponent marcanteMusics = new SongGroup("Marcantes", "Brega music that is remarkable");

        SongComponent everySong = new SongGroup("Song List", "Every song on Pará");
        everySong.add(bregaMusics);
        everySong.add(tecnoBregaMusics);
        everySong.add(marcanteMusics);

        bregaMusics.add(new Song("Pensa em mim", "Fruto sensual", 2008));
        bregaMusics.add(new Song("Pensa em nós", "Fruto sensual", 2009));
        bregaMusics.add(new Song("Está no ar", "Fruto sensual", 2006));

        tecnoBregaMusics.add(new Song("Tremidinha","Bufálo do Marajó",2015 ));
        tecnoBregaMusics.add(new Song("Agora é o Bufálo","Bufálo do Marajó",2015 ));
        tecnoBregaMusics.add(new Song("É o Vetron","Vetron",2013 ));

        marcanteMusics.add(new Song("Principe Negro", "Ar15", 2000));
        marcanteMusics.add(new Song("Lava nae", "Bruno e trio", 2012));
        marcanteMusics.add(bregaMusics);

        DiscJockey discJockey = new DiscJockey(everySong);

        discJockey.getSongList();

    }
}
