package com.company;


import java.text.SimpleDateFormat;
import java.util.Date;

public class coffee {
    coffee(String Name, String Surname, Date BirthdayDate, String PhoneNumber, String Email) {
        name = Name;
        System.out.println("Имя: " + name);
        surname = Surname;
        System.out.println("Фамилия: " + surname);
        birthdayDate = BirthdayDate;
        System.out.println("Дата рождения: " + birthdayDate);
        phoneNumber = PhoneNumber;
        System.out.println("Номер телефона: " + phoneNumber);
        email = Email;
        System.out.println("Email " + Email);
    }

    coffee(String Name, String Surname, Date BirthdayDate, String PhoneNumber, String Email, boolean CriminalRecord, String Position, double Salary, Date EmploymentDate) {
        this(Name, Surname, BirthdayDate, PhoneNumber, Email);
        criminalRecord = CriminalRecord;
        System.out.println("Судимость " + CriminalRecord);
        position = Position;
        System.out.println("Должность " + Position);
        salary = Salary;
        System.out.println("Дата принятия на Работу " + EmploymentDate);
        employmentDate = EmploymentDate;
    }
    
    String name;
    String surname;
    Date birthdayDate;
    String phoneNumber;
    String email;
    boolean criminalRecord;
    String position;
    double salary;
    Date employmentDate;
}

class coffeeTest {
    public static void main(String[] args) throws Exception {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        coffee seller = new coffee("sellerName", "sellerSurname", simpleDateFormat.parse("15/3/1980"), "0964320659", "Email1@email.com", true, "Seller", 12345, simpleDateFormat.parse("05/12/2020"));
        System.out.println();
        coffee buyer = new coffee("buyerName", "buyerSurname", simpleDateFormat.parse("4/11/1999"), "0973834852", "Email2@email.com");
    }
}