package com.note.countingNotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingNotes {
	public static void main(String[] args) throws NumberFormatException, IOException {
		//input from the console
		BufferedReader breader=new BufferedReader(new InputStreamReader(System.in));
	
		//counting Notes
		int totalNotes[]= {2000,1000,500,200,100,50,20,10,5,2,1};
		
		// Pass the Required amount
		System.out.print("Enter Required Amount : ");
		int amount= Integer.parseInt(breader.readLine());
		
		int copyOfAmount = amount;
		int note= 0, count = 0;
		
		//checking amount by each note matchings
		for(int i=0 ; i<11 ; i++) {
			count=amount/totalNotes[i];
			if(count != 0 ) {
				System.out.println(totalNotes[i]+"\tx\t"+count+"\t= "+totalNotes[i]*count);
			}
			//Here we counting the total notes and amount
			note = note+count;
			amount = amount%totalNotes[i];
			
		}
		System.out.println("Total Amount : "+copyOfAmount);
		System.out.println("Total Number Of Notes  : "+note);
		
		
	}

}
