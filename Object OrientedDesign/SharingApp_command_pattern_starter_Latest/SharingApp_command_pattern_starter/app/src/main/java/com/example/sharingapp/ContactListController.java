package com.example.sharingapp;

import android.content.Context;

import java.util.ArrayList;

public class ContactListController {

    ContactList userList;

    public ContactListController(ContactList userList) {
        this.userList = userList;
    }

    public void setUsers(ArrayList<Contact> users) {
        this.userList.setContacts(users);

    }
    public ArrayList<Contact> getUsers() {
        return userList.getContacts();
    }

    public int getIndex(Contact user) {
        return userList.getIndex(user);
    }

    public boolean hasUser(Contact user) {
        return userList.hasContact(user);
    }

    public Contact getUserByUsername(String username) {
        return userList.getContactByUsername(username);

    }

    public boolean isUsernameAvailable(String username) {
        return userList.isUsernameAvailable(username);
    }

    public void loadUsers(Context context) {
        userList.loadContacts(context);
    }

    public Contact getUser(int pos) {
        return userList.getContact(pos);
    }

    public ArrayList<String> getAllUsernames() {
        return userList.getAllUsernames();
    }

    public boolean addUser(Contact user, Context context) {
        AddContactCommand addUserCommand = new AddContactCommand(userList, user, context);
        addUserCommand.execute();
        return addUserCommand.isExecuted();
    }

    public boolean deleteUser(Contact user, Context context) {
        DeleteContactCommand deleteUserCommand = new DeleteContactCommand(userList, user, context);
        deleteUserCommand.execute();
        return deleteUserCommand.isExecuted();
    }

    public boolean editUser(Contact oldUser, Contact newUser, Context context) {
        EditContactCommand editUserCommand = new EditContactCommand(userList, oldUser, newUser, context);
        editUserCommand.execute();
        return editUserCommand.isExecuted();
    }

    public void addObserver(Observer observer) {
        userList.addObserver(observer);
    }

    public void removeObserver(Observer observer) {
        userList.removeObserver(observer);
    }

}
