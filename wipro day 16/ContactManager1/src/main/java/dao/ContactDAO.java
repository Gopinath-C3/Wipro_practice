package dao;


import model.Contact;
import java.util.*;

public class ContactDAO {
    private static List<Contact> contacts = new ArrayList<>();
    private static int idCounter = 1;

    public static List<Contact> getAllContacts() {
        return contacts;
    }

    public static Contact getContactById(int id) {
        return contacts.stream()
                .filter(c -> c.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public static boolean addContact(Contact contact) {
        contact.setId(idCounter++);
        return contacts.add(contact);
    }

    public static boolean updateContact(Contact updatedContact) {
        for (Contact c : contacts) {
            if (c.getId() == updatedContact.getId()) {
                c.setName(updatedContact.getName());
                c.setEmail(updatedContact.getEmail());
                c.setPhone(updatedContact.getPhone());
                return true;
            }
        }
        return false;
    }

    public static boolean deleteContact(int id) {
        return contacts.removeIf(c -> c.getId() == id);
    }
}

