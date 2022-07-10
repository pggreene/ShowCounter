package webScraper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class WebScraper {
	
	public static void main(String[] args) throws IOException {
		
		Scanner input = new Scanner(System.in);
		URL Tvmaze = new URL("https://www.tvmaze.com/api");
		URLConnection tv  = Tvmaze.openConnection();
		BufferedReader in = new BufferedReader(
								new InputStreamReader(
								tv.getInputStream()));
		String inputLine;
		while((inputLine = in.readLine()) != null)
			System.out.println(inputLine);
		in.close();
		
	}
}
