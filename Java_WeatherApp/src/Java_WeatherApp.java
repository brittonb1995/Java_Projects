import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;


public class Java_WeatherApp {

	public static void main(String[] args) throws IOException {
		
		String url = "https://weather.com/weather/today/l/USTX0461:1:US";
		
		WeatherWindow window = new WeatherWindow();
		
		Document doc = Jsoup.connect(url).get();
		final String location = doc.getElementsByClass("today_nowcard-location").text();
		final String temp = doc.getElementsByClass("today_nowcard-temp").text();
		final String time = doc.getElementsByClass("today_nowcard-timestamp").text();
		final String condition = doc.getElementsByClass("today_nowcard-phrase").text();

		window.IncludeLabels(location,temp,time,condition);
		
	}

}
