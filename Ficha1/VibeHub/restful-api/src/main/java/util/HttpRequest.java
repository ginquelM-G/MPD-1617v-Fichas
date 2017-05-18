package util;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Moreira on 22-04-2017.
 */
public class HttpRequest implements IRequest {

    @Override
    public Iterable<String> getContent(String path){
        List<String> res = new ArrayList<>();
        try(InputStream in = new URL(path).openStream()){
            // Consumir o InputStream e adicionar ao res
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))) {
                String line;
                while((line = reader.readLine()) !=  null) res.add(line);
            }
        }catch (IOException err){
            System.out.println("ERROR = [" + err.getMessage() + "]");
            throw new UncheckedIOException(err);
            //throw new UnsupportedOperationException();
        }

        return res;
    }
}
