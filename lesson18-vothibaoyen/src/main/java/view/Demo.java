package view;


import java.time.LocalDate;

import dao.Ex02Dao;
import dao.Ex04Dao;
import dao.Ex1Dao;


public class Demo {
  private static Ex1Dao ex01dao;
  private static Ex02Dao ex02dao;
  private static Ex04Dao ex04dao;
  static {
	  ex01dao=new Ex1Dao();
	  ex02dao=new Ex02Dao();
	  ex04dao=new Ex04Dao();
  }
	public static void main(String[] args) {
		ex01dao.getDate(LocalDate.of(2020, 11, 23)).forEach(System.out::print);
		//ex02dao.GetSoLuong().forEach(System.out::print);
		//ex04dao.getMhLh().forEach(System.out::print);
		
	}
}
