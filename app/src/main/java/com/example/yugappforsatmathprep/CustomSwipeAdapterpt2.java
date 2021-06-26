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

public class CustomSwipeAdapterpt2 extends PagerAdapter {
    private int[] image_resources = {R.drawable.p4q1n2,R.drawable.p4q2n2,R.drawable.p4q3n2,R.drawable.p4q4n2,R.drawable.p4q5n2,R.drawable.p4q6n2,R.drawable.p4q7n2,R.drawable.p4q8n2,R.drawable.p4q9n2,R.drawable.p4q10n2,R.drawable.p4q11n2,R.drawable.p4q12n2,R.drawable.p4q13n2,R.drawable.p4q14n2,R.drawable.p4q15n2,R.drawable.p4q16n2,R.drawable.p4q17n2,R.drawable.p4q18n2,R.drawable.p4q19n2,R.drawable.p4q20n2,R.drawable.p4q21n2,R.drawable.p4q22n2,R.drawable.p4q23n2,R.drawable.p4q24n2,R.drawable.p4q25n2,R.drawable.p4q26n2,R.drawable.p4q27n2,R.drawable.p4q28n2,R.drawable.p4q29n2,R.drawable.p4q30n2,R.drawable.p4q31n2,R.drawable.p4q32n2,R.drawable.p4q33n2,R.drawable.p4q34n2,R.drawable.p4q35n2,R.drawable.p4q36n2,R.drawable.p4q37n2,R.drawable.p4q38n2,R.drawable.p4q39n2,R.drawable.p4q40n2,R.drawable.p4q41n2,R.drawable.p4q42n2,R.drawable.p4q43n2,R.drawable.p4q44n2,R.drawable.p4q45n2,R.drawable.p4q46n2,R.drawable.p4q47n2,R.drawable.p4q48n2,R.drawable.p4q49n2,R.drawable.p4q50n2,R.drawable.p4q51n2,R.drawable.p4q52n2,R.drawable.p4q53n2,R.drawable.p4q54n2,R.drawable.p4q55n2,R.drawable.p4q56n2,R.drawable.p4q57n2,R.drawable.p4q58n2};
    private Context ctx;
    int b;
    private LayoutInflater layoutInflater;

    public CustomSwipeAdapterpt2(Context ctx){
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
        TextView textView1 = item_view.findViewById(R.id.textview1);
        imageView.setImageResource(image_resources[position]);
        textView.setText("Image : " + position );
        container.addView(item_view);
        return item_view;




    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }
}

