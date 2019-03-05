package mg.studio.weather;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {
private ImageView image1;
    private ImageView image2;
    private ImageView image3;
    private ImageView image4;
private Button but_te1;
    private int img1;
    private int img2;
    private int img3;
    private int img4;
private TextView text1;
    String [] pic={"honey","hypo","leo","lion","pig","sun","wolf","rhino"};

    private int socre=0;
    private int master=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    image1=findViewById(R.id.image1);
        image2=findViewById(R.id.image2);
        image3=findViewById(R.id.image3);
        image4=findViewById(R.id.image4);
        text1=findViewById(R.id.text1);
        but_te1=findViewById(R.id.button1);

       set();
    image1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            checkscore();

            if(master==0)
            {
                socre++;

                Toast.makeText(Main2Activity.this,"right!score+1",Toast.LENGTH_SHORT).show();
            }
            else {socre--;
                Toast.makeText(Main2Activity.this,"wrong!score-1",Toast.LENGTH_SHORT).show();}

       set();
        }
    });
    image2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
         checkscore();

            if(master==1)
            {
                socre++;
                Toast.makeText(Main2Activity.this,"right!score+1",Toast.LENGTH_SHORT).show();
            }
            else {socre--;
                Toast.makeText(Main2Activity.this,"wrong!score-1",Toast.LENGTH_SHORT).show();}

            set();
        }
    });
        image3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                checkscore();
                if(master==2)
                {
                    socre++;
                    Toast.makeText(Main2Activity.this,"right!score+1",Toast.LENGTH_SHORT).show();
                }
                else {socre--;
                    Toast.makeText(Main2Activity.this,"wrong!score-1",Toast.LENGTH_SHORT).show();}

                    set();
            }
        });
        image4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkscore();

                if(master==3)
                {
                    socre++;
                    Toast.makeText(Main2Activity.this,"right!score+1",Toast.LENGTH_SHORT).show();
                }
                else {socre--;
                    Toast.makeText(Main2Activity.this,"wrong!score-1",Toast.LENGTH_SHORT).show();}

                set();

            }
        });
    }

    void set()
    {
        int [] arr=randomfour();
      String io="Your score： "+socre;
       text1.setText(io);
        master=master();

        but_te1.setText(pic[arr[master]]);

        image1.setImageResource(getImageResourceId(pic[arr[0]]));
        image2.setImageResource(getImageResourceId(pic[arr[1]]));
        image3.setImageResource(getImageResourceId(pic[arr[2]]));
        image4.setImageResource(getImageResourceId(pic[arr[3]]));

    }

    public int getImageResourceId(String name) {
        R.drawable drawables=new R.drawable();
        //默认的id
        int resId=0x7f02000b;
        try {
            //根据字符串字段名，取字段//根据资源的ID的变量名获得Field的对象,使用反射机制来实现的
            java.lang.reflect.Field field=R.drawable.class.getField(name);
            //取值
            resId=(Integer)field.get(drawables);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return resId;
    }


    int master()
    {
        return  (int)(Math.random()*4);//从4张图片中选取一个当作答案
    }
    void checkscore()
    {
        if(socre>=5)
        {
            Intent intent = new Intent();
            intent .setClass(Main2Activity.this,RightActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
            startActivity(intent);
        }
        if(socre<0)
        {
            Intent intent = new Intent();
            intent .setClass(Main2Activity.this, WrongActivity.class);//Activity1 为当前界面的Activity，Activity2为要跳转的类
            startActivity(intent);
        }
    }
int[] randomfour()
{
    Random random = new Random();
    int[] arr = new int[4];
    arr[0] = random.nextInt(8);
    int i = 1;
    //外循环定义四个数
    while(i <=3) {
        int x = random.nextInt(8);
        /*内循环：新生成随机数和已生成的比较，
         *相同则跳出内循环，再生成一个随机数进行比较
         *和前几个生成的都不同则这个就是新的随机数
         */
        for (int j = 0; j <= i - 1; j++) {
            //相同则跳出内循环，再生成一个随机数进行比较
            if (arr[j] == x) {
                break;
            }
            //执行完循环和前几个生成的都不同则这个就是新的随机数
            if(j+1==i){
                arr[i] = x;
                i++;
            }
        }
    }
return arr;
}

}

