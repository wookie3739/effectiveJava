package com.my.effective.items.item2;

public class NutritionFacts {

	private int servingSize;
	private int sodium;
	private int carbohydrate;
	private int servings;
	
	public NutritionFacts() {}
	//1. 필드가 많을 경우 생성자를 통해 호출할 때 어떠한 값을 매개변수로 가지고있는지 알기 힘들다.
//	public NutritionFacts(int servingSize, int sodium, int carbohydrate, int servings) {
//		this.servingSize = servingSize;
//		this.sodium = sodium;
//		this.carbohydrate = carbohydrate;
//		this.servings = servings;
//	}
	
	//1번의 대안으로 세터를 사용하는 방법이 있다. 어떤 것을 넣어야할지 메서드를 통해 알 수 있지만
	//여러 번의 호출을 거쳐야하기 떄문에 안정적이지 않은 상태로 사용될 여지가 있다.
	//또한 세터가 필요하기 때문에 불변 클래스로 만들지 못한다는 단점이 있다.
	
	//그래서 빌드를 쓰자.
	
	public static void main(String[] args) {
		//1. 1, 6, 10, 20이 무엇을 뜻하는지 잘 모름.
//		NutritionFacts nutritionFacts = new NutritionFacts(1, 6, 10, 20);
	}
}
