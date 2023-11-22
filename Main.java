import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Enter employee name: ");
    String name = scan.nextLine();

    System.out.print("Press F for full time or P for part-time: ");
    String pos = scan.nextLine();

    if(pos.equals("F") || pos.equals("f")){
      System.out.println("-----------Full Time-----------");
      System.out.print("Enter basic pay: ");
      String basicPay = scan.nextLine();

      System.out.println("------------------");
      System.out.println("Employee Name "+ name);
      System.out.println("Basic Pay " + basicPay);

      System.out.println("------------------");
      System.out.print("Gross Pay "+ basicPay);
    }else{
      System.out.println("-----------Part Time-----------");
      System.out.print("Enter rate per hour: ");
      double rate = scan.nextDouble();
      System.out.print("Enter no. hours: ");
      double hours = scan.nextDouble();
      System.out.print("Enter no. overtime: ");
      double oT = scan.nextDouble();

      double basicPay = (rate*hours);
      double otPay = oT*(rate*1.25);

      System.out.println("------------------");
      System.out.println("Employee Name "+ name);
      System.out.println("Basic Pay " + basicPay);
      System.out.println("Overtime Pay " + otPay);

      
      
      System.out.println("------------------");
      System.out.print("Gross Pay "+ (basicPay + otPay));
      

      
      
    }
  }
}