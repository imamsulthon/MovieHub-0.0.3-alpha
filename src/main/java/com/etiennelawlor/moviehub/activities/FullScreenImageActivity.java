package com.etiennelawlor.moviehub.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.etiennelawlor.moviehub.R;
import com.etiennelawlor.moviehub.adapters.ItemFullScreenAdapter;
import com.etiennelawlor.moviehub.network.models.ProfileImage;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

public class FullScreenImageActivity extends AppCompatActivity {

    private static final String KEY_PERSON_IMAGE_LIST = "KEY_PERSON_IMAGE_LIST";
    public static ArrayList<ProfileImage> profileImages = null;
    public static int position;

    ItemFullScreenAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_screen_image);

        Bundle extra = getIntent().getExtras();
        profileImages = extra.getParcelableArrayList(KEY_PERSON_IMAGE_LIST);
        position = extra.getInt("position");

        ViewPager viewPager = (ViewPager) findViewById(R.id.pager);

        adapter = new ItemFullScreenAdapter(this, profileImages);
        viewPager.setAdapter(adapter);
        viewPager.setCurrentItem(position);

    }
}
