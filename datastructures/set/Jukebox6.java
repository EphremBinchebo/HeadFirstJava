package datastructures.set;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Jukebox6 {
    ArrayList<Song> songList = new ArrayList<Song>();

    public static void main(String[] args) {
        new Jukebox6().go();
    }

    public void go() {
        getSongs();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
        HashSet<Song> songSet = new HashSet<Song>();
         songSet.addAll(songList);
        System.out.println(songSet);
    }

    public void getSongs() {
        try{
            File file = new File("/Users/user/Desktop/HeadFirstJava/HeadFirstJava/datastructures/set/SongList.txt");
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
