package in.calibrage.a3fharvesting.adapter;

import in.calibrage.a3fharvesting.Model.RequestCompleteModel;
import in.calibrage.a3fharvesting.Model.SyncLabourResponse;
import in.calibrage.a3fharvesting.sync.SyncRequestHeaderResponse;

public interface NotificationListner {
    void onNotificationClick(int po, RequestCompleteModel requestCompleteModel);
}
