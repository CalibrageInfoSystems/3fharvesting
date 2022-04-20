package in.calibrage.a3fharvesting.service;

import com.google.gson.JsonObject;


import in.calibrage.a3fharvesting.Model.CloseLabourResponse;
import in.calibrage.a3fharvesting.Model.GetCostConfigResponse;
import in.calibrage.a3fharvesting.Model.GetCountResponse;
import in.calibrage.a3fharvesting.Model.GetMasters;
import in.calibrage.a3fharvesting.Model.GetUserOTPResponse;
import in.calibrage.a3fharvesting.Model.LabourLeaderLoginResponse;
import in.calibrage.a3fharvesting.Model.Labourloginresponse;

import in.calibrage.a3fharvesting.Model.SyncFarmerDetailsResponse;
import in.calibrage.a3fharvesting.Model.SyncGetMastersResponse;
import in.calibrage.a3fharvesting.Model.SyncLabourLeaderDetailsResponse;
import in.calibrage.a3fharvesting.Model.SyncLabourResponse;

import in.calibrage.a3fharvesting.Model.SyncLabourServicesResponse;
import in.calibrage.a3fharvesting.sync.SyncRequestHeaderResponse;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Url;
import rx.Observable;

public interface ApiService {

    @POST(APIConstantURL.Login)
    Observable<Labourloginresponse> getLoginPage(@Body JsonObject data);



    @POST(APIConstantURL.SyncRequestHeaders)
    Observable<SyncRequestHeaderResponse> getSyncRequestHeaders(@Body JsonObject data);

    @POST(APIConstantURL.GetCount)
    Observable<GetCountResponse> getCountPage(@Body JsonObject data);

    @POST(APIConstantURL.post_syncLabourRequests)
    Observable<SyncLabourResponse> getSyncLabourRequestPage(@Body JsonObject data);

    @POST(APIConstantURL.post_closeLabourRequest)
    Observable<CloseLabourResponse> closeLabourResponsePage(@Body JsonObject data);

    @POST(APIConstantURL.post_syncLabourServices)
    Observable<SyncLabourServicesResponse> getsyncLabourServicesResponsePage(@Body JsonObject data);

    @POST(APIConstantURL.post_syncFarmerDetais)
    Observable<SyncFarmerDetailsResponse> getsyncFarmerDetailsResponsePage(@Body JsonObject data);

    @POST(APIConstantURL.post_labourLeaderLogin)
    Observable<LabourLeaderLoginResponse> getLabourLeaderResponsePage(@Body JsonObject data);

    @POST(APIConstantURL.post_syncLabourLeaderDetails)
    Observable<SyncLabourLeaderDetailsResponse> getLabourLeaderDetailsResponsePage(@Body JsonObject data);

    @GET
    Observable<GetCostConfigResponse> getCostConfigResponsePage(@Url String url);

    @GET
    Observable<GetUserOTPResponse> getUserOTPResponsePage(@Url String url);

    @GET
    Observable<SyncGetMastersResponse> getSyncGetMastersResponsePage(@Url String url);
    @GET
    Observable<GetMasters> getmasterdata(@Url String url);

//    @GET
//    Observable<LerningsModel> getlernings(@Url String url);
//
//

}
