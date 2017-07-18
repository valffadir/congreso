package mx.com.debite.brazil_mexico3rdmeetingonsingularities;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolders>{

    private List<Talks> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<Talks> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.talk_details, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.speaker.setText(itemList.get(position).getSpeaker());
        holder.title.setText(itemList.get(position).getTitle());
        holder.institution.setText(itemList.get(position).getInstitution());
        holder.abs.setText(itemList.get(position).getAbs());
        holder.date.setText(itemList.get(position).getDate());
        holder.time.setText(itemList.get(position).getStartTime() + " - " + itemList.get(position).getEndTime());
        holder.type.setText(itemList.get(position).getType());
        holder.icon.setImageResource(itemList.get(position).getTalk_logo());
    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }

}
