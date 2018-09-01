package com.example.sharingapp;


import android.content.Context;

class DeleteContactCommand extends Command {

    private ContactList userList;
    private Contact user;
    private Context context;

    DeleteContactCommand(ContactList userList, Contact user, Context context) {
        this.userList = userList;
        this.user = user;
        this.context = context;
    }

    @Override
    public void execute() {
        userList.deleteContact(user);
        setIsExecuted(userList.saveContacts(context));
    }
}