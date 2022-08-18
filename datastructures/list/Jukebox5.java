package datastructures.list;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Jukebox5 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox5().go();
    }
    class ArtistCompare implements Comparator<Song> {
        public int compare(Song one, Song two){

        return one.getArtist().compareTo(two.getArtist());

        }
    }
    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);

        ArtistCompare artistCompare = new ArtistCompare();
        Collections.sort(songList, artistCompare);
        System.out.println(songList);
    }

    public void getSongs() {
        try{
            File file = new File("/Users/user/Desktop/HeadFirstJava/HeadFirstJava/datastructures/arraylists/SongList.txt");
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = null;
            while((line = reader.readLine()) != null){
                addSong(line);
            }

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }

    private void addSong(String lineToParse) {
        String[] tokens = lineToParse.split("/");
        Song nextSong = new Song(tokens[0], tokens[1], tokens[2],tokens[3]);
        songList.add(nextSong);
    }
}
