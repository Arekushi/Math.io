package br.com.arekushi.mathio.holder;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import br.com.arekushi.mathio.R;
import br.com.arekushi.mathio.model.Matter;

public class MatterViewHolder extends RecyclerView.ViewHolder {

    public TextView name;

    public MatterViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.list_title);
    }

    public void bind(Matter matter) {
        name.setText(matter.getName());
    }

}
