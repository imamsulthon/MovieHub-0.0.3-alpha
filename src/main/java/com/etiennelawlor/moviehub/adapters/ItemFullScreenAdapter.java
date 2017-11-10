package com.etiennelawlor.moviehub.adapters;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.etiennelawlor.moviehub.R;
import com.etiennelawlor.moviehub.network.models.ProfileImage;

import java.util.ArrayList;

/**
 * Created by eventlink on 02/11/17.
 */

public class ItemFullScreenAdapter extends PagerAdapter {

    private Context mContext;
    private ArrayList<ProfileImage> imageList;

    public ItemFullScreenAdapter(Context mContext, ArrayList<ProfileImage> imageList) {
        this.mContext = mContext;
        this.imageList = imageList;
    }

    @Override
    public int getCount() {
        return imageList.size();
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    public Object instantiateItem(final ViewGroup container, final int position) {
        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView = inflater.inflate(R.layout.image_item_fullscreen, container, false);

        final SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) rootView.findViewById(R.id.image_item);
        final TextView imageNumber = (TextView) rootView.findViewById(R.id.item_number);

        Glide.with(mContext)
                .asBitmap()
                .load(imageList.get(position).getFilePath(mContext))
                .apply(RequestOptions.fitCenterTransform())
                .into(new SimpleTarget<Bitmap>() {
                    @Override
                    public void onResourceReady(Bitmap resource, Transition<? super Bitmap> transition) {
                        imageView.setImage(ImageSource.bitmap(resource));
                    }
                });

        imageNumber.setText((position + 1) + " of " + getCount());

        container.addView(rootView);
        return rootView;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
