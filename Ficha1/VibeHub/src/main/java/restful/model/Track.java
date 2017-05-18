package restful.model;

/**
 * Created by Moreira on 21-04-2017.
 */
public class Track {

    public String name;
    public String artistName;
    public String albumName;
    public String trackUrl;
    public String[] imagesUrl;
    public String albumUrl;

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getTrackUrl() {
        return trackUrl;
    }

    public String[] getImagesUrl() {
        return imagesUrl;
    }

    public String getAlbumUrl() {
        return albumUrl;
    }

    public int getDuration() {
        return duration;
    }

    public int duration;

    @Override
    public String toString() {
        return super.toString();
    }
}
