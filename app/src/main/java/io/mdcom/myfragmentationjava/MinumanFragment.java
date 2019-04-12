package io.mdcom.myfragmentationjava;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class MinumanFragment extends Fragment {
    Button pilih;
    RadioGroup radioGroup;
    RadioButton radioButton;

    public MinumanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_minuman, container, false);
        pilih=view.findViewById(R.id.pilih_minuman);
        radioGroup=view.findViewById(R.id.group_minuman);
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    radioButton = view.findViewById(selectedId);

                    Toast.makeText(getContext(),radioButton.getText().toString(),Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getContext(),"Minuman Belum Dipilih",Toast.LENGTH_LONG).show();
                }


            }
        });
        return view;
    }

}
