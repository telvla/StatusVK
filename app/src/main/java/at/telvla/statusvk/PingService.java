package at.telvla.statusvk;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class PingService extends Service {

    public PingService() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        CheckServer ping_server = new CheckServer();
        ping_server.StartPing();

        return Service.START_STICKY;
    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

}