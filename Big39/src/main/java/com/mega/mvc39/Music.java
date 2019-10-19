package com.mega.mvc39;

import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Music {

	public static void main(String[] args) throws Exception {

		Document doc = Jsoup.connect("https://music.naver.com/listen/top100.nhn?domain=DOMESTIC_V2").get();
		Document doc2 = Jsoup.connect("https://music.naver.com/listen/top100.nhn?domain=DOMESTIC_V2&page=2").get();
		
		// System.out.println(doc);
		
		Elements elistThumb = doc.select(".name>a.thumb>img");
		Elements elistName = doc.select("a._title>span.ellipsis");
		Elements elistArtist = doc.select("._artist>a");
		Elements elistThumb2 = doc.select(".name>a.thumb>img");
		Elements elistName2 = doc.select("a._title>span.ellipsis");
		Elements elistArtist2 = doc.select("._artist>a");
		
		for (int i=0; i<elistArtist.size(); i++) {
			System.out.println(elistThumb.get(i).attr("src") + " / " + elistName.get(i).text() + " / " + elistArtist.get(i).text());
		}
		for (int i=0; i<elistArtist2.size(); i++) {
			System.out.println(elistThumb2.get(i).attr("src") + " / " + elistName2.get(i).text() + " / " + elistArtist2.get(i).text());
		}
		
	}

}
