package src.PhoneSystem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Comparator;

public class PhoneBook extends Phone {
    public ArrayList<PhoneBook> PhoneList;
    public PhoneBook(){
        this.PhoneList=new ArrayList<>();
    }
    public PhoneBook(String name,String Phone){
        this.Phone=Phone;
        this.name=name;
    }

    Scanner scanner= new Scanner(System.in);
    public void insertPhone(){
        System.out.println("Nhap ten: ");
        String name=scanner.next();
        System.out.println("ten vua nhap: "+name);
        int count=0;
        for(PhoneBook p: this.PhoneList) {
            if(p.name.equals(name)) {
                count=1;
                System.out.println("Ten SDT da co san-nhap them SDT: ");
                String phone=scanner.next();
                System.out.println("SDT vua nhap"+phone);
                p.Phone=p.Phone.concat(":"+phone);
                break;
            }
        }
        if(count==0){
            System.out.println("Nhap SDT: ");
            String phone=scanner.next();
            System.out.println("SDT vua nhap"+phone);
            this.PhoneList.add(new PhoneBook(name,phone));

        }
    }
    public void removePhone(){
        System.out.println("Nhap ten SDT can xoa: ");
        String name=scanner.next();
        for(PhoneBook p: this.PhoneList) {
            if(p.name.equals(name)) {
                this.PhoneList.remove(p);
                break;

            }
        }
    }
    public void updatePhone(){
        System.out.println("Nhap ten SDT can update: ");
        String name=scanner.next();
        for(PhoneBook p: this.PhoneList) {
            if(p.name.equals(name)) {
                System.out.println("Nhap SDT moi: ");
                String phone=scanner.next();
                p.Phone=phone;
                break;
            }
        }
    }
    public void searchPhone(){
        System.out.println("Nhap ten SDT can search: ");
        String name=scanner.next();
        int count=0;
        for(PhoneBook p: this.PhoneList) {
            if(p.name.equals(name)) {
                count=1;
                System.out.println(p.name + ":"+p.Phone);
                break;
            }
        }
        if(count==0){
            System.out.println("Ten SDT nay khong co trong danh ba");
        }

    }
    public void sort(){
        Collections.sort(this.PhoneList, new NameSort());
        for(PhoneBook p: this.PhoneList) {
            System.out.println(p.name+":"+p.Phone);
        }
    }


    }


