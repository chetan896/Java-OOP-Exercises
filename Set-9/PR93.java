import java.util.*;

public class PR93
{
    public static void main(String[] args)
    {
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Shape of you");
        playlist.add("Blinding Lights");
        playlist.add("Perfect");
        playlist.add("Believer");
        playlist.add("Levitating");

        System.out.println("Initial Playlist : ");
        displayPlaylist(playlist);

        if (!playlist.isEmpty())
        {
            String playedSong = playlist.removeFirst();
            System.out.println("\nNow Playing : " + playedSong);
        }

        System.out.println("Playlist after playing first song:");
        displayPlaylist(playlist);

        if (!playlist.isEmpty())
        {
            String skippingSong = playlist.removeLast();
            System.out.println("\nSkipped Song : " + skippingSong);
        }

        System.out.println("Playlist after skipping last song:");
        displayPlaylist(playlist);
    }

    public static void displayPlaylist(LinkedList<String> playlist)
    {
        if (playlist.isEmpty())
        {
            System.out.println("Playlist is empty.");
        }
        else
        {
            for (String song : playlist)
            {
                System.out.println(song);
            }
        }
    }
}