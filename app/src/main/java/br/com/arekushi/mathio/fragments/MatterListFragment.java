package br.com.arekushi.mathio.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import br.com.arekushi.mathio.R;
import br.com.arekushi.mathio.adapters.MatterListAdapter;
import br.com.arekushi.mathio.model.Matter;

public class MatterListFragment extends Fragment {

    private String[] names;
    private String[] texts;
    private int[] imagesId;

    @NonNull
    public static MatterListFragment newInstance() {
        return new MatterListFragment();
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);

        getData(context.getResources());
    }

    private void getData(Resources r) {
        names = r.getStringArray(R.array.matter_names);
        texts = r.getStringArray(R.array.matter_description);

        TypedArray typedArray = r.obtainTypedArray(R.array.matter_images);
        imagesId = new int[names.length];

        for(int i = 0; i < names.length; i++) {
            imagesId[i] = typedArray.getResourceId(i, 0);
        }

        typedArray.recycle();
    }

    @Nullable
    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.recicleView);
        Context context = (Context) getActivity();

        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        recyclerView.setAdapter(new MatterListAdapter(names, texts, imagesId, context));

        return view;
    }

    public interface ListSelect {
        void onSelectedItem(Matter matter);
    }
}
