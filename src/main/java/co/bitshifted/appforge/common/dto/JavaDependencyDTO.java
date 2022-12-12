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

import co.bitshifted.appforge.common.model.CpuArch;
import co.bitshifted.appforge.common.model.OperatingSystem;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class JavaDependencyDTO {

    private String groupId;
    private String artifactId;
    private String version;
    private String type;
    private String classifier;
    private String sha256;
    private long size;
    private boolean modular;
    private boolean platformSpecific;
    private OperatingSystem supportedOs;
    private CpuArch supportedCpuArch;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaDependencyDTO that = (JavaDependencyDTO) o;
        return groupId.equals(that.groupId) && artifactId.equals(that.artifactId) && version.equals(that.version) && Objects.equals(type, that.type) && Objects.equals(classifier, that.classifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, artifactId, version, type, classifier);
    }


}
