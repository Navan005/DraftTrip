package com.example.drafttrip;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

/**
 * The type Recycler view adapter.
 */
class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder>{

    private Context mContext ;
    private List<Product> mData ;

    /**
     * Instantiates a new Recycler view adapter.
     *
     * @param mContext the m context
     * @param mData    the m data
     */
    public RecyclerViewAdapter(Context mContext, List<Product> mData) {
        this.mContext = mContext;
        this.mData = mData;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view ;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_product,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {

        holder.tv_book_title.setText(mData.get(position).getTitle());
        holder.img_book_thumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.price_product.setText(mData.get(position).getPrice());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(mContext,BriefActivity.class);

                // passing data to the Product activity.
                intent.putExtra("Title",mData.get(position).getTitle());
                intent.putExtra("Description",mData.get(position).getDescription());
                intent.putExtra("Price",mData.get(position).getPrice());
                intent.putExtra("Thumbnail",mData.get(position).getThumbnail());

                mContext.startActivity(intent);

            }
        });



    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    /**
     * The type My view holder.
     */
    public static class MyViewHolder extends RecyclerView.ViewHolder {

        /**
         * The Tv book title.
         */
        TextView tv_book_title;
        /**
         * The Img book thumbnail.
         */
        ImageView img_book_thumbnail;
        /**
         * The Card view.
         */
        CardView cardView ;
        /**
         * The Price product.
         */
        TextView price_product;

        /**
         * Instantiates a new My view holder.
         *
         * @param itemView the item view
         */
        public MyViewHolder(View itemView) {
            super(itemView);

            //assigning values to assigned variables.
            tv_book_title = (TextView) itemView.findViewById(R.id.book_title_id) ;
            img_book_thumbnail = (ImageView) itemView.findViewById(R.id.book_img_id);
            cardView = (CardView) itemView.findViewById(R.id.cardview_id);
            price_product=(TextView)itemView.findViewById(R.id.book_Price);

        }
    }


}
