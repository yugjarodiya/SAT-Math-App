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

public class CustomSwipeAdapterpt3 extends PagerAdapter {
    private int[] image_resources = {R.drawable.p4q1n3,R.drawable.p4q2n3,R.drawable.p4q3n3,R.drawable.p4q4n3,R.drawable.p4q5n3,R.drawable.p4q6n3,R.drawable.p4q7n3,R.drawable.p4q8n3,R.drawable.p4q9n3,R.drawable.p4q10n3,R.drawable.p4q11n3,R.drawable.p4q12n3,R.drawable.p4q13n3,R.drawable.p4q14n3,R.drawable.p4q15n3,R.drawable.p4q16n3,R.drawable.p4q17n3,R.drawable.p4q18n3,R.drawable.p4q19n3,R.drawable.p4q20n3,R.drawable.p4q21n3,R.drawable.p4q22n3,R.drawable.p4q23n3,R.drawable.p4q24n3,R.drawable.p4q25n3,R.drawable.p4q26n3,R.drawable.p4q27n3,R.drawable.p4q28q3,R.drawable.p4q29n3,R.drawable.p4q30n3,R.drawable.p4q31n3,R.drawable.p4q32n3,R.drawable.p4q33n3,R.drawable.p4q34n3,R.drawable.p4q35n3,R.drawable.p4q36n3,R.drawable.p4q37n3,R.drawable.p4q38n3,R.drawable.p4q39n3,R.drawable.p4q40n3,R.drawable.p4q41n3,R.drawable.p4q42n3,R.drawable.p4q43n3,R.drawable.p4q44n3,R.drawable.p4q45n3,R.drawable.p4q46n3,R.drawable.p4q47n3,R.drawable.p4q48n3,R.drawable.p4q49n3,R.drawable.p4q50n3,R.drawable.p4q51n3,R.drawable.p4q52n3,R.drawable.p4q53n3,R.drawable.p4q54n3,R.drawable.p4q55n3,R.drawable.p4q56n3,R.drawable.p4q57n3,R.drawable.p4q58n3};
    private Context ctx;
    int b;
    private LayoutInflater layoutInflater;
    public CustomSwipeAdapterpt3(Context ctx){
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

