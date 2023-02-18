package Buoi2;

import java.util.Scanner;

public class Point {
	private int x,y;
	public Point() {
		this.x = 0;
		this.y = 1;
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void read() {
		Scanner sc = new Scanner(System.in);
		x=sc.nextInt();
		y=sc.nextInt();
	}
	public void print() {
		System.out.println("("+this.x +", " + this.y +")");
	}
	public void move(int dx,int dy) {
		x=x+dx;
		y=y+dy;
	}
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	public double distance() {
		double c=(double)Math.sqrt((Math.pow(this.x, 2))+(Math.pow(this.y, 2)));
		return c;
		
	}
	public double distance(Point d) {
		double e=(double)Math.sqrt(Math.pow((this.x-d.x), 2)+Math.pow((this.y-d.y), 2));
		return e;
	}
	
	
}