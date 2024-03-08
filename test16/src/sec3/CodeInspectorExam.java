package sec3;
//PMD: 코드 인스펙션 도구 => 소스 코드 검증하여 성능개선, 코드 작성 규칙 준수, 에러 발생 가능성 최소화하기 위한 소스 코드 검증 작업

//Code Inspectkon Level(교과서에 안나옴)
//name		Symbol		Level		Comment
//Blocker	빨간색		High		필수, 에러 발생가능성이 매우 높거나 메모리 누구가 발생되는 코드
//Critical	시안			Medium High 권고 상, 에로 발생 가능성이 높거나 일반적으로 수정되어야 하는 코드
//Urgent	초록			Medium		(Major) 권고 상, 에러발생이 있거나 수정을 권고하는 중요 위
//Important 마젠타(자주)	Medium Low	(Mino) 소스코드의 가독성, 유지 보수성 항상을 위해 수정을 권함
//Warning	파랑			Low			(Info) 정보성으로 제공되는 위반 사항으로 개발자가 참고하여

public class CodeInspectorExam {

	public static void main(String[] args) {
		Reader r1 = new Reader();
		Reader r2 = new Reader(2,"http://www.naver.com", "네이버 사이트",1);
		r1.def = "시작페이지";
		//System.out.println(r2.toString());
		//System.out.println(r2.def);	/최종배포본은 각주 모두 삭제해야 함

	}

}
