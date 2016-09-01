package com.example.eric.academytutorialapp;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Eric on 26/08/2016.
 */
public class ImageUtils {

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight){

        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if(height > reqHeight || width > reqWidth){
            final int halfHeight = height /2;
            final int halfWidth = width /2;

            while((halfHeight / inSampleSize) > reqHeight && (halfWidth / inSampleSize) > reqWidth){
                inSampleSize *=4;
            }
        }
        return inSampleSize;
    }

    public static Bitmap decodeSampleBitmapFromResource(Resources res, int resId, int reqWidth ,int reqHeight){

        final BitmapFactory.Options options = new BitmapFactory.Options();

        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        options.inSampleSize = calculateInSampleSize(options,reqWidth,reqHeight);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res,resId,options);


    }//end dsbfr
}//end class
