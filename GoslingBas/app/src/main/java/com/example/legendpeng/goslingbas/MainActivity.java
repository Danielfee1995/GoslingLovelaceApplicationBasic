package com.example.legendpeng.goslingbas;

import android.content.res.Configuration;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OrientationEventListener mOrientationListener = new OrientationEventListener(this,
                SensorManager.SENSOR_DELAY_NORMAL) {
            public void onOrientationChanged(int orientation) {
                //textView2.setText("112232323232");

                //Toast.makeText(MainActivity.this, Integer.toString(orientation), Toast.LENGTH_SHORT).show();
                if(orientation==270)
                {
                    setContentView(R.layout.activity_land);

                }

            }

        };
        if (mOrientationListener.canDetectOrientation()) {

            mOrientationListener.enable();
        } else {

            mOrientationListener.disable();
        }


        textView=(TextView)findViewById(R.id.testview);
        textView2=(TextView)findViewById(R.id.testview1);
        textView.setText("James Gosling received a Bachelor of Science from the University of Calgary [4] and his M.A. and Ph.D. from Carnegie Mellon University.[2][5][6] He wrote a version of Emacs called Gosling Emacs (Gosmacs) while working toward his doctorate. He built a multi-processor version of Unix for a 16-way computer system[7] while at Carnegie Mellon University, before joining Sun Microsystems. He also developed several compilers and mail systems there.\n" +
                "\n" +
                "Gosling was with Sun Microsystems between 1984 and 2010 (26 years). He got the idea for the Java VM while writing a program to port software from a PERQ by translating Perq Q-Code to VAX assembler and emulating the hardware. He left Sun Microsystems on April 2, 2010 after it was acquired by the Oracle Corporation,[8] citing reductions in pay, status, and decision-making ability, along with change of role and ethical challenges.[9] He has since taken a very critical stance towards Oracle in interviews, noting that \"during the integration meetings between Sun and Oracle, where we were being grilled about the patent situation between Sun and Google, we could see the Oracle lawyer's eyes sparkle.\"[10] He clarified his position during the Oracle v Google trial over Android: \"While I have differences with Oracle, in this case, they are on the right. Google totally slimed Sun. We were all really disturbed, even Jonathan Schwartz; he just decided to put on a happy face and tried to turn lemons into lemonade, which annoyed a lot of folks on Sun.\"[11] However, he approved of the court's ruling that APIs should not be copyrightable.[12]");


    }
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            setContentView(R.layout.activity_land);

        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            setContentView(R.layout.activity_main);
        }
    }

}
