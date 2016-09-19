package id.duza.navigationbottom;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottom_bar);
        final TextView tvText = (TextView) findViewById(R.id.tv_text);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId)  {
                    case R.id.tab_read:
                        tvText.setText("Article");
                        break;
                    case R.id.tab_trending:
                        tvText.setText("Trending Article");
                        break;
                    case R.id.tab_favorite:
                        tvText.setText("Favorite");
                        break;
                }
            }
        });
    }
}
