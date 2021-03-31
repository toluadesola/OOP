package decagon.tolulope.MOBILEPHONE1;

import java.util.ArrayList;

public class MobilePhone {

    private Contact contact;

    private ArrayList<Contact> mobilePhone = new ArrayList<>();

    //Add contact
    public void addContact(String name, String number){

        int temp = mobilePhone.indexOf(number);
        if(temp>1){
            System.out.println("This number already exists");
        } else {
            mobilePhone.add(new Contact(name, number ));
        }
    }

    //Modify contact
    public void modifyContact(Contact oldContact, Contact newContact){
        int index = findContact(oldContact);
        if(index >= 0) {
            modifyContact(index, newContact);
        }else {
            System.out.println("This number has not been saved before");
        }
    }

    private void modifyContact(int index, Contact contact){
        mobilePhone.set(index, new Contact(contact.getName(), contact.getPhoneNumber()));
        System.out.println("Contact list has been updated");
    }

    //Remove contact
    public void removeContact(Contact contact){
        int index = findContact(contact);
        if(index>0){
            removeContact(index);
            System.out.println("Contact has been deleted");
        }
    }

    //query contact
    public void queryContact(){
        System.out.println("You have " +mobilePhone.size()+ " contacts.");
        for (Contact m: mobilePhone ){
            System.out.println(m);
        }
    }

    private void removeContact(int index){
        mobilePhone.remove(index);
    }

    public int findContact(Contact phoneNumber){
        return mobilePhone.indexOf(phoneNumber.getPhoneNumber());
    }
}
