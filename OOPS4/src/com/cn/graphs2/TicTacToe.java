package com.cn.graphs2;

import java.util.Scanner;

public class TicTacToe {

	private Player player1,player2;
	private Board board;
	private int numPlayers;
	
	 public Player takePlayerInput(int num){
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter Player "+num+" name: ");
	        String name=sc.nextLine();
	        System.out.println("Enter Player "+num+" Symbol: ");
	        char symbol=sc.next().charAt(0);
	        Player p=new Player(name,symbol);
	        return p;
	    }
	
	 public void startGame() {
	        //Take Player Input
	        Scanner s=new Scanner(System.in);
	        player1=takePlayerInput(++numPlayers);
	        player2=takePlayerInput(++numPlayers);

	        while(player1.getSymbol()==player2.getSymbol()){
	            System.out.println("symbol already taken!! Please enter the symbol again");
	            player2.setSymbol(s.next().charAt(0));
	        }
	        //Create the board
	        board=new Board(player1.getSymbol(),player2.getSymbol());

	        //Play The Game
	        boolean player1Turn=true;
	        int status=Board.INCOMPLETE;
	        while(player1.getSymbol()==player2.getSymbol()){
	            if(player1Turn){
	                    System.out.println("Player 1 - "+player1.getName()+"'s turn");
	                System.out.println("Enter x: ");
	                   int x=s.nextInt();
	                System.out.println("Enter y: ");
	                int y=s.nextInt();
	                 status= board.move(player1.getSymbol(),x,y);
	                if(status==Board.INVALIDMOVE){
	                    System.out.println("Invalid Move! Please Try Again");
	                    continue;
	                }
	            }
	            else
	            {
	                System.out.println("Player 2 - "+player2.getName()+"'s turn");
	                System.out.println("Enter x: ");
	                int x=s.nextInt();
	                System.out.println("Enter y: ");
	                int y=s.nextInt();
	                status= board.move(player2.getSymbol(),x,y);

	                if(status==Board.INVALIDMOVE)
	                {
	                    System.out.println("Invalid Move! Please Try Again");
	                    continue;
	                }
	            }
	            player1Turn=!player1Turn;
	            board.print();
	        }
	        if(status==Board.PLAYER1WINS){
	            System.out.println("Player 1 - "+player1.getName()+" wins !!");
	        } else if (status==Board.PLAYER2WINS) {
	            System.out.println("Player 2 - "+player2.getName()+" wins !!");
	        }
	        else {
	            System.out.println("Draw!!");
	        }
	    }
	
	public static void main(String[] args) {
		TicTacToe t=new TicTacToe();
		t.startGame();
	}
}
