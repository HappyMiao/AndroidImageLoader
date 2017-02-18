package com.miao;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.miao.utils.ImageLoader;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    //图片地址
    public static final String url_1 = "http://ww1.sinaimg.cn/large/cfeeee4dgy1fcurfyibojj20fs05cglp";
    public static final String url_2 = "http://upload.jianshu.io/admin_banners/web_images/2771/eb70e179eeddedbbde81b9c3797dba62982f0ec9.png";
    public static final String url_3 = "http://upload.jianshu.io/admin_banners/web_images/2295/dcc46ceef44b1df38b934c68043e43b1dd7d6f4d.jpg";
    public static final String url_4 = "http://upload.jianshu.io/admin_banners/web_images/2474/259a36ccbca577c3064c68ab3c0f1834d77456d7.png";

    @BindView(R.id.img1)
    ImageView img1;
    @BindView(R.id.img2)
    ImageView img2;
    @BindView(R.id.img3)
    ImageView img3;
    @BindView(R.id.img4)
    ImageView img4;
    @BindView(R.id.img5)
    ImageView img5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        loadImg();
    }

    /**
     * 加载图片
     *
     * @param
     * @return
     * @author miao
     * @createTime 2017年2月18日
     * @lastModify 2017年2月18日
     */
    private void loadImg() {
        //加载圆形图片
        ImageLoader.getInstace().loadCircleImg(this, img1, url_1);
        //加载正常图片
        ImageLoader.getInstace().loadImg(this, img2, url_2);
        //加载圆角图片 半径35
        ImageLoader.getInstace().loadRoundedCornersImg(this, img3, url_3, 35);
        //加载灰度图片
        ImageLoader.getInstace().loadGrayscaleImg(this, img4, url_4);
        //加载圆形图的原图作比较
        ImageLoader.getInstace().loadImg(this, img5, url_1);
    }
}
