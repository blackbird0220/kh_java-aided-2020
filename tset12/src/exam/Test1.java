package exam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<IPInfo> ipInfoList = new ArrayList<IPInfo>();
		//List는 인터페이스이기 때문에 객체를 생성할 수 없다. ArrayList가 들어가야 하지만
		//null로 대입하였으므로 ipInfolist에 요소를 추가하는 
		ipInfoList.add(new IPInfo("123.123.123.123", "홍길동"));
		ipInfoList.add(new IPInfo("212.133.7.8","고길동" ));
		//생성자함수 오류, 아이피 주소와 이름을 모두 입력받아야 하는데  
		//IPInfo 클래스의 생성자에는 매개변수 하나만 전달 받는 생성자는 없으므로 객체생성 불가능
		ipInfoList.add(new IPInfo("177.223.111.222", "고길순"));

		System.out.println("ip 입력 :");
		String ip = sc.next();
		
		for(int i=0;i<ipInfoList.size();i++) {
			if(ipInfoList.get(i).getIp().equals(ip)) {	//ipInfoList.get(i)는 특정번째의 IPInfo클래스의 객체이고, ip는 String 변수 이므로
				//ipInfoList.get(i)==ip
				System.out.println(ipInfoList.get(i));
				break;
			}/* else {

				System.out.println("일치하는 ip사용자가 없습니다."); 으로 변경해야 함*/
			}
		}
	}

