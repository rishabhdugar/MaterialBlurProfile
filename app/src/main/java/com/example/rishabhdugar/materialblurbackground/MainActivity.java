package com.example.rishabhdugar.materialblurbackground;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.example.rishabhdugar.materialblurbackground.util.BlurTransformation;
import com.example.rishabhdugar.materialblurbackground.util.CircleTransform;
import com.example.rishabhdugar.materialblurbackground.util.CustomLayout;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    Context mContext;
    String pic_url = "https://firebasestorage.googleapis.com/v0/b/unfollow-cool-app.appspot.com/o/47392975_10218055570686552_1840718147208871936_n.jpg?alt=media&token=98063293-fa77-425c-b07d-3973225169e9";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext = getApplicationContext();
        findViews();
        setListeners();
    }

    private void setListeners() {
        Picasso.with(mContext)
                .load(pic_url)
                .noFade()
                .placeholder(R.mipmap.ic_placeholder_man)
                .transform(new CircleTransform())
                .into(_imgProfile);
        Picasso.with(mContext).load(pic_url).transform(new BlurTransformation(mContext)).into(mCustomLayout);

    }
    CustomLayout mCustomLayout;
    ImageView _imgProfile;
    private void findViews() {
        mCustomLayout = (CustomLayout) findViewById(R.id.profileBackground);
        _imgProfile = findViewById(R.id.imgProfile);
    }

}
