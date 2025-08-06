package Coding;

public class Studentgradecalculator {

	public static void main(String[] args) {
	int marks=39;
	if (marks<0 ||marks>100)
	{
		System.out.println("invalid mark ,enter digits between 0-100");	
	}
	
	else if (marks>=81&&marks<=100)
	{
		System.out.println("Student got A grade");
	}
	else if (marks<=80&&marks>=71)
	{
		System.out.println("Student got B grade");
	}
	else if (marks<=70&&marks>=61)
	{
		System.out.println("Student got C grade");
	}
	else if (marks<=60&&marks>=40)
	{
		System.out.println("Student got D grade");

	}
	else
	{
		System.out.println("Student got FAILED");
	}}}

