package main;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

	public static void main(String[] args) {

		char[] board = new char[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user input : 1.X , 2.O ");
		int user = sc.nextInt();

		Random r = new Random();
		int comp = r.nextInt(2) + 1;

		layout(board);
		choice(user, comp);

	}

	static void layout(char board[]) {

		for (int i = 0; i < board.length; i++) {
			board[i] = ' ';
			System.out.println(board);
		}

	}

	static void choice(int user, int comp) {

		switch (user) {
		case 1:
			System.out.println("User selected - X ");
			break;
		case 2: 
			System.out.println("User selected - Y ");
			break;
		default :
			System.out.println("Invalid input");
			
}
	}

}
