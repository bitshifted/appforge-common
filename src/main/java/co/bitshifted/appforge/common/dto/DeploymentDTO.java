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

import co.bitshifted.appforge.common.model.ApplicationInfo;
import co.bitshifted.appforge.common.model.BasicResource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeploymentDTO {
    private String applicationId;
    @JsonProperty("application-info")
    private ApplicationInfo applicationInfo;
    @JsonProperty("jvm")
    private JvmConfigurationDTO jvmConfiguration;
    private String version;
    @JsonProperty("build-number")
    private String buildNumber;

    private List<BasicResource> resources = new ArrayList<>();

    public void addResources(List<BasicResource> res) {
        resources.addAll(res);
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public ApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    public void setJvmConfiguration(JvmConfigurationDTO jvmConfiguration) {
        this.jvmConfiguration = jvmConfiguration;
    }

    public JvmConfigurationDTO getJvmConfiguration() {
        return jvmConfiguration;
    }

    public List<BasicResource> getResources() {
        return resources;
    }

    public void setResources(List<BasicResource> resources) {
        this.resources = resources;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBuildNumber() {
        return buildNumber;
    }

    public void setBuildNumber(String buildNumber) {
        this.buildNumber = buildNumber;
    }
}
