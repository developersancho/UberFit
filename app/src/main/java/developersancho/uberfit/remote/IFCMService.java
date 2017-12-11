package developersancho.uberfit.remote;

import developersancho.uberfit.model.FCMResponse;
import developersancho.uberfit.model.Sender;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by developersancho on 11.12.2017.
 */

public interface IFCMService {

    @Headers({
            "Content-Type:application/json",
            "Authorization:key=AAAA-NnvtOg:APA91bGbEgqeKk_IZPEZXYH1frm1UZzvEu3S3yS7bafApScxZ8o044B5m9HlqEHu6WMMX7JVbazCLmXtgSkSxQiy1rJYaItOs7-akz2LK3OFQRB7vcPVev_2B4fuHy-D-0n0L2hVwDJL"
    })
    @POST("fcm/send")
    Call<FCMResponse> sendMessage(@Body Sender body);
}
