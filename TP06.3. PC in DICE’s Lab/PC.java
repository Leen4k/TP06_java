import java.util.*;
public class PC {
    private String name;
    private boolean isDamaged = false;
  
    public PC(String name, boolean isDamaged) {
      this.name = name;
      this.isDamaged= isDamaged;
    }
  
    public String getName() {
      return this.name;
    }
  
    public boolean isDamaged() {
      return this.isDamaged;
    }
  
    public void markAsDamaged() {
      this.isDamaged = true;
    }
  
    public void markAsNotDamaged() {
      this.isDamaged = false;
    }
    public static void main(String[] args) {
      PC[] pcs = new PC[2];
      pcs[0] = new PC("PC1",true);
      pcs[1] = new PC("PC2",false);

  
      Scanner scanner = new Scanner(System.in);
  
      while (true) {
        System.out.println("Menu:");
        System.out.println("1. List all PCs");
        System.out.println("2. List all damaged PCs");
        System.out.println("3. List all good PCs");
        System.out.println("4. Mark a PC as damaged");
        System.out.println("5. Mark a PC as not damaged");
        System.out.println("6. Quit");
  
        int choice = scanner.nextInt();
  
        if (choice == 1) {
          for (int i = 0; i < pcs.length; i++) {
            System.out.println(pcs[i].getName());
          }
        } else if (choice == 2) {
          for (int i = 0; i < pcs.length; i++) {
            if (pcs[i].isDamaged()) {
              System.out.println(pcs[i].getName());
            }
          }
        } else if (choice == 3) {
          for (int i = 0; i < pcs.length; i++) {
            if (!pcs[i].isDamaged()) {
              System.out.println(pcs[i].getName());
            }
          }
        } else if (choice == 4) {
          System.out.print("Enter the name of the PC to mark as damaged: ");
          String name = scanner.next();
  
          for (int i = 0; i < pcs.length; i++) {
            if (pcs[i].getName().equals(name)) {
              pcs[i].markAsDamaged();
              break;
            }
          }
        } else if (choice == 5) {
          System.out.print("Enter the name of the PC to mark as not damaged: ");
          String name = scanner.next();
  
          for (int i = 0; i < pcs.length; i++) {
            if (pcs[i].getName().equals(name)) {
              pcs[i].markAsNotDamaged();
              break;
            }
          }
        } else if (choice == 6) {
          break;
        } else {
          System.out.println("Invalid choice.");
        }
      }
  
      scanner.close();
    }
  }