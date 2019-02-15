package sample.nytimes.service;

import retrofit2.Call;
import retrofit2.http.GET;
import sample.nytimes.model.NewsResponseModel;


public interface NewsProvider {

    @GET("/svc/mostpopular/v2/mostviewed/all-sections/"+ NewsService.PERIOD +".json?api-key=" + NewsService.API_KEY)
    Call<NewsResponseModel> mostPopular();

}