package sec2;
//jar를 프로젝트 단위로 끌어와서 사용할 수 있음. library폴더 하나 만들어서 다운로드 받은 jar파이 옮기기
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Member {
	private String id;
	private String pw;
	private int point;
	
}
