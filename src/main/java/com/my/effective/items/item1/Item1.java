package com.my.effective.items.item1;

import java.util.EnumSet;

public class Item1 {

	   String name;
	   String address;
	   private static final Item1 GOOD_NIGHT = new Item1();
	   private static final Enum BLUE = null;
	   private static final Enum WHITE = null;

	   public Item1() {
	   }

	   public Item1(String name) {
	      this.name = name;
	   }

	   public static Item1 withName(String name) {
	      return new Item1(name);
	   }

	   public static Item1 withAddress(String address) {
	      Item1 item1 = new Item1();
	      item1.address = address;
	      return item1;
	   }

	   public static Item1 getItem() {
	      return GOOD_NIGHT;
	   }

	   public static Item1 getItem1(boolean flag) {
	      return flag ? new Item1() : new BarItem1();
	   }

	   public static void main(String[] args) {
	      //정적 팩토리 메서드
	      Item1 item0 = Item1.withAddress("pungmudong");
	      //생성자
	      Item1 item1 = new Item1("minwook");
	      //정적 팩토리 메서드
	      Item1 item2 = Item1.withName("minwook");
	      //정적 팩토리 메서드
	      Item1 item3 = Item1.getItem();
	      //정적 팩토리 메서드
	      Item1 item4 = Item1.getItem1(false);
	      //정적 팩토리 메서드 장점
	      //메서드 이름을 정해줄 수 있고 그 안의 로직을 작성할 수 있다.
	      //객체는 하나만 생성하므로 메모리 관리에 좋다.
	      
	      EnumSet<Color> colors = EnumSet.allOf(Color.class);
	      EnumSet<Color> blueAndWhite = EnumSet.of(BLUE, WHITE);

	   }

	   static class BarItem1 extends Item1 {

	   }

	   enum Color {
	      RED, BLUE, WHITE
	   }
	}
