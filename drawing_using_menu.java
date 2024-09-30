//kate m
//9/27/24


import java.util.Scanner;

public class drawing_using_menu {

  public static void main(String[] args) {
    
    while(true)
    {
      int choice = menu();
      if(choice == 3)
      {
        System.exit(0);
      }
      else if(choice == 1 || choice == 2)
      {
        draw_shape(choice);
      }
      else
      {
        System.out.println("Invalid input!");
      }
    }
  }

  public static void instructions()
  {
    System.out.println("This program will draw a diamond or a triangle with a size that the user inputs");
  }

  public static int menu()
  {
    System.out.println("\nMenu\n1) draw triangle");
    System.out.println("2) draw diamond");
    System.out.println("3) quit");
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter a choice: ");
    int choice = keyboard.nextInt();

    return choice;
  }

  public static void draw_shape(int choice)
  {
    int size = get_size();
    char c = get_char();

    if(choice == 1)
    {
      System.out.println("Draw triangle:");
      draw_triangle(size, c);
    }
    else if (choice == 2)
    {
      System.out.println("Draw diamond");
      draw_diamond(size, c);
    }
  }

  public static int get_size()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the size: ");
    int size = keyboard.nextInt();

    return size;
  }

  public static char get_char()
  {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter the character: ");
    char c = keyboard.next().charAt(0);

    return c;
  }

  public static void draw_triangle(int size, char c) {
    for (int i = 1; i <= size; i++) {
      for (int j = size - i; j > 0; j--) {
        System.out.print(" ");
      }
      for (int k = 1; k <= 2 * i - 1; k++) {
        System.out.print(c);
      }
      System.out.println();
    }
  }

  public static void draw_diamond(int size, char c)
  {
    draw_triangle(size, c);
    draw_bottom(size, c);
  }

  public static void draw_bottom(int size, char c) {
    for (int i = 0; i < size - 1; i++) 
    { 
      for (int j = 0; j <= i; j++) {
        System.out.print(" ");
      }

      for (int k = 0; k < 2 * (size - 1 - i) - 1; k++) {
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
