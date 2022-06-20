package at.campus02.iwi.music;

public class MusicApp {

    public static void main(String[] args) {

        Album a = new Album();

        a.longestSong = 80;
        a.shortestSong = 40;
        a.nrSongs = 10;

        System.out.println(a.averageSongLength());
        System.out.println(a.totalLength());
        System.out.println(a.fitsOnMedium(60));

    }
}
