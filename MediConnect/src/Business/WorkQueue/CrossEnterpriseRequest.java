package Business.WorkQueue;

import Business.Enterprise.Enterprise;

public class CrossEnterpriseRequest extends WorkRequest {

    private Enterprise sourceEnterprise;
    private Enterprise targetEnterprise;
    private String details;

    public Enterprise getSourceEnterprise() {
        return sourceEnterprise;
    }

    public void setSourceEnterprise(Enterprise sourceEnterprise) {
        this.sourceEnterprise = sourceEnterprise;
    }

    public Enterprise getTargetEnterprise() {
        return targetEnterprise;
    }

    public void setTargetEnterprise(Enterprise targetEnterprise) {
        this.targetEnterprise = targetEnterprise;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
