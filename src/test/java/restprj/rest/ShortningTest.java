package restprj.rest;

import java.net.MalformedURLException;

import org.junit.Test;

import junit.framework.TestCase;

public class ShortningTest extends TestCase {
	Shortning shortning = new Shortning();
	@Test
	public void test() throws MalformedURLException
	{
		String shortedUrl = shortning.createShortUrl("https://www.youtube.com/results?search_query=mozart+the+best");
		shortning.generateoriginal(shortedUrl);
		
	}
	
}
