package com.xly.silk;

/**
 * Created by ketian on 16-10-10.
 */

public class JNI {

    static {
        System.loadLibrary("xlyvoice");
    }

    public static native int convert(String src, String dest,String pcmTemp);
}
