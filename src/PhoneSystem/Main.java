package src.PhoneSystem;


import java.util.Scanner;
import java.util.*;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        PhoneBook newPhone = new PhoneBook();
        while (1 > 0) {

            System.out.println("Nhap chuc nang can su dung");
            System.out.println("1.Insert Phone");
            System.out.println("2.Remove Phone");
            System.out.println("3.Update Phone");
            System.out.println("4.Search Phone");
            System.out.println("6.Exit");
            Scanner scanner = new Scanner(System.in);

    int x = scanner.nextInt();

                if (x == 6) {
                    break;
                } else {
                    switch (x) {
                        case (1):
                            newPhone.insertPhone();
                            break;
                        case (2):
                            newPhone.removePhone();
                            break;
                        case (3):
                            newPhone.updatePhone();
                            break;
                        case (4):
                            newPhone.searchPhone();
                            break;
                        case (5):
                            newPhone.sort();
                            break;
                    }
                }


        }

        for (PhoneBook p : newPhone.PhoneList) {
            System.out.println(p.name + ":" + p.Phone);
        }
        }
    }

