package hdu.course.image_pager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    PagerAdapter adapter;

    int[] images;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        // Grab all the images and stuff them in our array
        images = new int[] { R.drawable.image1,
                R.drawable.image2,
                R.drawable.image3,
                R.drawable.image4,
                R.drawable.image5,
                };

        // get a reference to the ViewPager in the layout
        viewPager = (ViewPager) findViewById(R.id.pager);

        // Initialize our adapter
        adapter = new ImagePagerAdapter(MainActivity.this, images);

        // Binds the Adapter to the ViewPager
        viewPager.setAdapter(adapter);

    }
}