package com.example.yugappforsatmathprep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomSwipeAdapterpt4 extends PagerAdapter {
    private int[] image_resources = {R.drawable.p4q1n4,R.drawable.p4q2n4,R.drawable.p4q3n4,R.drawable.p4q4n4,R.drawable.p4q5n4,R.drawable.p4q6n4,R.drawable.p4q7n4,R.drawable.p4q8n4,R.drawable.p4q9n4,R.drawable.p4q10n4,R.drawable.p4q11n4,R.drawable.p4q12n4,R.drawable.p4q13n4,R.drawable.p4q14n4,R.drawable.p4q15n4,R.drawable.p4q16n4,R.drawable.p4q17n4,R.drawable.p4q18n4,R.drawable.p4q19n4,R.drawable.p4q20n4,R.drawable.p4q21n4,R.drawable.p4q22n4,R.drawable.p4q23n4,R.drawable.p4q24n4,R.drawable.p4q25n4,R.drawable.p4q26n4,R.drawable.p4q27n4,R.drawable.p4q28n4,R.drawable.p4q29n4,R.drawable.p4q30n4,R.drawable.p4q31n4,R.drawable.p4q32n4,R.drawable.p4q33n4,R.drawable.p4q34n4,R.drawable.p4q35n4,R.drawable.p4q36n4,R.drawable.p4q37n4,R.drawable.p4q38n4,R.drawable.p4q39n4,R.drawable.p4q40n4,R.drawable.p4q41n4,R.drawable.p4q42n4,R.drawable.p4q43n4,R.drawable.p4q44n4,R.drawable.p4q45n4,R.drawable.p4q46n4,R.drawable.p4q47n4,R.drawable.p4q48n4,R.drawable.p4q49n4,R.drawable.p4q50n4,R.drawable.p4q51n4,R.drawable.p4q52n4,R.drawable.p4q53n4,R.drawable.p4q54n4,R.drawable.p4q55n4,R.drawable.p4q56n4,R.drawable.p4q57n4,R.drawable.p4q58n4};
    private Context ctx;
    private LayoutInflater layoutInflater;

    int b;

    public CustomSwipeAdapterpt4(Context ctx){
        this.ctx = ctx;
    }

    @Override
    public int getCount() {
        return image_resources.length;
    }

    @Override
    public boolean isViewFromObject( View view, Object o) {
        return (view ==(LinearLayout)o);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View item_view = layoutInflater.inflate(R.layout.swipe_layout,container,false);
        ImageView imageView= item_view.findViewById(R.id.image_view);
        TextView textView = item_view.findViewById(R.id.image_count);
        imageView.setImageResource(image_resources[position]);
        textView.setText("Image : " + position);
        container.addView(item_view);
        return item_view;


    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

