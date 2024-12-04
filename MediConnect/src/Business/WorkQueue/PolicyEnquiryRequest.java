package Business.WorkQueue;

public class PolicyEnquiryRequest extends WorkRequest {

    private String enquiryDetails;
    private String response;

    public String getEnquiryDetails() {
        return enquiryDetails;
    }

    public void setEnquiryDetails(String enquiryDetails) {
        this.enquiryDetails = enquiryDetails;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
