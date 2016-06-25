package restprj.rest;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Random;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/Url")
public class Shortning {
	
	
	static HashMap<String, String> hmap = new HashMap<String, String>();
	    @POST
	    @Path("/Shortning")
	    @Consumes(MediaType.TEXT_PLAIN)
	    @Produces(MediaType.TEXT_PLAIN)
	    public String createShortUrl(String inputUrl)
	    {
	    	String outputUrl = generateRandomChars(4);
			while (hmap.equals(outputUrl))			
				{
					outputUrl = generateRandomChars(4);
				}
			hmap.put(outputUrl, inputUrl);
			String result = "http://www.Shortning.com/"+ outputUrl;	
			System.out.println(result);
	    	
	    return(result);
	    }
	    public static String generateRandomChars(int length) {
			 String 	candidateChars= "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			    StringBuilder sb = new StringBuilder();
			    Random random = new Random();	    
			    for (int i = 0; i < length; i++) {
			        sb.append(candidateChars.charAt(random.nextInt(candidateChars
			                .length())));
			    }
			    return sb.toString();
			}
	    
	    @POST
	    @Path("/Original")
	    @Consumes(MediaType.TEXT_PLAIN)
	    @Produces(MediaType.TEXT_PLAIN)
	    public String generateoriginal(String shortUrl) throws MalformedURLException
	    {
	    		URL url = new URL(shortUrl);
	    		String key = url.getPath().replaceFirst("/", "");
	    		System.out.println(hmap.get(key));
	    		return(hmap.get(key));
	    }
}