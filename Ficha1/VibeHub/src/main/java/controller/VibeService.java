package controller;

import util.IRequest;
import restful.model.Artist;
import restful.model.Event;
import restful.model.Track;
import restful.model.Venue;

/**
 * Created by Moreira on 22-04-2017.
 */
public class VibeService {

    public VibeService(SetlistApi setlistApi, LastfmApi lastfmApi){

    }

    public VibeService(IRequest iRequest){

    }

    public Iterable<Venue> searchString(String venue){
        return  null;
    }

    public Iterable<Event> getEvents(String events){
        return null;
    }

    public Artist getArtist(String artist){
        return  null;
    }

    public Track getTrack(String s1, String s2){ return null;}

}
