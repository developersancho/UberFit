package developersancho.uberfit.common;

import android.location.Location;

import developersancho.uberfit.remote.FCMClient;
import developersancho.uberfit.remote.IFCMService;
import developersancho.uberfit.remote.IGoogleAPI;
import developersancho.uberfit.remote.RetrofitClient;

/**
 * Created by developersancho on 8.12.2017.
 */

public class Common {
    public static final String driver_tbl = "Drivers";
    public static final String user_driver_tbl = "DriversInformation";
    public static final String user_rider_tbl = "RidersInformation";
    public static final String pickup_request_tbl = "PickupRequest";
    public static final String token_tbl = "Tokens";

    public static Location mLastLocation = null;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
