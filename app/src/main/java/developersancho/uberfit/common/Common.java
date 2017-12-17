package developersancho.uberfit.common;

import android.location.Location;

import developersancho.uberfit.model.User;
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

    public static final int PICK_IMAGE_REQUEST = 9999;

    public static Location mLastLocation = null;

    public static User currentUser;

    public static final String baseURL = "https://maps.googleapis.com";
    public static final String fcmURL = "https://fcm.googleapis.com/";


    public static double base_fare = 2.55;
    private static double time_rate = 0.35;
    private static double distance_rate = 1.75;

    public static double formulaPrice(double km, int min) {
        return (base_fare + (time_rate * min) + (distance_rate * km));
    }

    public static IGoogleAPI getGoogleAPI() {
        return RetrofitClient.getClient(baseURL).create(IGoogleAPI.class);
    }

    public static IFCMService getFCMService() {
        return FCMClient.getClient(fcmURL).create(IFCMService.class);
    }
}
