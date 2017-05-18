package util;

import java.util.ArrayList;

/**
 * Created by Moreira on 22-04-2017.
 */
public class FileRequest extends RequestImplBase {
    @Override
    public Iterable<String> getContent(String path) {
        //TODO
        System.out.println("path =>  "+ path);
        ArrayList<String> res = new ArrayList<>();
        processStream(path, res);
        return res;
        //throw new UnsupportedOperationException();
    }
}
