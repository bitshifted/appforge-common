package co.bitshifted.ignite.common.dto;

import co.bitshifted.ignite.common.model.DeploymentStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class DeploymentStatusDTO {

    private DeploymentStatus status;
    private RequiredResourcesDTO requiredResources;

    public DeploymentStatusDTO() {

    }

    public DeploymentStatusDTO(DeploymentStatus status, RequiredResourcesDTO requiredResources) {
        this.status = status;
        this.requiredResources = requiredResources;
    }

    public DeploymentStatus getStatus() {
        return status;
    }

    public void setStatus(DeploymentStatus status) {
        this.status = status;
    }

    public RequiredResourcesDTO getRequiredResources() {
        return requiredResources;
    }

    public void setRequiredResources(RequiredResourcesDTO requiredResources) {
        this.requiredResources = requiredResources;
    }
}
