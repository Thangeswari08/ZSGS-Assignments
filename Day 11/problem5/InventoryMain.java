import java.util.*;
import java.io.*;

class Product implements Serializable {
    private static final long serialVersionUID = 1L;

    private int productId;
    private String name;
    private double price;
    private int quantity;

    public Product(int productId, String name, double price, int quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public void setPrice(double price) { this.price = price; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    @Override
    public String toString() {
        return "Product ID: " + productId +
               ", Name: " + name +
               ", Price: ₹" + price +
               ", Quantity: " + quantity;
    }
}

class ProductManager{

    private static final String fileName = "products.dat";

    //2) View All products 
    private List<Product> readProducts(){
        List<Product> products = new ArrayList<>();

        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))){
            products = (List<Product>) ois.readObject();

        }
        catch (FileNotFoundException e) {
            //System.out.println("File Not Found :" + e.getMessage());
        } catch (EOFException e) {
           System.out.println("EOFException :" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error reading products: " + e.getMessage());
        }
        return products;
    }

    //writing all products to file
     private void writeProducts(List<Product> products) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Error writing products: " + e.getMessage());
        }
    }

    // 1) Add product
     public void addProduct(Product product) {
        List<Product> products = readProducts();
        products.add(product);
        writeProducts(products);
        System.out.println("Product added successfully.");
    }

    //2)  Read all products
      public void viewAllProducts() {
        List<Product> products = readProducts();
        if (products.isEmpty()) {
            System.out.println("No products found.");
        } else {
            products.forEach(System.out::println);
        }
    }

    //3) Search product by ID
     public void searchProductById(int id) {
        List<Product> products = readProducts();
        for (Product p : products) {
            if (p.getProductId() == id) {
                System.out.println("Product found:\n" + p);
                return;
            }
        }
        System.out.println("Product not found.");
    }


    //4) Update product
    public void updateProduct(int id, double newPrice, int newQuantity) {
        List<Product> products = readProducts();
        boolean found = false;
        for (Product p : products) {
            if (p.getProductId() == id) {
                p.setPrice(newPrice);
                p.setQuantity(newQuantity);
                found = true;
                break;
            }
        }
        if (found) {
            writeProducts(products);
            System.out.println("Product updated successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }

    //5) Delete product
    public void deleteProduct(int id) {
        List<Product> products = readProducts();
        boolean removed = products.removeIf(p -> p.getProductId() == id);
        if (removed) {
            writeProducts(products);
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found.");
        }
    }


}
public class InventoryMain {
    public static void main(String []args){
        ProductManager manager = new ProductManager();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("\n_______Product Inventory_______");
            System.out.println("1) Add product");
            System.out.println("2. View All Products");
            System.out.println("3. Search Product by ID");
            System.out.println("4. Update Product");
            System.out.println("5. Delete Product");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = scan.nextInt();

            switch(choice){
               case 1:
                    System.out.print("Enter Product ID: ");
                    int id = scan.nextInt();
                    scan.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter Price: ");
                    double price = scan.nextDouble();
                    System.out.print("Enter Quantity: ");
                    int qty = scan.nextInt();
                    manager.addProduct(new Product(id, name, price, qty));
                    break;

                case 2:
                    manager.viewAllProducts();
                    break;

                case 3:
                    System.out.print("Enter Product ID to search: ");
                    manager.searchProductById(scan.nextInt());
                    break;

                case 4:
                    System.out.print("Enter Product ID to update: ");
                    int updateId = scan.nextInt();
                    System.out.print("Enter new Price: ");
                    double newPrice = scan.nextDouble();
                    System.out.print("Enter new Quantity: ");
                    int newQty = scan.nextInt();
                    manager.updateProduct(updateId, newPrice, newQty);
                    break;

                case 5:
                    System.out.print("Enter Product ID to delete: ");
                    manager.deleteProduct(scan.nextInt());
                    break;

                case 6:
                    System.out.println("Exiting...");
                    scan.close();
                    return;

                default:
                    System.out.println("Invalid choice.");

            }


        }
    }
}
