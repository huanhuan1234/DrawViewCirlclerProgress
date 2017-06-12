package huangminghuan.bawei.com.drawviewcirlclerprogress;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    private CircleBar circleBar;
    private Button bt1;
    private Button bt2;

    private int mProgress;

    //页面关闭 停止运行
    public boolean stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        circleBar = (CircleBar) findViewById(R.id.circle);
        circleBar.setSweepAngle(360);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                circleBar.setText("100");
            }
        }, 2000);

        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);


        //循环
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                circleBar.startCustomAnimation();
            }
        });

        //暂停
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circleBar.clearAnimation();
            }
        });
    }
}
