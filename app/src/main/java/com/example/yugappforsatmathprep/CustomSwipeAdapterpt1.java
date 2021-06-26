package com.example.yugappforsatmathprep;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class CustomSwipeAdapterpt1 extends PagerAdapter {
    private int[] image_resources = {R.drawable.p4q1n1,R.drawable.p4q2n1,R.drawable.p4q3n1,R.drawable.p4q4n1,R.drawable.p4q5n1,R.drawable.p4q6n1,R.drawable.p4q7n1,R.drawable.p4q8n1,R.drawable.p4q9n1,R.drawable.p4q10n1,R.drawable.p4q11n1,R.drawable.p4q12n1,R.drawable.p4q13n1,R.drawable.p4q14n1,R.drawable.p4q15n1,R.drawable.p4q16n1,R.drawable.p4q17n1,R.drawable.p4q18n1,R.drawable.p4q19n1,R.drawable.p4q20n1,R.drawable.p4q21n1,R.drawable.p4q22n1,R.drawable.p4q23n1,R.drawable.p4q24n1,R.drawable.p4q25n1,R.drawable.p4q26n1,R.drawable.p4q27n1,R.drawable.p4q28n1,R.drawable.p4q29n1,R.drawable.p4q30n1,R.drawable.p4q31n1,R.drawable.p4q32n1,R.drawable.p4q33n1,R.drawable.p4q34n1,R.drawable.p4q35n1,R.drawable.p4q36n1,R.drawable.p4q37n1,R.drawable.p4q38n1,R.drawable.p4q39n1,R.drawable.p4q40n1,R.drawable.p4q41n1,R.drawable.p4q42n1,R.drawable.p4q43n1,R.drawable.p4q44n1,R.drawable.p4q45n1,R.drawable.p4q46n1,R.drawable.p4q47n1,R.drawable.p4q48n1,R.drawable.p4q49n1,R.drawable.p4q50n1,R.drawable.p4q51n1,R.drawable.p4q52n1,R.drawable.p4q53n1,R.drawable.p4q54n1,R.drawable.p4q55n1,R.drawable.p4q56n1,R.drawable.p4q57n1,R.drawable.p4q58n1};    private Context ctx;
    int b;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapterpt1(Context ctx){
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

