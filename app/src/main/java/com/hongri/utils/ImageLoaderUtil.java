package com.hongri.utils;

import android.content.Context;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.hongri.view.R;

/**
 * Created by zhongyao on 2019-04-29.
 * 加载图片方式工具类
 */
public class ImageLoaderUtil {

    /**
     * Glide:
     * https://github.com/bumptech/glide
     */
    public static void glideMode(Context context, String imageUrl, ImageView imageView) {
        Glide.with(context).load(imageUrl).centerCrop().placeholder(R.drawable.friends_sends_pictures_no).into(
            imageView);
    }

    /**
     * Fresco:
     * https://github.com/facebook/fresco
     *
     * @param context
     */
    public static void frescoMode(Context context) {
        //Uri uri = Uri.parse("https://raw.githubusercontent.com/facebook/fresco/master/docs/static/logo.png");
        //SimpleDraweeView draweeView = (SimpleDraweeView) findViewById(R.id.my_image_view);
        //draweeView.setImageURI(uri);
    }

    /**
     * Picasso：
     * https://github.com/square/picasso
     */
    public static void picassoMode(Context context, String imageUrl, ImageView imageView) {
        //Picasso.get().load(imageUrl).resize(200,200).centerCrop().into(imageView);
    }

    /**
     * Android-Universal-Image-Loader:
     * https://github.com/nostra13/Android-Universal-Image-Loader
     */
    public static void imageLoaderMode(Context context, String imageUrl, ImageView imageView){
        //ImageLoader imageLoader = ImageLoader.getInstance();
        //imageLoader.displayImage(imageUrl, imageView);
    }

}
