package exam2;
/*1. 다음 예제의 클래스를 만들고, 결과 값을 출력해 봅시다.
나이가 40살, 이름인 James라는 남자가 있습니다. 이 남자는 결혼을 했고, 자식이 셋 있습니다.
<출력결과>
이 사람의 나이: 40
이 사람의 이름 : James
이 사람의 결혼 여부 :
이 사람의 자녀 수 :3*/
public class PersonEaxam {

	public static void main(String[] args) {
		//Person p = new Person("James", 40, 1, true, 3); 
		//40살 남성 결혼 자식셋
		Person p = new Person();
		p.setName(null);
		p.setAge(40)
		p.setGender(1)
		p.setMarried(true);
		p.setChildAmount(3);
		p.print();
	}

}
