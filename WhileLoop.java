public class WhileLoop {
  public static void main(String[] args) {
    System.out.printf("%nChoose three of the most concerned elements.");
    System.out.printf("%nEnter 0 for \"beach\"%nEnter 1 for \"museums and historical sites\"%nEnter 2 for \"city life\"%nEnter 3 for \"nature\"%nEnter 4 for \"amusement park\"%n");

    System.out.printf("%nWhat's your first most concerned element%n");
    int a1 = TextIO.getlnInt();
    while (a1 > 4 || a1 < 0) {
      System.out.println("Please enter a number between 0-4.");
      a1 = TextIO.getlnInt();
    }

    System.out.printf("%nWhat's your second most concerned element%n");
    int a2 = TextIO.getlnInt();
    while (a2 > 4 || a2 < 0) {
      System.out.println("Please enter a number between 0-4.");
      a2 = TextIO.getlnInt();
    }

    System.out.printf("%nWhat's your third most concerned element%n");
    int a3 = TextIO.getlnInt();
    while (a3 > 4 || a3 < 0) {
      System.out.println("Please enter a number between 0-4.");
      a3 = TextIO.getlnInt();
    }
  }
}
