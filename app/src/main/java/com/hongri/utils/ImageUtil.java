package com.hongri.utils;

import java.util.ArrayList;

/**
 * @author zhongyao
 * @date 2018/8/17
 */

public class ImageUtil {

    private static ArrayList<String> mDatas = new ArrayList<>();
    public static final String IMAGE_URL
        = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1534754404745&di"
        + "=0118e4a8610e070414037c257f614490&imgtype=0&src=http%3A%2F%2Fpic.58pic"
        + ".com%2F58pic%2F12%2F81%2F50%2F20G58PICUSr.jpg";

    public static String[] imageUrls = {
        "http://b.hiphotos.baidu.com/zhidao/pic/item/a6efce1b9d16fdfafee0cfb5b68f8c5495ee7bd8.jpg",
        "http://pic47.nipic.com/20140830/7487939_180041822000_2.jpg",
        "http://pic41.nipic.com/20140518/4135003_102912523000_2.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/3b87e950352ac65c0f1f6e9efff2b21192138ac0.jpg",
        "http://pic42.nipic.com/20140618/9448607_210533564001_2.jpg",
        "http://pic10.nipic.com/20101027/3578782_201643041706_2.jpg",
        "http://img2.3lian.com/2014/c7/51/d/26.jpg",
        "http://img3.3lian.com/2013/c1/34/d/93.jpg",
        "http://b.zol-img.com.cn/desk/bizhi/image/3/960x600/1375841395686.jpg",
        "http://pic41.nipic.com/20140518/4135003_102025858000_2.jpg",
        "http://h.hiphotos.baidu.com/zhidao/wh%3D450%2C600/sign=429e7b1b92ef76c6d087f32fa826d1cc"
            + "/7acb0a46f21fbe09cc206a2e69600c338744ad8a.jpg",
        "http://pica.nipic.com/2007-12-21/2007122115114908_2.jpg",
        "http://photo.loveyd.com/uploads/allimg/080618/1110324.jpg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105820_GuEHe.thumb.700_0.jpeg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105856_LTayu.thumb.700_0.jpeg",
        "http://pic.dbw.cn/0/01/33/59/1335968_847719.jpg",
        "http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://pic25.nipic.com/20121210/7447430_172514301000_2.jpg",
        "http://img02.tooopen.com/images/20140320/sy_57121781945.jpg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105820_GuEHe.thumb.700_0.jpeg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105856_LTayu.thumb.700_0.jpeg",
        "http://pic.dbw.cn/0/01/33/59/1335968_847719.jpg",
        "http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://pic25.nipic.com/20121210/7447430_172514301000_2.jpg",
        "http://img02.tooopen.com/images/20140320/sy_57121781945.jpg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105820_GuEHe.thumb.700_0.jpeg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105856_LTayu.thumb.700_0.jpeg",
        "http://pic.dbw.cn/0/01/33/59/1335968_847719.jpg","http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://pic25.nipic.com/20121210/7447430_172514301000_2.jpg",
        "http://img02.tooopen.com/images/20140320/sy_57121781945.jpg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105820_GuEHe.thumb.700_0.jpeg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105856_LTayu.thumb.700_0.jpeg",
        "http://pic.dbw.cn/0/01/33/59/1335968_847719.jpg","http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://pic25.nipic.com/20121210/7447430_172514301000_2.jpg",
        "http://img02.tooopen.com/images/20140320/sy_57121781945.jpg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105820_GuEHe.thumb.700_0.jpeg",
        "http://img4.duitang.com/uploads/item/201404/17/20140417105856_LTayu.thumb.700_0.jpeg",
        "http://pic.dbw.cn/0/01/33/59/1335968_847719.jpg",
        "http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
        "http://pic25.nipic.com/20121210/7447430_172514301000_2.jpg",
        "http://img02.tooopen.com/images/20140320/sy_57121781945.jpg",
        "http://a.hiphotos.baidu.com/image/pic/item/a8773912b31bb051a862339c337adab44bede0c4.jpg",
        "http://h.hiphotos.baidu.com/image/pic/item/f11f3a292df5e0feeea8a30f5e6034a85edf720f.jpg",
        "http://img0.pconline.com.cn/pconline/bizi/desktop/1412/ER2.jpg",
    };

    public static ArrayList<String> getImageUrls() {
        for (String imageUrl : imageUrls) {
            mDatas.add(imageUrl);
        }
        return mDatas;
    }
}