/*
 * This is the source code of Telegram for Android v. 5.x.x.
 * It is licensed under GNU GPL v. 2 or later.
 * You should have received a copy of the license in this archive (see LICENSE).
 *
 * Copyright Nikolai Kudashov, 2013-2018.
 */

package org.telegram.messenger;

import android.content.Context;
import android.content.SharedPreferences;

public class BuildVars {

    public static boolean DEBUG_VERSION = false;
    public static boolean DEBUG_PRIVATE_VERSION = false;
    public static boolean LOGS_ENABLED = false;
    public static boolean USE_CLOUD_STRINGS = true;
    public static boolean CHECK_UPDATES = false;
    public static int BUILD_VERSION = 1517;
    public static String BUILD_VERSION_STRING = "5.4.0";
    public static int APP_ID = 558858; //obtain your own APP_ID at https://core.telegram.org/api/obtaining_api_id
    public static String APP_HASH = "d0a81a6ca2eeab8cea9d55f71681053a"; //obtain your own APP_HASH at https://core.telegram.org/api/obtaining_api_id
    //deabe0d0c030e27a7c17a461e6181bbd5eaa8958
    public static String HOCKEY_APP_HASH = "7c9c61dbd3e44dc1abfbf24c5ee807ea";
    public static String HOCKEY_APP_HASH_DEBUG = "7c9c61dbd3e44dc1abfbf24c5ee807ea";
    public static String PLAYSTORE_APP_URL = "";
    public static String SMS_HASH = ""; //https://developers.google.com/identity/sms-retriever/overview

    static {
        if (ApplicationLoader.applicationContext != null) {
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("systemConfig", Context.MODE_PRIVATE);
            LOGS_ENABLED = sharedPreferences.getBoolean("logsEnabled", DEBUG_VERSION);
        }
    }
}
