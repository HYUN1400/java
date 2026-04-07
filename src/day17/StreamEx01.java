package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;

public class StreamEx01 {

	public static void main(String[] args) {
		// class 생성 Student(이름, 점수) 
		
		// Student List 생성 객체 추가(10명)
		// 출력 => forEach()
		
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("C학생", (int)(Math.random()*60)+40));
		list.add(new Student("J학생", (int)(Math.random()*60)+40));
		list.add(new Student("E학생", (int)(Math.random()*60)+40));
		list.add(new Student("B학생", (int)(Math.random()*60)+40));
		list.add(new Student("F학생", (int)(Math.random()*60)+40));
		list.add(new Student("I학생", (int)(Math.random()*60)+40));
		list.add(new Student("A학생", (int)(Math.random()*60)+40));
		list.add(new Student("G학생", (int)(Math.random()*60)+40));
		list.add(new Student("H학생", (int)(Math.random()*60)+40));
		list.add(new Student("D학생", (int)(Math.random()*60)+40));
		
//		list.stream().forEach(n -> System.out.println(n));
		
		list.stream().forEach(n -> {
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name + "의 점수는 " + score + "점 입니다.");
		});
		
		System.out.println();
		
		// 점수 합계
		int sum = list.stream().mapToInt(n -> n.getScore()).sum();
		OptionalDouble avg = list.stream().mapToInt(n -> n.getScore()).average();
		System.out.println("•─────────⋅☾ 점수 합계 ☽⋅─────────•");
		System.out.println(sum + "점 / 평균 " + avg.getAsDouble() + "점");
				
		System.out.println("•─────────⋅☾ 전체 인원 수 ☽⋅─────────•");
		// 전체 인원수
		long count = list.stream().count();
		System.out.println(count + "명");
		
		System.out.println("•─────────⋅☾ 점수 80점 이상 ☽⋅─────────•");
		// 점수가 80점 이상인 학생의 인원수
		long count2 = list.stream().map(n -> n.getScore()).filter(n -> n >= 80).count();
		System.out.println(count2 + "명");
		
		System.out.println("•─────────⋅☾ 이름순 ☽⋅─────────•");
		// 이름순으로 정렬
//		list.stream().map(n -> n.getName()).sorted().forEach(n -> System.out.println(n));
		list.stream().sorted(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}			
		}).forEach(n -> System.out.println(n));
		
		System.out.println("•─────────⋅☾ 점수 높은 순 ☽⋅─────────•");
		// 점수가 높은순으로 정렬
		list.sort(new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {
				return o2.getScore() - o1.getScore();
			}
			
		});
		
		for(Student tmp : list) {
			System.out.println(tmp);
		}
		
		
		
		
		// MAIN END
		
	}
}


class Student{
	private String name;
	private int score;
	
	public Student() {
		
	}
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	
	@Override
	public String toString() {
		return name + ": " + score;
	}
	
	
	
}
