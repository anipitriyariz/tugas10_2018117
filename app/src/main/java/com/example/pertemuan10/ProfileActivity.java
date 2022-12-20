package com.example.pertemuan10;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import
        com.example.pertemuan10.databinding.ActivityProfileBinding;

import android.os.Bundle;

public class ProfileActivity extends AppCompatActivity {
    private ActivityProfileBinding binding;
    SharedPreferences preferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setup view binding
        binding =
                ActivityProfileBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        preferences = getSharedPreferences("AndroidHiveLogin",
                0);
        editor = preferences.edit();
        binding.buttonLogOut.setOnClickListener(new View.OnClickListener() {
                                                            @Override
                                                            public void onClick(View v) {
                                                                editor.clear();
                                                                editor.commit();
                                                                Intent intent = new Intent(ProfileActivity.this, MainActivity.class);
                                                                startActivity(intent);
                                                            }
                                                        });
    }
}
