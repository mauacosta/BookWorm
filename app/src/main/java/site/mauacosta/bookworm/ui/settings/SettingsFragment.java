package site.mauacosta.bookworm.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import site.mauacosta.bookworm.AddBook;
import site.mauacosta.bookworm.MainActivity;
import site.mauacosta.bookworm.R;

public class SettingsFragment extends Fragment {

    public SharedPreferences prefs;
    private static final String ARCHIVO_PREFS = "misPrefs";
    private static final String KEY_NAME = "nombre";
    private SettingsViewModel settingsViewModel;
    EditText nombre;
    Button boton;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        settingsViewModel = new ViewModelProvider(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);


        nombre = root.findViewById(R.id.etChangeName);
        boton = root.findViewById(R.id.btnChangeName);

        prefs = getActivity().getSharedPreferences(ARCHIVO_PREFS, Context.MODE_PRIVATE);


        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = prefs.edit();
                editor.putString(KEY_NAME, nombre.getText().toString());
                editor.commit();
            }
        });

            return root;

    }


    public void goToChooseBook(View v){
        ((MainActivity) getActivity()).goToAddBook(v);
    }
}