
public class Book {

	String name; // 4bytes
	int price; // 4bbytes
	Author author;

	public static void main(String[] args) {

		// classname pyBook = new classname();

		// book1 : reference variable : address = 4353535
		// new Book() : create an object/instance : 8 bytes : 4353535

		Book book1 = new Book();
		book1.name = "python book";
		book1.price = 200;

		Book book2 = new Book();
		book2.name = "java book";
		book2.price = 2000;

		// book1 = book2;

	}

}
