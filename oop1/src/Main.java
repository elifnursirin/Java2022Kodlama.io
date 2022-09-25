public class Main
{
    public static void main(String[] args)
    {
        Product product = new Product();
        product.setName("Delonghi Kahve Makines");
        product.setDiscount(7);
        product.setImageUrl("hdhd.jpg");
        product.setUnitPrice(7500);
        product.setUnitsInStock(3);

        Product product1 = new Product();
        product1.setName("Delonghi Kahve Makines");
        product1.setDiscount(7);
        product1.setImageUrl("hdhd.jpg");
        product1.setUnitPrice(7500);
        product1.setUnitsInStock(3);

        Product product2 = new Product();
        product2.setName("Delonghi Kahve Makines");
        product2.setDiscount(7);
        product2.setImageUrl("hdhd.jpg");
        product2.setUnitPrice(7500);
        product2.setUnitsInStock(3);

        Product[] products = {product,product1,product2};

        for (Product productt : products)
        {
            System.out.println(productt.getName());
        }

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("0534267836");
        individualCustomer.setFirstName("Elifnur");
        individualCustomer.setLastName("Şirin");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setCustomerNumber("534532");
        corporateCustomer.setCompanyName("Şirin's");
        corporateCustomer.setTaxNumber("423636");
        corporateCustomer.setPhone("534353453");
        corporateCustomer.setId(2);

        Customer[] customers = {individualCustomer,corporateCustomer};

    }
}
