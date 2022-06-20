package at.campus02.iwi.music;

public class Album {

    public int nrSongs;
    public double shortestSong;
    public double longestSong;

    public double averageSongLength(){
        return (longestSong + shortestSong) / 2;
    }
    public double totalLength(){
        return nrSongs * averageSongLength();
    }
    public boolean fitsOnMedium(int minutes){
        minutes *= 60;
        if (minutes >= totalLength()){
            return true;
        }
        return false;
    }
}
