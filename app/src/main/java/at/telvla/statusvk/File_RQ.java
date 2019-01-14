package at.telvla.statusvk;

import android.content.Context;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class File_RQ {
    String line;
    String Num;

    public  String File_Read (Context context, String file_name){
        FileInputStream stream = null;
        StringBuilder sb = new StringBuilder();

        try {
            stream = context.openFileInput(file_name);
            try {
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream, "UTF-8"));
                while ((line = reader.readLine()) != null) {
                    sb.append(line);
                }
            } finally {
                stream.close();
            }
            Num = sb.toString();
        } catch (Exception e) {
        }
        return Num;
    }

    public Boolean File_Entry (Context context, String file_name, String file_content){
        try {
            FileOutputStream outputStream = context.openFileOutput( file_name, context.MODE_PRIVATE );
            outputStream.write(file_content.getBytes());
            outputStream.close();
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}