package app.lat2_akbif9_10116405_fahrihfatahilahcom.lat2_akbif9_10116405_fahrihfatahilah;
/*Nama : Fahrih Fatailah
NIM  : 10116405
KELAS : AKB-IF9
Tanggal Pengerjaan : 14 April 2019*/
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
    }
    public void verify (View view ){
        Intent intent = new Intent(AlmostThere.this,Verify.class);
        startActivity(intent);
    }

}
