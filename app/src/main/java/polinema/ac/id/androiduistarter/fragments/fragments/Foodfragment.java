package polinema.ac.id.androiduistarter.fragments.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import polinema.ac.id.androiduistarter.R;

///**
// * A simple {@link Fragment} subclass.
// * Activities that contain this fragment must implement the
// * {@link Foodfragment.OnFragmentInteractionListener} interface
// * to handle interaction events.
// */
public class Foodfragment extends Fragment {


    public Foodfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_foodfragment, container, false);
    }

}