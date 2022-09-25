public class Product {
	  public Product()
	  {
		// constructor, main kisminda new ile cagirdigimiz fonksiyon
	  }	

           //attribute/field
        int _id;
        private String _name;
        private String _description;
        private double _price;
        private int _stockAmount;
		
		//encapsulation
        public int getId()
        {
                return _id;
        }

        public  void setId(int id)
        {
                _id = id;
        }

        public String getName() {
                return _name;
        }

        public void setName(String name) {
                _name = name;
        }

        public String getDescription() {
                return _description;
        }

        public void setDescription(String description) {
                this._description = description;
        }

        public double getPrice() {
                return _price;
        }

        public void setPrice(double price) {
                _price = price;
        }

        public int getStockAmount() {
                return _stockAmount;
        }

        public void setStockAmount(int stockAmount) {
                _stockAmount = stockAmount;
        }
}
