package fastcampus.aop.part3.chapter07

import retrofit2.Call
import retrofit2.http.GET

interface HouseService {
    @GET("/v3/e2480cb8-3027-436a-a6fa-8d9524fa4879")
    fun getHouseList(): Call<HouseDto>
}