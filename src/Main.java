// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      System.out.println("Hello World!");

      Student s = new Student ( "Gazza", 62);
      System.out.println(s);
      System.out.println(s.getName());
      System.out.println(s.getAge());

      s.setName("Gareth");
      s.birthday();

      System.out.println(s.getName());
      System.out.println(s.getAge());

      s.addNickname("Gaz");
      s.addNickname("Garry");
      s.printNicknames();

     /*Student s2 = new Student( "Jarrel", 21);
      System.out.println(s2);
      System.out.println(s2.getName());
      System.out.println(s2.getAge());

      Module m = new Module("Calculus", 4);
      System.out.println(m);
      System.out.println(m.getName());
      System.out.println(m.getCapacity());*/

        }
    }
