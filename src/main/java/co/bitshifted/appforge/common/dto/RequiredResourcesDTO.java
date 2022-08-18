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

import co.bitshifted.appforge.common.model.BasicResource;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class RequiredResourcesDTO {

    private List<JavaDependencyDTO> dependencies = new ArrayList<>();
    private List<BasicResource> resources = new ArrayList<>();

    public List<JavaDependencyDTO> getDependencies() {
        return dependencies;
    }

    public void setDependencies(List<JavaDependencyDTO> dependencies) {
        this.dependencies = dependencies;
    }

    public List<BasicResource> getResources() {
        return resources;
    }

    public void setResources(List<BasicResource> resources) {
        this.resources = resources;
    }
}
