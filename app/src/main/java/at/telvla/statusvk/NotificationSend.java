package at.telvla.statusvk;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;


public class NotificationSend {

        Context context;

        public String Send(String name_status) {

            context = MyApplication.getContext();
            int NOTIFICATION_ID = 234;

            NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

            String CHANNEL_ID = "my_channel_01";
            CharSequence name = "my_channel";
            String Description = "This is my channel";

            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {

                int importance = NotificationManager.IMPORTANCE_HIGH;
                NotificationChannel mChannel = new NotificationChannel(CHANNEL_ID, name, importance);
                mChannel.setDescription(Description);
                mChannel.enableLights(true);
                mChannel.setLightColor(Color.RED);
                mChannel.enableVibration(true);
                mChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500, 400, 300, 200, 400});
                mChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(mChannel);
            }

            NotificationCompat.Builder builder = new NotificationCompat.Builder(context, CHANNEL_ID)
                    .setSmallIcon(R.drawable.heart)
                    .setColor(Color.RED)
                    .setContentTitle("Статус изменен!")
                    .setContentText("Статус: " + name_status);

            Intent resultIntent = new Intent(context, MainActivity.class);
            TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
            stackBuilder.addParentStack(MainActivity.class);
            stackBuilder.addNextIntent(resultIntent);
            PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);

            builder.setContentIntent(resultPendingIntent);
            notificationManager.notify(NOTIFICATION_ID, builder.build());

            /*Intent notificationIntent = new Intent(MyApplication.getContext(), MainActivity.class);
            PendingIntent contentIntent = PendingIntent.getActivity(MyApplication.getContext(),
                    0, notificationIntent,
                    PendingIntent.FLAG_CANCEL_CURRENT);

            Resources res = MyApplication.getContext().getResources();
            Notification.Builder builder = new Notification.Builder(MyApplication.getContext());

            builder.setContentIntent(contentIntent)
                    .setSmallIcon(R.drawable.heart)
                    // большая картинка
                    .setLargeIcon(BitmapFactory.decodeResource(res, R.drawable.heart))
                    //.setTicker(res.getString(R.string.warning)) // текст в строке состояния
                    .setTicker("Статус изменен!")
                    .setWhen(System.currentTimeMillis())
                    .setAutoCancel(true)
                    //.setContentTitle(res.getString(R.string.notifytitle)) // Заголовок уведомления
                    .setContentTitle("СТАТУС СВОБОДЕН")
                    //.setContentText(res.getString(R.string.notifytext))
                    .setContentText("Статус: " + name_status); // Текст уведомления
            // Notification notification = builder.getNotification(); // до API 16
            Notification notification = builder.build();

            NotificationManager notificationManager = (NotificationManager)
                    MyApplication.getContext().getSystemService(Context.NOTIFICATION_SERVICE);
            notificationManager.notify(NOTIFY_ID, notification);*/

            return "";
        }
}
