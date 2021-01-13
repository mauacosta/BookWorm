package site.mauacosta.bookworm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AddBook extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);
    }

    public void goToCustomBook(View v){
        Intent i = new Intent(this, CustomBook.class);
        startActivity(i);
    }
}