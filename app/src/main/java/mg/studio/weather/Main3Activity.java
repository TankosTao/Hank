package mg.studio.weather;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
    private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
   private int socre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        image1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       //         Toast.makeText(Main3Activity.this,"It is not a lion",Toast.LENGTH_SHORT).show();
                Intent intent = new Intent();
                intent .setClass(Main3Activity.this, WrongActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
                startActivity(intent);
            }
        });
        image2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
       //         Toast.makeText(Main3Activity.this,"It is not a lion",Toast.LENGTH_SHORT).show();

                Intent intent = new Intent();
                intent .setClass(Main3Activity.this, WrongActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
                startActivity(intent);
            }
        });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
           //     Toast.makeText(Main3Activity.this,"Congratulation! you are right",Toast.LENGTH_SHORT).show();



             /*  Intent intent = new Intent();
         intent .setClass(Main3Activity.this,RightActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
              startActivity(intent);*/

            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent();
                intent .setClass(Main3Activity.this, WrongActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
                startActivity(intent);
            }
        });
    }
}
