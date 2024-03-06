package sec1;

public class BookEx01 {
		private int bno;
		private String bname;
		private int price;
		private String author;
		private String pub;

		
		public void print(int bno) {			//int String 한개짜리 여러개 못 만듦.
			System.out.println("교재코드 : "+bno);
		}
		public void print(String bname, int price) {
			System.out.println("교재명 : "+bname+"교재코드 : "+bno+"\t\t작가이름 : "+author+"\t\t출판사 : "+pub);
			System.out.println("교재코드 : \"+bno"
			System.out.println("+author
		}
		
		public void print(String author, String pub) {
			System.out.println("작가이름 : "+author+"\t\t출판사 : "+pub);
		}	
		
		
		public int getBno() {
			return bno;
		}

		public void setBno(int bno) {
			this.bno = bno;
		}
		public String getBname() {
			return bname;
		}
		public void setBname(String bname) {
			this.bname = bname;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getPub() {
			return pub;
		}
		public void setPub(String pub) {
			this.pub = pub;
		}
		
		
		
		
}
