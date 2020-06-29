package br.com.arekushi.mathio.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import br.com.arekushi.mathio.R;
import br.com.arekushi.mathio.model.Matter;

public class MatterFragment extends Fragment {

    public static MatterFragment newInstance() {
        return new MatterFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_matter2, container, false);

        assert getArguments() != null;
        Matter matter = (Matter) getArguments().getSerializable("matter");

        assert matter != null;
        ((ImageView) view.findViewById(R.id.matter_image)).setImageResource(matter.getImageId());
        ((TextView) view.findViewById(R.id.matter_title)).setText(matter.getName());
        ((TextView) view.findViewById(R.id.matter_text)).setText(matter.getText());

        return view;
    }
}
