package text.bwei.com.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class BubbleViewActivity extends AppCompatActivity {

    /**
     * 开启动画
     */
    private Button start_btn;
    private ImageView hxb_iv;
    /**
     * 欢迎你
     */
    private TextView center_tv;
    private FrameLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bubble_view);
        initView();
        start_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }

    private void initView() {
        start_btn = (Button) findViewById(R.id.start_btn);
        hxb_iv = (ImageView) findViewById(R.id.hxb_iv);
        center_tv = (TextView) findViewById(R.id.center_tv);
        activity_main = (FrameLayout) findViewById(R.id.activity_main);
    }






}
