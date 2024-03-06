package exam2;
/* 클래스 명 Order웬만하면 쓰지 말것. 코딩 에러남
 * 2. 쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
 * 주문 번호 :20180312001 
 * 주문 아이디: abd123
 * 주문 날짜 : 2018년 3월 12일
 * 주문자 이름 : 홍길순
 * 주문 상품번호 PD034
 * 배송 주소: 강서구
 */
public class PurchaseExam {

	public static void main(String[] args) {
		Purchase pur = new Purchase("20180312001", "abd123","2018년 3월 12일","홍길순","PD034","강서구");
		System.out.println(pur.toString());
	}

}
