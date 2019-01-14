package at.telvla.statusvk;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface API {
    @POST("/status-vk.html")
    Call<List<Info>> CheckExistencePage (@Query("id_vk") String id_vk);

    @POST("/status-vk.html")
    Call<List<Info>> CheckStatus (@Query("id_vk") String id_vk);
}