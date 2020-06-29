package br.com.arekushi.mathio.activitys;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.Toast;

import br.com.arekushi.mathio.R;
import br.com.arekushi.mathio.fragments.MatterFragment;
import br.com.arekushi.mathio.fragments.MatterListFragment;
import br.com.arekushi.mathio.model.Matter;

public class MainActivity extends AppCompatActivity implements MatterListFragment.ListSelect {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.frame_layout, MatterListFragment.newInstance(), "listMatters")
                    .commit();
        }
    }

    @Override
    public void onSelectedItem(Matter matter) {
        Bundle args = new Bundle();
        args.putSerializable("matter", matter);

        Fragment fragmentMatter = MatterFragment.newInstance();
        fragmentMatter.setArguments(args);

        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.frame_layout, fragmentMatter, "matter")
                .addToBackStack(null)
                .commit();
    }
}