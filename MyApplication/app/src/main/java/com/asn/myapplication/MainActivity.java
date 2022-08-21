package com.asn.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Barrier;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Locale;
import java.util.Set;

public class MainActivity extends AppCompatActivity {
    EditText editTextŞehir, editTextPlaka;
    TextView show, showPlaka;
    static HashMap<Integer, String> hashMap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextŞehir = findViewById(R.id.editText);
        editTextPlaka = findViewById(R.id.editText2);
        show = findViewById(R.id.textView1);
        showPlaka = findViewById(R.id.textView2);

    }

    public void sehirler(View view) {
        tümŞehirler();
        Set<Integer> value = hashMap.keySet();
        for (Integer temp : value) {
            if (editTextŞehir.getText().toString().matches("")) {
                show.setText("lütfen öncelikle bir \nşehir ismi yazınız");
            } else if (hashMap.get(temp).toUpperCase(Locale.ROOT).equals(editTextŞehir.getText().toString().toUpperCase(Locale.ROOT).replaceAll(" ","" ).replace(".",""))) {
                show.setText("" + temp);
                break;
            } else {
                show.setText("Böyle bir ilimiz yok \n bu kısma sadece il isimleri yazılır");
            }
        }
    }

    public static void tümŞehirler() {
        hashMap = new HashMap<Integer, String>(81);

        hashMap.put(01, "Adana");
        hashMap.put(02, "Adıyaman");
        hashMap.put(03, "Afyon");
        hashMap.put(04, "Ağrı");
        hashMap.put(05, "Amasya");
        hashMap.put(06, "Ankara");
        hashMap.put(07, "Antalya");
        hashMap.put(8, "Artvin");
        hashMap.put(9, "Aydın");
        hashMap.put(10, "Balıkesir");
        hashMap.put(11, "Bilecik");
        hashMap.put(12, "Bingöl");
        hashMap.put(13, "Bitlis");
        hashMap.put(14, "Bolu");
        hashMap.put(15, "Burdur");
        hashMap.put(16, "Bursa");
        hashMap.put(17, "Çanakkale");
        hashMap.put(18, "Çankırı");
        hashMap.put(19, "Çorum");
        hashMap.put(20, "Denizli");
        hashMap.put(21, "Diyarbakır");
        hashMap.put(22, "Edirne");
        hashMap.put(23, "Elazığ");
        hashMap.put(24, "Erzincan");
        hashMap.put(25, "Erzurum");
        hashMap.put(26, "Eskişehir");
        hashMap.put(27, "Gaziantep");
        hashMap.put(28, "Giresun");
        hashMap.put(29, "Gümüşhane");
        hashMap.put(30, "Hakkâri");
        hashMap.put(31, "Hatay");
        hashMap.put(32, "Isparta");
        hashMap.put(33, "Mersin");
        hashMap.put(34, "istanbul ");
        hashMap.put(35, "izmir");
        hashMap.put(36, "Kars");
        hashMap.put(37, "Kastamonu");
        hashMap.put(38, "Kayseri");
        hashMap.put(39, "Kırklareli");
        hashMap.put(40, "Kırşehir");
        hashMap.put(41, "Kocaeli");
        hashMap.put(42, "Konya");
        hashMap.put(43, "Kütahya");
        hashMap.put(44, "Malatya");
        hashMap.put(45, "Manisa");
        hashMap.put(46, "Kahramanmaraş");
        hashMap.put(47, "Mardin");
        hashMap.put(48, "Muğla ");
        hashMap.put(49, "Muş");
        hashMap.put(50, "Nevşehir");
        hashMap.put(51, "Niğde");
        hashMap.put(52, "Ordu");
        hashMap.put(53, "Rize");
        hashMap.put(54, "Sakarya");
        hashMap.put(55, "Samsun");
        hashMap.put(56, "Siirt");
        hashMap.put(57, "Sinop");
        hashMap.put(58, "Sivas");
        hashMap.put(59, "Tekirdağ");
        hashMap.put(60, "Tokat");
        hashMap.put(61, "Trabzon");
        hashMap.put(62, "Tunceli");
        hashMap.put(63, "Şanlıurfa");
        hashMap.put(64, "Uşak");
        hashMap.put(65, "Van");
        hashMap.put(66, "Yozgat");
        hashMap.put(67, "Zonguldak");
        hashMap.put(68, "Aksaray");
        hashMap.put(69, "Bayburt");
        hashMap.put(70, "Karaman");
        hashMap.put(71, "Kırıkkale");
        hashMap.put(72, "Batman");
        hashMap.put(73, "Şırnak");
        hashMap.put(74, "Bartın");
        hashMap.put(75, "Ardahan");
        hashMap.put(76, "Iğdır");
        hashMap.put(77, "Yalova");
        hashMap.put(78, "Karabük");
        hashMap.put(79, "Kilis");
        hashMap.put(80, "Osmaniye");
        hashMap.put(81, "Düzce");

    }

    public void plkaKodIle(View view) {
        tümŞehirler();
        Set<Integer> value = hashMap.keySet();
        for (Integer temp : value) {
            if (editTextPlaka.getText().toString().matches("")) {
                showPlaka.setText("lütfen bir plaka kodu  yazınız");
            } else if (temp == Integer.parseInt(editTextPlaka.getText().toString())) {
                showPlaka.setText("" + hashMap.get(temp));
                break;
            } else {
                showPlaka.setText("Böyle bir plaka kodu yok");
            }
        }
    }
}






