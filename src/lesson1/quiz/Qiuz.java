package lesson1.quiz;

import java.util.Scanner;

import lesson1.quiz.Question;

public class Qiuz {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Question q = new Question();
		q.ask();
		int index = scan.nextInt();
		if (q.getAnswerCount() < index)
		{
			System.out.println("Нет варианта");
		}
		else
		{
			if ( q.answer(index) == true)
			{
				System.out.println("Правильно");
				System.out.println("Пoздравляем");
			}
			else
			{
				System.out.println("Ошибка");
			}
		}
		scan.close();
	}

}
