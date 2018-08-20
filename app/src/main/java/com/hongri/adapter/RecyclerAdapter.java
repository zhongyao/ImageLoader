package com.hongri.adapter;

import java.util.ArrayList;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.hongri.loader.ImageLoader;
import com.hongri.view.R;

/**
 * @author zhongyao
 * @date 2018/8/20
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private Context mContext;
    private LayoutInflater inflater;
    private ArrayList<String> imageUrls;
    private ImageLoader mImageLoader;
    private static final int IMAGE_SIZE = 200;

    public RecyclerAdapter(Context context, ArrayList<String> imageUrls, ImageLoader mImageLoader) {
        mContext = context;
        inflater = LayoutInflater.from(context);
        this.imageUrls = imageUrls;
        this.mImageLoader = mImageLoader;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.view_item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, final int position) {
        mImageLoader.bindBitmap(imageUrls.get(position), holder.mIv, IMAGE_SIZE, IMAGE_SIZE);
    }

    @Override
    public int getItemCount() {
        return (imageUrls != null && imageUrls.size() > 0) ? imageUrls.size() : 0;
    }

    public class MyViewHolder extends ViewHolder {
        private ImageView mIv;

        public MyViewHolder(View itemView) {
            super(itemView);
            mIv = (ImageView)itemView.findViewById(R.id.item);
        }
    }
}
