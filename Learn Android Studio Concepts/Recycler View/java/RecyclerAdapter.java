package com.example.recyclerviewlab10;
//
//public class RecyclerAdapter {
//}
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {
    private ArrayList<User>userList;
    public RecyclerAdapter(ArrayList<User> userList){
        this.userList = userList;
    }
    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;
        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView2);
        }
    }
    @NonNull
    @Override
    public RecyclerAdapter.MyViewHolder onCreateViewHolder(
        @NonNull
        ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(
            @NonNull
        RecyclerAdapter.MyViewHolder holder, int position) {
        String name = userList.get(position).getUsername();
        holder.nameTxt.setText(name);
    }
    @Override
    public int getItemCount() {
        return userList.size();
    }
}
