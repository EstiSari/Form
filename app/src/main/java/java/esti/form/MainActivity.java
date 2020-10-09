package java.esti.form;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.esti.form.Models.Biodata;
import java.esti.form.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    Biodata biodata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        biodata = new Biodata();

        binding.nextOrtu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                biodata.setNama(binding.edtNama.getText().toString());
                biodata.setFakultas(binding.spinnerFakultas.getSelectedItem().toString());
                biodata.setJurusan(binding.spinnerJurusan.getSelectedItem().toString());
                biodata.setStatus(binding.spinnerStatusRegister.getSelectedItem().toString());
                biodata.setPassword(binding.edtPassword.getText().toString());
                biodata.setReason(binding.edtReason.getText().toString());
                biodata.setNik(binding.edtNik.getText().toString());
                biodata.setAchievment(binding.edtPencapaian.getText().toString());
                biodata.setDateBirth(binding.edtTanggalLahir.getText().toString());
                biodata.setGender(binding.spinnerGender.getSelectedItem().toString());
                biodata.setCitizen(binding.edtCitizen.getText().toString());
                biodata.setAgama(binding.spinnerAgama.getSelectedItem().toString());
                biodata.setAlamat(binding.edtAlamat.getText().toString());
                biodata.setRt(binding.edtRT.getText().toString());
                biodata.setRw(binding.edtRW.getText().toString());
                biodata.setKodePos(binding.edtKodePos.getText().toString());
                biodata.setProvinsi(binding.edtProvinsi.getText().toString());
                biodata.setKota(binding.edtKota.getText().toString());
                biodata.setTelp(binding.edtTelp.getText().toString());
                biodata.setHandphone(binding.edtPhoneNumber.getText().toString());
                biodata.setEmail(binding.edtEmail.getText().toString());

                Intent intent = new Intent(getApplicationContext(),Result.class);
                intent.putExtra("BIODATA", biodata);

                startActivity(intent);

            }
        });
    }
}