package src.PhoneSystem;

import java.util.Comparator;

public class NameSort implements Comparator<PhoneBook> {
    public int compare(PhoneBook s1, PhoneBook s2) {
        return s1.name.compareToIgnoreCase(s2.name);

    }
}
