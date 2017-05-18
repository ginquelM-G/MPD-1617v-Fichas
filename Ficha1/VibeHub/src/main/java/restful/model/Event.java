package restful.model;

import java.util.function.Supplier;

/**
 * Created by Moreira on 21-04-2017.
 */
public class Event {

    Supplier<Artist> artistS;
    public Artist artist;
    public String artistName;
    public String eventDate;
    public String tour;
    public String[] tracksNames;
    public Iterable<Track> tracks;
    public String setListId;


    public Artist getArtist() {
        return artist;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public String getTour() {
        return tour;
    }

    public String[] getTracksNames() {
        return tracksNames;
    }

    public Iterable<Track> getTracks() {
        return tracks;
    }

    public String getSetListId() {
        return setListId;
    }




}
