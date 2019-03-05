package mg.studio.weather;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WrongActivity extends AppCompatActivity {
private Button return_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong);
    return_button=findViewById(R.id.but_return);
    return_button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent();
            intent .setClass(WrongActivity.this, MainActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
            startActivity(intent);
        }
    });

    }

}
