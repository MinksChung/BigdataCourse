package com.mega.mvc39;

import java.io.IOException;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MusicController {

	@Autowired
	MusicDAO musicDAO;
	
	@RequestMapping("musicSearch")
	public void musicSearch() {
		
	}
	
	@RequestMapping("musicInsert")
	public void musicInsert(MusicDTO musicDTO) {
		musicDAO.insert(musicDTO);
	}
	
	@RequestMapping("rank")
	public void rank(MusicDTO musicDTO) throws Exception {
		Document doc = Jsoup.connect("https://music.naver.com/listen/top100.nhn?domain=DOMESTIC_V2").get();
		Document doc2 = Jsoup.connect("https://music.naver.com/listen/top100.nhn?domain=DOMESTIC_V2&page=2").get();
		
		Elements elistThumb = doc.select(".name>a.thumb>img");
		Elements elistName = doc.select("a._title>span.ellipsis");
		Elements elistArtist = doc.select("._artist>a");
		Elements elistThumb2 = doc.select(".name>a.thumb>img");
		Elements elistName2 = doc.select("a._title>span.ellipsis");
		Elements elistArtist2 = doc.select("._artist>a");
		
		for (int i=0; i<elistArtist.size(); i++) {
			musicDTO.setImg(elistThumb.get(i).attr("src"));
			musicDTO.setTitle(elistName.get(i).text());
			musicDTO.setSinger(elistArtist.get(i).text());
			musicDAO.insert(musicDTO);
		}
		for (int i=0; i<elistArtist2.size(); i++) {
			musicDTO.setImg(elistThumb2.get(i).attr("src"));
			musicDTO.setTitle(elistName2.get(i).text());
			musicDTO.setSinger(elistArtist2.get(i).text());
			musicDAO.insert(musicDTO);
		}
		
	}
	
	@RequestMapping("musicList")
	public void musicList(Model model) {
		List<MusicDTO> list =  musicDAO.selectAll();
		model.addAttribute("list",list);
	}
	
}
