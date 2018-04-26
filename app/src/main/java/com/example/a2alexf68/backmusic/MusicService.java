package com.example.a2alexf68.backmusic;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/**
 * Created by 2alexf68 on 26/04/2018.
 */

public abstract class MusicService extends Service {


    class MusicServiceBinder extends Binder
    {
        public MusicService getService()
        {
            return MusicService.this;
        }
        public IBinder onBind(Intent intent){
            return new MusicServiceBinder();
        }
    }
}
