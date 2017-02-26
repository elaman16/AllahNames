package com.example.yelaman.allahnames;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;


import com.mikhaellopez.circularimageview.CircularImageView;

import java.util.List;

/**
 * Created by Yelaman on 20/02/2017.
 */

public class NameAdapter extends RecyclerView.Adapter<NameAdapter.MyViewHolder> {

    private Context mContext;
    private List<Name> nameList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameKz, nameTr, nameAr;
        public CircularImageView imageView;
        public ImageButton play;


        public MyViewHolder(View view) {
            super(view);
            nameTr = (TextView) view.findViewById(R.id.nameTr);
            nameKz = (TextView) view.findViewById(R.id.nameKz);
            nameAr = (TextView) view.findViewById(R.id.nameAr);
            imageView = (CircularImageView) view.findViewById(R.id.image);
            play = (ImageButton) view.findViewById(R.id.play);

        }
    }

    public NameAdapter(Context mContext, List<Name> nameList) {
        this.mContext = mContext;
        this.nameList = nameList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_name, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Name name = nameList.get(position);
        holder.nameTr.setText(name.getNameTr());
        holder.nameKz.setText(name.getNameKz());
        holder.nameAr.setText(name.getNameAr());

        holder.play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("TAG", "play button");
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
