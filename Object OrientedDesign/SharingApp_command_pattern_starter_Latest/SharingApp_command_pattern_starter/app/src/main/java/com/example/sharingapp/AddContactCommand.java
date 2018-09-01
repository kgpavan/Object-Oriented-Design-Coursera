package com.example.sharingapp;
import android.content.Context;

class AddContactCommand extends Command {

    private ContactList userList;
    private Contact user;
    private Context context;

    AddContactCommand(ContactList userList, Contact user, Context context) {
        this.userList = userList;
        this.user = user;
        this.context = context;
    }

    @Override
    public void execute() {
        userList.addContact(user);
        setIsExecuted(userList.saveContacts(context));
    }
}