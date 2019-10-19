package com.mega.mvc39;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JsoupConsole {

	public static void main(String[] args) throws Exception {

		Document doc = Jsoup.connect("http://www.naver.com").get();
		// System.out.println(doc);
		Elements elist = doc.select("span.an_txt");
		System.out.println(elist);
		for (Element element : elist) {
			System.out.println(element.text());
		}
		
	}

}
