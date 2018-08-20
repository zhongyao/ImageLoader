package com.hongri.view;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.hongri.adapter.RecyclerAdapter;
import com.hongri.bitmap.BitmapFactoryUtil;
import com.hongri.loader.ImageLoader;
import com.hongri.utils.ImageUtil;

/**
 * @author hongri
 */
public class MainActivity extends Activity implements View.OnClickListener {

    private Button btnBmp;
    public static ImageView iv;
    private RecyclerView rv;
    private RecyclerAdapter mAdapter;
    private ArrayList<String> mImageUrls;
    private ImageLoader mImageLoader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBmp = (Button)findViewById(R.id.btnBmp);
        iv = (ImageView)findViewById(R.id.iv);
        rv = (RecyclerView)findViewById(R.id.rv);

        mImageUrls = ImageUtil.getImageUrls();
        mImageLoader = ImageLoader.build(this);

        mAdapter = new RecyclerAdapter(this, mImageUrls, mImageLoader);
        rv.setLayoutManager(new LinearLayoutManager(MainActivity.this, LinearLayoutManager.VERTICAL, false));
        rv.setLayoutManager(new GridLayoutManager(MainActivity.this, 3));
        rv.setAdapter(mAdapter);

        btnBmp.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnBmp:

                /**
                 * 文件中（SD卡）加载图片
                 */
                //sdcard中需要有一张landscape2.jpeg的图片
                //String IMAGE_FILE_URL = "sdcard/landscape2.jpeg";
                //Bitmap bitmap = BitmapFactoryUtil.loadBitmapDecodeFile(this, IMAGE_FILE_URL);
                //iv.setImageBitmap(bitmap);

                /**
                 * 资源文件加载图片
                 */
                //Bitmap bitmap = BitmapFactoryUtil.loadBitmapDecodeResources(this, R.drawable.landscape);
                //iv.setImageBitmap(bitmap);

                /**
                 * 字节数组加载图片
                 */
                //BitmapFactoryUtil.loadBitmapDecodeByteArray(this, ImageUtil.IMAGE_URL);

                /**
                 * 字节流加载图片
                 */
                BitmapFactoryUtil.loadBitmapDecodeStream(this, ImageUtil.IMAGE_URL);

                break;
            default:
                break;
        }
    }
}
