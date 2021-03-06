package com.mp5a5.www.httprequest.net.api

import android.util.ArrayMap
import com.mp5a5.www.httprequest.net.entity.NBAEntity
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.QueryMap

/**
 * @describe
 * @author ：mp5a5 on 2018/12/28 19：49
 * @email：wwb199055@126.com
 */
interface NBAApi {

    @GET("onebox/basketball/nba")
    fun getNBAInfo(@QueryMap map: ArrayMap<String, @JvmSuppressWildcards Any>): Observable<NBAEntity>
}