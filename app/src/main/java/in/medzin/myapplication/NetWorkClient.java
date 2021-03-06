package in.medzin.myapplication;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by root on 24/4/16.
 */
public class NetWorkClient {
    private final String  API_KEY = "9htuhtcb4ymusd73d4z6jxcj";
    private final String API_BASE_URL = "http://api.rottentomatoes.com/api/public/v1.0/";
    private AsyncHttpClient client;

    public NetWorkClient()
    {
        this.client = new AsyncHttpClient();
    }

    private String getApiUrl(String relativeUrl) {
        return API_BASE_URL + relativeUrl;
    }

    public void getBoxOfficeMovies(JsonHttpResponseHandler handler)
    {
        String url = getApiUrl("lists/movies/box_office.json");
        RequestParams params = new RequestParams("apikey",API_KEY);
        client.get(url,params,handler);
    }


}
