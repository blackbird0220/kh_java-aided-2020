package exam2;

public class Purchase {
	private String no;	//주문번호
	private String id;	//주문자 아이디
	private String date;	// 주문 날짜
	private String name;	// 주문자 이름
	private String pno;	 	// 주문상품번호
	private String addr;
	public Purchase(String no, String id, String date, String name, String pno, String addr) {
		
		this.no = no;
		this.id = id;
		this.date = date;
		this.name = name;
		this.pno = pno;
		this.addr = addr;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPno() {
		return pno;
	}
	public void setPno(String pno) {
		this.pno = pno;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String toString() {
		return "Purchase [주문번호:" + no + ",\n 주문자 아이디: " + id + "\n 주문날짜: " + date + "\n 주문자 이름: " + name + "\n 주문상품번호: " + pno + "\n 배송지: "
				+ addr + "]";
	}
	
	
}
