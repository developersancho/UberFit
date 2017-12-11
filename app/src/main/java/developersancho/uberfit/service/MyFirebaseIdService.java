package developersancho.uberfit.service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

import developersancho.uberfit.common.Common;
import developersancho.uberfit.model.Token;

/**
 * Created by developersancho on 11.12.2017.
 */

public class MyFirebaseIdService extends FirebaseInstanceIdService {

    @Override
    public void onTokenRefresh() {
        super.onTokenRefresh();
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        // when have refresh token, we need update to our realtime database
        updateTokenToServer(refreshedToken);
    }

    private void updateTokenToServer(String refreshedToken) {
        FirebaseDatabase db = FirebaseDatabase.getInstance();
        DatabaseReference tokens = db.getReference(Common.token_tbl);

        Token token = new Token(refreshedToken);
        // if already login, must update Token
        if (FirebaseAuth.getInstance().getCurrentUser() != null) {
            tokens.child(FirebaseAuth.getInstance().getCurrentUser().getUid())
                    .setValue(token);
        }

    }
}
