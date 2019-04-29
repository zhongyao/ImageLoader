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
    public static void glideImageLoad(Context context, String imageUrl, ImageView imageView) {
        Glide.with(context).load(imageUrl).centerCrop().placeholder(R.drawable.friends_sends_pictures_no).into(
            imageView);
    }


}
