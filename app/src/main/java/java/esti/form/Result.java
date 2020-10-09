package java.esti.form;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import java.esti.form.Models.Biodata;
import java.esti.form.databinding.ActivityResultBinding;
import java.util.Objects;


public class Result extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityResultBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_result);
        Biodata biodata = Objects.requireNonNull(getIntent().getExtras()).getParcelable("BIODATA");
        binding.setBiodata(biodata);
    }
}