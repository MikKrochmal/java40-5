/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;
import java.util.List;
class Main 
{
  public static void main(String[] args) 
  {
    try 
      {
        Service s = new Service();        
        s.addStudent(new Student("Krzysztof", 20,"Kowalski"));
        s.addStudent(new Student("Janusz", 40, "KUźmowski"));  
        Scanner scanner = new Scanner(System.in);
        int wybor=0;
        Scanner input = new Scanner(System.in);
        while(wybor >0 || wybor <3)
          {
            System.out.println("wybierz akcję którą chcesz wykonać");
            System.out.println("1. Dodaj studenta");
            System.out.println("2. Wyświetl wszystkich studentów");
            System.out.println("0. Wyjdź");

        wybor=scanner.nextInt();
        switch(wybor)
        {
        case 1:
            {
               
              System.out.println("Podaj imię studenta");
              String imie = input.next();
              System.out.println("Podaj wiek studenta");
              int wiek= input.nextInt();
              System.out.println("Podaj nazwisko studenta");
              String nazwisko=input.next();
              s.addStudent(new Student(imie, wiek, nazwisko));
              break;
            }
          case 2:
            {
              List<Student> students = (List<Student>) s.getStudents();
              for(Student current: students) {
                System.out.println(current.ToString());
              }
              break;
            }
          case 0:
            {
              System.out.println("Koniec programu");
              break;
            }
          default:
            {
              System.out.println("Nie ma takiej opcji");
              break;
            }
        }
      }

    } catch (IOException e) {}


  }
}