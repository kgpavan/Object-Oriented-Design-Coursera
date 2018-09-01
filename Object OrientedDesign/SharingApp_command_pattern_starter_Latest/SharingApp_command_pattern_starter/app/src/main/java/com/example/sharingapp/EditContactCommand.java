package com.example.sharingapp;
import android.content.Context;

public class EditContactCommand extends Command{
    private ContactList userList;
    private Contact oldUser;
    private Contact newUser;
    private Context context;

    EditContactCommand(ContactList userList, Contact oldUser, Contact newUser, Context context) {
        this.userList = userList;
        this.oldUser = oldUser;
        this.newUser = newUser;
        this.context = context;
    }

    @Override
    public void execute() {
        userList.deleteContact(oldUser);
        userList.addContact(newUser);
        setIsExecuted(userList.saveContacts(context));
    }


}
