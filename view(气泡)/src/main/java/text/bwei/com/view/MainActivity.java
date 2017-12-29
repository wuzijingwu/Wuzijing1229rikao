package text.bwei.com.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 气泡出来
     */
    private Button bubble_view_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();


    }

    private void initView() {
        bubble_view_btn = (Button) findViewById(R.id.bubble_view_btn);
        bubble_view_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.bubble_view_btn:
                Intent intent = new Intent(this, BubbleViewActivity.class);
                startActivity(intent);
                break;
        }
    }
}
