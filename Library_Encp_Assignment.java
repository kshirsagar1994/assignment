package Encapsulation;

class Library {  //encapsulated class
	//private data member 
	    private String bookId;
	    private String bookName;
	    private String bookAuthor;
	    private int bookCount;
	    
	  //public getter and setter method 
		public String getBookId() {
			return bookId;
		}
		public void setBookId(String bookId) {
			this.bookId = bookId;
		}
		public String getBookName() {
			return bookName;
		}
		public void setBookName(String bookName) {
			this.bookName = bookName;
		}
		public String getBookAuthor() {
			return bookAuthor;
		}
		public void setBookAuthor(String bookAuthor) {
			this.bookAuthor = bookAuthor;
		}
		public int getBookCount() {
			return bookCount;
		}
		public void setBookCount(int bookCount) {
			this.bookCount = bookCount;
		}	    
}

public class Library_Encp_Assignment { // class to test encapsulated class
	public static void main(String[] args) {
		Library l=new Library(); //creating object
		l.setBookId("12");
		l.setBookName("Rich Data Poor Dad");
		l.setBookAuthor("Robert Kiyosaki and Sharon Lechter");
		l.setBookCount(100);
		//getting the value through getter method
		System.out.println(l.getBookId()+" "+l.getBookName()+" "+l.getBookAuthor()+" "+l.getBookCount());
	}

}
