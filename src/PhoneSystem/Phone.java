package src.PhoneSystem;


public abstract class Phone {
    String name;
    String Phone;

//- abstract void insertPhone(String name, String  phone)
    public abstract void insertPhone();
//- abstract void removePhone(String name)
    public abstract void removePhone();
//- abstract void updatePhone(String name, String newphone)
    public abstract void updatePhone();
//- abstract void searchPhone(String name)
    public abstract void searchPhone();
//- abstract void sort()
    public abstract void sort();

}
