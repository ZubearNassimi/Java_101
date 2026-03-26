package Assignments.Products;

public class TestProduct
{
    public static void main(String[]args)
    {
        Product myProduct = new Product("Toaster",29.95);
        System.out.println("product1: "+myProduct);

        Product myProduct2 = new Product("Microwave",124.95);
        System.out.println("product2: "+myProduct2);

        myProduct.setPrice(24.95);
        myProduct2.setPrice(119.95);

        System.out.println("product1: "+myProduct);
        System.out.println("product2: "+myProduct2);
    }
}
