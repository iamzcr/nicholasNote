public class T04 {
    public static void main(String[] args) {
		Book book  = new Book("zcr",1500);
		book.info();
		book.updatePrice();
		book.info();
    }
}

class Book{
	String name;
	int price;

    public  Book(String name,int price){
        this.name = name;
        this.price = price;
    }

    public void updatePrice(){
    	if (this.price>150) {
    		this.price=150;
    	}else{
    		this.price=100;
    	}
    }

    public void info(){

    	System.out.println("name="+this.name+";price="+this.price);

    }
}
