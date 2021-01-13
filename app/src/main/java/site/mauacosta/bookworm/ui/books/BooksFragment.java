package site.mauacosta.bookworm.ui.books;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import site.mauacosta.bookworm.MainActivity;
import site.mauacosta.bookworm.R;

public class BooksFragment extends Fragment {

    private BooksViewModel booksViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        booksViewModel =
                new ViewModelProvider(this).get(BooksViewModel.class);
        View root = inflater.inflate(R.layout.fragment_books, container, false);
        return root;
    }

    public void goToChooseBook(View v){
        ((MainActivity) getActivity()).goToAddBook(v);
    }
}