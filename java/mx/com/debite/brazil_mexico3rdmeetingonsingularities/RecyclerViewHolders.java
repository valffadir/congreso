package mx.com.debite.brazil_mexico3rdmeetingonsingularities;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import io.github.kexanie.library.MathView;

public class RecyclerViewHolders extends RecyclerView.ViewHolder {

    public TextView speaker;
    public TextView title;
    public TextView institution;
    public MathView abs;
    public TextView date;
    public TextView time;
    public TextView type;
    public ImageView icon;

    public RecyclerViewHolders(View itemView) {
        super(itemView);

        speaker = (TextView)itemView.findViewById(R.id.talk_speaker);
        title = (TextView)itemView.findViewById(R.id.talk_title);
        institution = (TextView)itemView.findViewById(R.id.talk_institution);
        abs = (MathView) itemView.findViewById(R.id.talk_abstract);
        date = (TextView)itemView.findViewById(R.id.talk_date);
        time = (TextView)itemView.findViewById(R.id.talk_time);
        type = (TextView)itemView.findViewById(R.id.talk_type);
        icon = (ImageView)itemView.findViewById(R.id.talk_icon);
    }
}
