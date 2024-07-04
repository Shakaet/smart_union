package com.example.smart_union;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class sign_up extends AppCompatActivity {

    private FirebaseAuth auth;
    private EditText signupEmail, signupPassword,signupWord,signupNid,signupHolding;
    private Button signupButton;
    private TextView loginRedirectText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Initialize the FirebaseAuth instance in the onCreate()
        auth = FirebaseAuth.getInstance();
        signupEmail = findViewById(R.id.signup_email);
        signupWord=findViewById(R.id.ward);
        signupNid=findViewById(R.id.nid);
        signupHolding=findViewById(R.id.holding);
        signupPassword = findViewById(R.id.signup_password);
        signupButton = findViewById(R.id.signup_button);
        loginRedirectText = findViewById(R.id.loginRedirectText);


        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = signupEmail.getText().toString().trim();
                String word=signupWord.getText().toString().trim();
                String nid=signupNid.getText().toString().trim();
                String holding=signupHolding.getText().toString().trim();
                String pass = signupPassword.getText().toString().trim();


                if (user.isEmpty()){
                    signupEmail.setError("Email cannot be empty");
                }
                else if(pass.isEmpty()){
                    signupPassword.setError("Password cannot be empty");
                }
                else if(word.isEmpty()){
                    signupPassword.setError("word cannot be empty");
                }
                else if(nid.isEmpty()){
                    signupPassword.setError("Nid cannot be empty");
                }
                else if(holding.isEmpty()){
                    signupPassword.setError("Holding cannot be empty");
                }

                else{
                    auth.createUserWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(sign_up.this, "Signup Successful", Toast.LENGTH_SHORT).show();

                                Bundle translatebundle= ActivityOptions.makeCustomAnimation(sign_up.this,
                                        R.anim.slide_in_left,
                                        R.anim.slide_out_right).toBundle();

                                startActivity(new Intent(sign_up.this, login.class),translatebundle);
                            } else{
                                Toast.makeText(sign_up.this, "Signup Failed" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });

        loginRedirectText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(sign_up.this,login.class));
            }
        });




    }
}