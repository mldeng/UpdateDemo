package cn.hugeterry.updatefun.config;

import android.content.Context;

/**
 * Created by hugeterry(http://hugeterry.cn)
 * Date: 16/7/21 15:56
 */
public class DownloadKey {

    public static Context FROMACTIVITY = null;
    public static int TOShowDownloadView = 0;
    public static final String savePath = "/sdcard/UpdateFun/";
    public static String saveFileName = savePath + "newversion.apk";
    public static String apkUrl = "";
    public static String changeLog = "";
    public static String version;
    public static boolean interceptFlag = false;
}
