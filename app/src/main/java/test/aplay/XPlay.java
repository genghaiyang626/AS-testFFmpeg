package test.aplay;

import android.annotation.SuppressLint;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;

public class XPlay extends GLSurfaceView implements Runnable, SurfaceHolder.Callback {


    public XPlay(Context context, AttributeSet attrs){
        super(context,attrs);
    }

    @SuppressLint("SdCardPath")
    @Override
    public void run() {
        Open("/sdcard/Movies/720.flv",getHolder().getSurface());
    }
    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        new Thread(this).start();
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }
    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {


    }

    public native void Open(String url,Object surface);



}
