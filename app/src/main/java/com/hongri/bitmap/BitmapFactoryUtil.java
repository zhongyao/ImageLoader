package com.hongri.bitmap;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.AsyncTask;
import com.hongri.view.MainActivity;

/**
 * @author zhongyao
 * @date 2018/8/17
 *
 * 加载图片的四种方式：
 * 1、从文件中加载图片
 * 2、使用资源加载图片
 * 3、输入流加载图片资源
 * 4、字节数组加载图片资源
 */

public class BitmapFactoryUtil {

    /**
     * 从文件中加载图片
     */
    public static Bitmap loadBitmapDecodeFile(Context context, String imageFileUrl) {

        Bitmap bitmap = BitmapFactory.decodeFile(imageFileUrl);

        return bitmap;
    }

    /**
     * 使用资源加载图片
     *
     * @return
     */
    public static Bitmap loadBitmapDecodeResources(Context context, int resId) {

        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), resId);

        return bitmap;
    }

    /**
     * 输入流加载图片资源
     *
     * @param context
     * @return
     */
    public static void loadBitmapDecodeStream(Context context, String imageUrl) {
        new MyTask2().execute(imageUrl);
    }

    /**
     * 字节数组加载图片资源
     *
     * @param context
     * @return
     */
    public static void loadBitmapDecodeByteArray(Context context, final String imageUrl) {
        new MyTask().execute(imageUrl);
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

    private static byte[] getBytes(InputStream is) throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] b = new byte[1024];
        int len;

        while ((len = is.read(b, 0, 1024)) != -1) {
            baos.write(b, 0, len);
            baos.flush();
        }
        byte[] bytes = baos.toByteArray();
        return bytes;
    }

    public static class MyTask extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... strings) {
            Bitmap bitmap = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.connect();
                InputStream is = conn.getInputStream();
                byte[] bt = getBytes(is);
                bitmap = BitmapFactory.decodeByteArray(bt, 0, bt.length);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);

            MainActivity.iv.setImageBitmap(bitmap);
        }
    }

    public static class MyTask2 extends AsyncTask<String, Void, Bitmap> {

        @Override
        protected Bitmap doInBackground(String... strings) {
            Bitmap bitmap = null;
            try {
                URL url = new URL(strings[0]);
                HttpURLConnection conn = (HttpURLConnection)url.openConnection();
                conn.connect();
                InputStream is = conn.getInputStream();
                bitmap = BitmapFactory.decodeStream(is);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return bitmap;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);

            MainActivity.iv.setImageBitmap(bitmap);
        }
    }
}
