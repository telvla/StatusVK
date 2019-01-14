package at.telvla.statusvk;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String BASE_URL = "http://lira-shop.com";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit == null) {
            //OkHttpClient okHttpClient = initHttpClient();
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    //.client(okHttpClient)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}