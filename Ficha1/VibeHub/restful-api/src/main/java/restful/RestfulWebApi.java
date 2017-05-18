package restful;

import util.IRequest;

import java.io.*;
import java.net.URL;

/**
 * Created by Moreira on 22-04-2017.
 */
public class RestfulWebApi {

    // https://api.setlist.fm/rest/0.1/search/artists.json?artistName=Michael%20Jackson&p=2
    // http://ws.audioscrobbler.com/2.0/?method=track.getInfo&api_key=117d429c9ee7d4aae24ca1d83fe5d69c&artist=Michael%20Jackson&track=Dangerous&format=json
    private static final String BASE_SETLIST_URL = "https://api.setlist.fm";
    private static final String BASE_LASTFM_URL = "http://ws.audioscrobbler.com";
    private static final String CONCAT_BASE_SETLIST_URL= "/rest/0.1";
    private static final String CONCAT_BASE_LASTFM_URL = "/2.0/?method=";

    private static final String KEY_SETLIST;
    private static final String KEY_LASTFM;


    private static final String ARGS_SETLIST_URL= "/rest/0.1/search/artists.json?artistName=Michael%20Jackson&p=2";
    private static final String ARGS_LASTFM_URL = "/rest/0.1/search/artists.json?artistName=Michael%20Jackson&p=2";



    static {
        try{
            URL keyFileSetlist = ClassLoader.getSystemResource("setlist-api-key.txt");
            URL keyFilelastfm = ClassLoader.getSystemResource("lastfm-api-key.txt");
            if(keyFileSetlist == null){
                throw new IllegalStateException(
                        "YOU MUST GOT a API KEYs api.setlist.fm and http://ws.audioscrobbler.com," +
                                " place it in src/main/resources/*.txt");
            }else{
                InputStream keyStream1 = keyFileSetlist.openStream();
                InputStream keyStream2 = keyFilelastfm.openStream();
                try(BufferedReader reader = new BufferedReader(new InputStreamReader(keyStream1));
                   BufferedReader reader2 = new BufferedReader(new InputStreamReader(keyStream2))){
                    KEY_LASTFM = reader.readLine();
                    KEY_SETLIST = reader2.readLine();
                }
            }
        }catch (IOException err){
            System.out.println("ERROR: "+ err.getMessage());
            throw  new UncheckedIOException(err);
        }

    }


    private  final IRequest req;

    public RestfulWebApi(IRequest req){
        this.req = req;
    }

    private String createUriOfSetlistApi(){
        return "createUriOfSetlistApi";
    }

    private String createUriOfLastfmApi(){
        return "createUriOfLastfmApi";
    }

}
