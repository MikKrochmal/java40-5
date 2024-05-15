public class Student {

  private String Name;
  private int Age;
  private String Last_name;

  public Student(String name, int age, String last_name) {
    Name = name;
    Age = age;
    Last_name = last_name;
  }

  public String GetName() {return Name;}
  public int GetAge() {return Age;}
  public String GetLast_name() {return Last_name;}
  public String ToString() {
    return Name + " " + Last_name+" "+Integer.toString(Age);
  }

    public static Student Parse(String str) {
      String[] data = str.split(" ");
      if(data.length != 3) 
        return new Student("----------",  -1, "---------");
      return new Student(data[0],Integer.parseInt(data[1]) ,  data[2] ); 
    }
  }
