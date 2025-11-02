package software.ulpgc.kata1;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person naiara = new Person("Naiara", LocalDate.of(2005, 7, 26));
        System.out.println(naiara);
    }
}