package sec2;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;


class User {
	private String name;
	private int age;

	
	public User() {}
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
public class JacksonExam {

	public static void main(String[] args) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		
		User user = new User("김응원",36);
		try{
			//객체를 json파일로 변환
			mapper.writeValue(new File("member.json"), user); 
			//객체를 json타입의 String으로 변환
			String jsonUser = mapper.writeValueAsString(user); 
			//객체를 Json 타입을 정렬하여 String으로 바꿈
			System.out.println(jsonUser);
			//"User:{'name':'kew','age':36}"
		} catch (JsonGenerationException e) {
			System.out.println("Json 변환실패");
		}
	}
}
