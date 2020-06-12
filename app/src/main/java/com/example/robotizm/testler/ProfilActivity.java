package com.example.robotizm.testler;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.robotizm.AnaSayfaActivity;
import com.example.robotizm.Main2Activity;
import com.example.robotizm.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;
import com.google.firebase.storage.UploadTask;

import java.io.IOException;

public class ProfilActivity extends AppCompatActivity {
    private static final int CHOOSE_IMAGE = 101;
    ImageView imageView;
    EditText editText;
    Uri uriProfileImage;
    ProgressBar progressBar;
    String profileImageUrl;
    FirebaseAuth mAuth;
    TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        editText=findViewById(R.id.ProfileText);
        imageView=findViewById(R.id.camera);
        progressBar=findViewById(R.id.progressbar);
        mAuth=FirebaseAuth.getInstance();
        textView=(TextView)findViewById(R.id.TextViewProfil);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
                    public void onClick(View view){

                showImageChooser();

                loadUserInformation();

            }

        });
        findViewById(R.id.buttonSave).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                saveUserInformation();
            }
                                                         }
        );


    }




    private void loadUserInformation() {
        final FirebaseUser user = mAuth.getCurrentUser();
        if (user != null) {


            if (user.isEmailVerified()) {
                textView.setText("E-posta doğrulandı");

            } else {
                textView.setText("E-posta doğrulanmadı.Tıklayın");
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        user.sendEmailVerification().addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                Toast.makeText(ProfilActivity.this, "Doğrulama kodu gönderildi", Toast.LENGTH_LONG).show();
                            }
                        });
                    }
                });
            }}
    }




    private void saveUserInformation() {
        String displayName=editText.getText().toString();

        if(displayName.isEmpty()){
            editText.setError("Lütfen bir isim giriniz");
            editText.requestFocus();
            return;

        }






        final FirebaseUser user = mAuth.getCurrentUser();



        if(user!=null && profileImageUrl!=null){
            UserProfileChangeRequest profile=new UserProfileChangeRequest.Builder().
                    setDisplayName(displayName)
                    .setPhotoUri(Uri.parse(profileImageUrl))
                    .build();

            user.updateProfile(profile).addOnCompleteListener(new OnCompleteListener<Void>() {
                @Override
                public void onComplete(@NonNull Task<Void> task) {
                    if(task.isSuccessful()){
                        Toast.makeText(ProfilActivity.this,"Profil güncellendi",Toast.LENGTH_LONG).show();
                    }
                }
            });
        }


    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode== CHOOSE_IMAGE && resultCode==RESULT_OK && data!=null &&data.getData()!=null){

            uriProfileImage=data.getData();
            try {
                Bitmap bitmap= MediaStore.Images.Media.getBitmap(getContentResolver(), uriProfileImage);
                imageView.setImageBitmap(bitmap);

                uploadImageToFirebaseStorage();

            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void uploadImageToFirebaseStorage(){
        StorageReference profileImageRef=
                FirebaseStorage.getInstance().getReference("profilepics/" + System.currentTimeMillis() + ".jpg");

        if(uriProfileImage!=null){
            progressBar.setVisibility(View.VISIBLE);
            profileImageRef.putFile(uriProfileImage).
                    addOnSuccessListener(new OnSuccessListener<UploadTask.TaskSnapshot>() {
                @Override
                public void onSuccess(UploadTask.TaskSnapshot taskSnapshot) {
                    progressBar.setVisibility(View.GONE);
                    profileImageUrl= taskSnapshot.getStorage().getDownloadUrl().toString();

                }
            }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    progressBar.setVisibility(View.GONE);
                    Toast.makeText(ProfilActivity.this,e.getMessage(), Toast.LENGTH_LONG).show();


                }
            });
        }
    }



    private void showImageChooser(){
        Intent intent=new Intent();
        intent.setType("image/*");
        intent.setAction(Intent.ACTION_GET_CONTENT);
        startActivityForResult(Intent.createChooser(intent,"select profile image "), CHOOSE_IMAGE);

    }
}
