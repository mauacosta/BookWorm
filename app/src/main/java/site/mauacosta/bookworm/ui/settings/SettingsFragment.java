package site.mauacosta.bookworm.ui.settings;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import site.mauacosta.bookworm.AddBook;
import site.mauacosta.bookworm.MainActivity;
import site.mauacosta.bookworm.R;

public class SettingsFragment extends Fragment {

    private SettingsViewModel settingsViewModel;
    EditText nombre;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        settingsViewModel =
                new ViewModelProvider(this).get(SettingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_settings, container, false);
        return root;
    }

    public void goToChooseBook(View v){
        ((MainActivity) getActivity()).goToAddBook(v);
    }
}