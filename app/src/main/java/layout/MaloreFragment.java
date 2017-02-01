package layout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utente.neveralone.R;

public class MaloreFragment extends Fragment {

    private String title;
    private int page;

    public MaloreFragment() {
        // Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");

    }

    public static MaloreFragment newInstance(int page, String title) {

        MaloreFragment fragment = new MaloreFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_malore, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.titolo1);
        tvLabel.setText(page + " -- " + title);
        return view;
    }
}
