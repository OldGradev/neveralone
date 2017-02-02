package layout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.utente.neveralone.Disagio;
import com.example.utente.neveralone.R;
import com.example.utente.neveralone.VolontarioAdapter;

import java.util.ArrayList;


public class MedicineFragment extends Fragment {

    private String title;
    private int page;

    Intent intent;

    RecyclerView disagioRV;
    RecyclerView.LayoutManager layoutManager;
    VolontarioAdapter adapter;

    public MedicineFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        page = getArguments().getInt("someInt", 0);
        title = getArguments().getString("someTitle");

    }

    public static MedicineFragment newInstance(int page, String title) {

        MedicineFragment fragment = new MedicineFragment();
        Bundle args = new Bundle();
        args.putInt("someInt", page);
        args.putString("someTitle", title);
        fragment.setArguments(args);
        return fragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_medicine, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.titolo1);
        tvLabel.setText(page + " -- " + title);
        return view;
    }

    private void fetchDisagi() {

        ArrayList<Disagio> disagii = new ArrayList<>();

        Disagio d1 = new Disagio("ho un malore al cuore", "via carlo ", "malore Cuore", "Mario Rossi");
        Disagio d2 = new Disagio("ho un malore alla testa", "via carlo martino", "malore Testa", "Maria Gialli");
        Disagio d3 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d4 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d5 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d6 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");
        Disagio d7 = new Disagio("ho bisogno di compagnia", "via  martino", "Compagnia", "Carmelo Giorgio");

        disagii.add(d1);
        disagii.add(d2);
        disagii.add(d3);
        disagii.add(d4);
        disagii.add(d5);
        disagii.add(d6);
        disagii.add(d7);

        adapter.setDataSet(disagii);

    }

}
