/*
 *
 *  * Copyright (c) 2022  Bitshift D.O.O (http://bitshifted.co)
 *  *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package co.bitshifted.appforge.common.dto;

import co.bitshifted.appforge.common.model.DeploymentStatus;
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
