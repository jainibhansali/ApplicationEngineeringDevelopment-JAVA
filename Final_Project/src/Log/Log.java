package Log;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class Log {
    private static PrintWriter writer;

    public static void main(String[] args) {
        try
        {
        writer = new PrintWriter("log.txt", "UTF-8");
        }
        catch(FileNotFoundException e)
                {
                    
                }
        catch(UnsupportedEncodingException f)
                {
                    
                }
    }

    public static void writeLog(String info) {
        writer.println(info);
        writer.flush();
    }
}

