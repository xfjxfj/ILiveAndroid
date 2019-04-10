package fangjie.com.iliveandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import fangjie.com.skyutils.SkyUtils;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView mText = findViewById(R.id.mText);
        mText.setText(SkyUtils.GetStringSr());
    }
}

















































