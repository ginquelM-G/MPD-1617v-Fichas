package util;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Moreira on 22-04-2017.
 */
public abstract class Request implements IRequest{

    protected void processStream(String path, ArrayList<String> res){
        try(InputStream in = ClassLoader.getSystemResource(path).openStream()){
            // Consumir o Inputstream e adicionar dado ao res
            try(BufferedReader reader = new BufferedReader(new InputStreamReader(in))){
                String line;
                while((line = reader.readLine()) != null)
                    res.add(line);
            }
        }catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }
}
