package com.example.eric.academytutorialapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by Eric on 26/08/2016.
 */
public class ImageAdapter extends BaseAdapter{
    private Context mContext;

    public ImageAdapter(Context context) {
        mContext = context;
    }

        private int mImageHeight = 100;
        private int mImageWidth = 100;


    private static Integer[] mThumbnails = {
        R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.four,R.drawable.five,
            R.drawable.six,R.drawable.fsociety};
    @Override
    public int getCount() {
        return mThumbnails.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        ImageView imageView;
        if(convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(mImageHeight, mImageWidth));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        }else {
            imageView = (ImageView) convertView;
        }

        Bitmap bitmap = ImageUtils.decodeSampleBitmapFromResource(mContext.getResources(),
                mThumbnails[i], mImageWidth,mImageHeight);
        imageView.setImageBitmap(bitmap);

        return imageView;
    }
}//end class
