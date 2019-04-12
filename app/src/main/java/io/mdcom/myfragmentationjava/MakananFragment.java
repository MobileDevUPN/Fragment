package io.mdcom.myfragmentationjava;


import android.content.Intent;
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
public class MakananFragment extends Fragment implements View.OnClickListener {
    Button pilih,pindah;
    RadioGroup radioGroup;
    RadioButton radioButton;
    View view;

    public MakananFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_makanan, container, false);
        pilih=view.findViewById(R.id.pilih_makanan);
        radioGroup=view.findViewById(R.id.group_makanan);
        pindah=view.findViewById(R.id.pindah_activity);
        pindah.setOnClickListener(this);
        pilih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    int selectedId = radioGroup.getCheckedRadioButtonId();
                    radioButton = view.findViewById(selectedId);

                    Toast.makeText(getContext(),radioButton.getText().toString(),Toast.LENGTH_LONG).show();
                }catch (Exception e){
                    Toast.makeText(getContext(),"Makanan Belum Dipilih",Toast.LENGTH_LONG).show();
                }


            }
        });

        return view;
    }

    @Override
    public void onClick(View v) {
        try{
            int selectedId = radioGroup.getCheckedRadioButtonId();
            radioButton = view.findViewById(selectedId);

            if(v.getId()==R.id.pilih_makanan){
                Toast.makeText(getContext(),radioButton.getText().toString(),Toast.LENGTH_LONG).show();
            }else if(v.getId()==R.id.pindah_activity){
                Intent intent = new Intent(getActivity(),PilihanActivity.class);
                intent.putExtra(PilihanActivity.menu,radioButton.getText().toString());
                startActivity(intent);
            }


        }catch (Exception e){
            Toast.makeText(getContext(),"Makanan Belum Dipilih",Toast.LENGTH_LONG).show();
        }


    }

}
