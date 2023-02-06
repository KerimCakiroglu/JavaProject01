package com.neotech.package04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Homework32 {

	public static void main(String[] args) throws IOException {

		String filePath = "homework32.properties";
		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		prop.setProperty("browser", "Chrome");
		prop.setProperty("url", "www.google.com");
		prop.setProperty("username", "Kerim");
		prop.setProperty("password", "1234");

		FileOutputStream fos = new FileOutputStream(filePath);

		prop.store(fos, "we updated information");

	}

}
