package br.com.arekushi.mathio.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import br.com.arekushi.mathio.R;
import br.com.arekushi.mathio.holder.MatterViewHolder;
import br.com.arekushi.mathio.model.Matter;
import br.com.arekushi.mathio.fragments.MatterListFragment.ListSelect;

public class MatterListAdapter extends Adapter<MatterViewHolder> {

    private String[] names;
    private String[] texts;
    private int[] imagesId;

    private Context context;

    public MatterListAdapter(String[] names, String[] texts, int[] imagesId, Context context) {
        this.names = names;
        this.texts = texts;
        this.imagesId = imagesId;
        this.context = context;
    }

    @NonNull
    @Override
    public MatterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_list, parent, false);

        return new MatterViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MatterViewHolder holder, int index) {
        final Matter matter = new Matter(names[index], imagesId[index], texts[index]);
        holder.bind(matter);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(context instanceof ListSelect)
                    ((ListSelect) context).onSelectedItem(matter);
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }
}
