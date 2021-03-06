package com.mp5a5.www.httprequest.net.api;

import android.util.ArrayMap;
import com.mp5a5.www.httprequest.net.entity.NBAEntity;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * @author ：mp5a5 on 2019/1/16 10：08
 * @describe
 * @email：wwb199055@126.com
 */
public interface NBAApiT {

    @GET("onebox/basketball/nba")
    Observable<NBAEntity> getNBAInfo(@QueryMap ArrayMap<String, Object> map);
}
