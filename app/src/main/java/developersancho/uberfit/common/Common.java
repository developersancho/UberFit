package developersancho.uberfit.common;

import developersancho.uberfit.remote.IGoogleAPI;
import developersancho.uberfit.remote.RetrofitClient;

/**
 * Created by developersancho on 8.12.2017.
 */

public class Common {
    public static final String baseURL = "https://maps.googleapis.com";

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }
}
