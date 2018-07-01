package com.example.nwokedisamuel.journalapp;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by nwokedi samuel on 6/29/2018.
 */



    public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder>{
        Context context;
        List<modelJournal> modelJournals;

        public UserAdapter(List<modelJournal> modelJournals ,Context context) {
            this.modelJournals = modelJournals;
            this.context=context;

        }


        @Override
        public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row, parent,false );
            return new ViewHolder(view);
        }


        @Override
        public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {
            holder.textView1.setText(modelJournals.get(position).getTitle()) ;
            holder.textView2.setText(modelJournals.get(position).getIdea());

        }

        @Override
        public int getItemCount() {
            return modelJournals.size();
        }


        public class ViewHolder extends RecyclerView.ViewHolder  {
            public TextView textView1,textView2;
            public Button button;

            public ViewHolder(View itemView) {
                super(itemView);
                textView1 = itemView.findViewById(R.id.item);
                textView2 = itemView.findViewById(R.id.item2);
                button=itemView.findViewById(R.id.edit);

            }



        }
    }

