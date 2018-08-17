package com.hongri.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import com.hongri.view.R;

/**
 * @author zhongyao
 * @date 2018/8/17
 */

public class BitmapFactoryUtil {

    private static final String FILE_URL = "";

    /**
     * 加载一个图片的方式
     */
    public Bitmap loadBitmap(Context context) {

        /**
         * 文件系统
         */
        BitmapFactory.decodeFile(FILE_URL);

        /**
         * 资源
         */
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.landscape);

        /**
         * 输入流
         */
        //BitmapFactory.decodeStream();

        /**
         * 字节数组
         */
        //BitmapFactory.decodeByteArray();

        return bitmap;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId, int reqWidth, int reqHeight) {

        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;

        BitmapFactory.decodeResource(res, resId, options);

        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);
    }

    public static int calculateInSampleSize(Options options, int reqWidth,
                                            int reqHeight) {
        final int width = options.outWidth;
        final int height = options.outHeight;

        int inSampleSize = 1;

        /**
         * 方法一：尽可能小的减少压缩
         */
        if (width > reqWidth && height > reqHeight) {
            final int halfWidth = width / 2;
            final int halfHeight = height / 2;
            while ((halfWidth / inSampleSize) > reqWidth && (halfHeight / inSampleSize) > reqHeight) {
                inSampleSize *= 2;
            }
        }

        /**
         * 方法二
         */
        //if (width > reqWidth && height > reqHeight) {
        //    int widthRatio = Math.round((float)width / (float)reqWidth);
        //    int heightRatio = Math.round((float)height / (float)reqHeight);
        //    inSampleSize = Math.max(widthRatio, heightRatio);
        //}

        /**
         * 方法三:取目标长度的最大值来计算，这样可以减少过度的尺寸压缩
         */
        if (width > reqWidth && height > reqHeight) {
            int suitedValue = reqWidth > reqHeight ? reqWidth : reqHeight;
            int widthRatio = Math.round((float)width / (float)suitedValue);
            int heightRatio = Math.round((float)height / (float)suitedValue);
            inSampleSize = Math.max(widthRatio, heightRatio);
        }
        return inSampleSize;
    }
}
