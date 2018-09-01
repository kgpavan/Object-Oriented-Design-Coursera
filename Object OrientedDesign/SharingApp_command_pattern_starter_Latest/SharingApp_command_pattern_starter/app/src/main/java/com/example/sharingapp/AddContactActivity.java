package com.example.sharingapp;

import android.content.Context;
//import android.support.v7.app.AppCompatActivity;
import android.support.*;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

/**
 * Add a new contact
 */
public class AddContactActivity extends AppCompatActivity {

    private ContactList contact_list = new ContactList();
    private ContactListController userListController = new ContactListController(contact_list);

    private Context context;

    private EditText username;
    private EditText email;

    private String contact_name;
    private String contact_email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contact);

        username = (EditText) findViewById(R.id.username);
        email = (EditText) findViewById(R.id.email);

        context = getApplicationContext();
        userListController.loadUsers(context);


    }

    public void saveContact(View view) {

        Contact contact = new Contact(contact_name, contact_email, null);

        if(!validateInput()) {
            return;
        }

        boolean success = userListController.addContact(contact, context);
        if (!success){
            return;
        }
        finish();
    }
    private boolean validateInput() {
        if (contact_name.equals("")) {
            username.setError("Empty field!");
            return false;
        }

        if (!contact_email.contains("@")) {
            email.setError("Must be an email address!");
            return false;
        }

        if (!userListController.isUsernameAvailable(contact_name)){
            username.setError("Username already taken!");
            return false;
        }
        return true;
    }
}
