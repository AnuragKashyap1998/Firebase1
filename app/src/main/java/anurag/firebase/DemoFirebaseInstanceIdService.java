package anurag.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by anurag on 29-07-2017.
 */

public class DemoFirebaseInstanceIdService extends FirebaseInstanceIdService {
    final static String TAG="FCMTag";
    @Override
    public void onTokenRefresh() {
        String refreshedToken= FirebaseInstanceId.getInstance().getToken();
        Log.i(TAG,refreshedToken);
    }



}
