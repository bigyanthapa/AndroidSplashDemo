package splash.bigyan.com.androidsplashdemo.splashactivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import splash.bigyan.com.androidsplashdemo.R;
import splash.bigyan.com.androidsplashdemo.main.MainActivity;

/**
 *
 * <p/>
 * THIS FILE WAS CREATED BY: Bigyan
 * ON THE DAY OF: 2/10/2016 17:17 CT
 * <p/>
 * THIS FILE WAS LAST MODIFIED BY: Bigyan Thapa
 * ON THE DAY OF: 2/10/2016 17:17 CT
 */

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        final ImageView img = (ImageView) findViewById(R.id.imageView);
        final Animation an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        img.startAnimation(an);

        an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                // This is important
                img.startAnimation(an2);

                finish();
                Intent i = new Intent(getBaseContext(), MainActivity.class);
                startActivity(i);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

    }


}
