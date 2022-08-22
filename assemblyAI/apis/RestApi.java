import java.net.http.HttpRequest;

public class RestApi {
    public static void main(String[] args) throws Exception{

        Transcript transcript =  new Transcript();
        transcript.setAudio_url("https://github.com/nskwon/workPrep/raw/main/Frank%20is%20an%20Awful%20Brawler.m4a");
        Gson gson = new Gson();
        
        HttpRequest postRequest = HttpRequest.newBuilder()
        .uri(new URI("https://api.assemblyai.com/v2/transcript"))
        .header("Authorization", Constants.API_Key)
        .POST(BodyPublisher)

    }
}