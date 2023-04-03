import java.util.*;
public class Product {
    private int productNumber;
    private String name;
    private double price;
    private int amountInStock;

    public Product(int productNumber, String name, double price, int amountInStock) {
        this.productNumber = productNumber;
        this.name = name;
        this.price = price;
        this.amountInStock = amountInStock;
    }

    public int getProductNumber() {
        return productNumber;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmountInStock() {
        return amountInStock;
    }

    public void setAmountInStock(int amountInStock) {
        this.amountInStock = amountInStock;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPrice(double price){
        this.price = price;
    }
    public static void main(String args[]) throws Exception {
        Scanner input = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1, "doll", 10.0, 5));
        products.add(new Product(2, "teddy bear", 20.0, 10));
        int choice;
        do {
            System.out.println("1. List all products in shop with product number, name, price, and amount in stock");
            System.out.println("2. Add new product to the list");
            System.out.println("3. Remove product from list by index");
            System.out.println("4. Update product in list");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("\n");
                    if(products.isEmpty()){
                        System.out.println("There is no products in stock!");
                    }else{
                        for (int i = 0; i < products.size(); i++) {
                            System.out.println("ID:"+(products.get(i).getProductNumber()) + "\t" + products.get(i).getName() + "\t" + products.get(i).getPrice() + "\t" + products.get(i).getAmountInStock());
                        }
                        System.out.println("\n");
                    }
                    break;

                case 2:
                    System.out.print("Enter the product number: ");
                    int productNumber = input.nextInt();
                    input.nextLine();
                    System.out.print("Enter the name: ");
                    String name = input.nextLine();
                    System.out.print("Enter the price: ");
                    double price = input.nextDouble();
                    System.out.print("Enter the amount in stock: ");
                    int amountInStock = input.nextInt();
                    products.add(new Product(productNumber, name, price, amountInStock));
                    break;
                case 3:
                    int index;
                    if(products.isEmpty()){
                        System.out.println("There is no products in stock!");
                    }else{
                        System.out.print("Enter the ID of the product to remove: \n");
                        System.out.println("\n");
                       
                        int i;
                        for (i = 0; i < products.size(); i++) {
                            System.out.println("ID:"+(products.get(i).getProductNumber()-1) + "\t" + products.get(i).getName() + "\t" + "$"+products.get(i).getPrice() + "\t" + products.get(i).getAmountInStock());
                        }
                        System.out.println("\n");
                    
                        index = input.nextInt();
                        products.remove(index);

                        System.out.print("\nCurrent Stock: \n");

                        if(products.isEmpty()){
                            System.out.println("There is no products in stock!");
                        }else{

                            System.out.println("\n");
                            for (i = 0; i < products.size(); i++) {
                                System.out.println((products.get(i).getProductNumber()-1) + "\t" + products.get(i).getName() + "\t" + "$"+products.get(i).getPrice() + "\t" + products.get(i).getAmountInStock());
                            }
                            System.out.println("\n");

                        }
                    }  
                    break;
                case 4:
                    if(products.isEmpty()){
                        System.out.println("There is no products in stock!");
                    }else{
                        System.out.print("Enter the index of the product to update: ");
                        index = input.nextInt();
                        input.nextLine();
                        System.out.print("Enter the new name (or press enter to skip): ");
                        String newName = input.nextLine();
                        if (!newName.equals("")) {
                            products.get(index).setName(newName);
                        }
                        System.out.print("Enter the new price (or press enter to skip): ");
                        String newPriceString = input.nextLine();
                        if (!newPriceString.equals("")) {
                            double newPrice = Double.parseDouble(newPriceString);
                            products.get(index).setPrice(newPrice);
                        }
                        System.out.print("Enter the new amount in stock (or press enter to skip): ");
                        String newAmountInStockString = input.nextLine();
                        if (!newAmountInStockString.equals("")) {
                            int newAmountInStock = Integer.parseInt(newAmountInStockString);
                            products.get(index).setAmountInStock(newAmountInStock);
                        }
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);
    }
}