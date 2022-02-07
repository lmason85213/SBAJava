package com.pnc.main;




public class MainRunner {
	
    void ETL() {
        String E = "mySQL";
        String T = "Sqoop";
        String L = "hdfs";
        System.out.println(E + T + L);
    };

    void ETL(String ETL) {
        System.out.println(ETL.toUpperCase());
    }
    void ETL(String E, String T, String L) {
        System.out.println(E + T + L);
    }
	
	static String getHello() {
		return "Hello World!";
	}
	public static void main(String[] args) {

        String E = "extraction1";
        String T = "transformation2";
        String L = "loading3";

        MainRunner obj = new MainRunner();
        obj.ETL(E + T + L);
    }
		

	}
	

