//package Business.WorkQueue;
//
//import java.util.ArrayList;
//
//public class WorkQueue {
//
//    private ArrayList<WorkRequest> workRequestList;
//
//    public WorkQueue() {
//        workRequestList = new ArrayList<>();
//    }
//
//    // Getter for WorkRequest List
//    public ArrayList<WorkRequest> getWorkRequestList() {
//        return workRequestList;
//    }
//
//    // Add a new work request to the queue
//    public void addWorkRequest(WorkRequest request) {
//        workRequestList.add(request);
//    }
//
//    // Remove a work request from the queue
//    public void removeWorkRequest(WorkRequest request) {
//        workRequestList.remove(request);
//    }
//}
////

package Business.WorkQueue;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class WorkQueue {

    private ArrayList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new ArrayList<>();
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }

    public void addWorkRequest(WorkRequest request) {
        workRequestList.add(request);
    }

    public void removeWorkRequest(WorkRequest request) {
        workRequestList.remove(request);
    }

    // Filter work requests by type
    public <T extends WorkRequest> ArrayList<T> getRequestsByType(Class<T> type) {
        return workRequestList.stream()
                .filter(type::isInstance)
                .map(type::cast)
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Filter pending requests
    public ArrayList<WorkRequest> getPendingRequests() {
        return workRequestList.stream()
                .filter(request -> "Pending".equalsIgnoreCase(request.getStatus()))
                .collect(Collectors.toCollection(ArrayList::new));
    }

    // Filter cross-enterprise requests
    public ArrayList<CrossEnterpriseRequest> getCrossEnterpriseRequests() {
        return getRequestsByType(CrossEnterpriseRequest.class);
    }

    // Filter cross-organization requests
    public ArrayList<WorkRequest> getCrossOrganizationRequests() {
        // Assume a method in WorkRequest can define cross-organization logic
        return workRequestList.stream()
                .filter(request -> request instanceof CrossEnterpriseRequest) // Extend logic if needed
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
