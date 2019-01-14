package at.telvla.statusvk;

import android.content.Context;

public class CompareStatus {
    boolean rezult;
    Context context;
    String file_status = "file_status";
    String get_status_file;

    boolean CompareStatus (String ser_status) {

        context = MyApplication.getContext();
        try {
            get_status_file = new File_RQ().File_Read(context, file_status);
            if (get_status_file.equals("")) {
                get_status_file = "";
            }
        } catch (Exception e) {
            get_status_file = "";
        }

        if (get_status_file.equals(ser_status)) {
            rezult = true;
        } else {
            new File_RQ().File_Entry(context, file_status, ser_status);
            rezult = false;
        }
        return rezult;
    }
}