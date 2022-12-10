/*
 *
 *  * Copyright (c) 2022  Bitshift D.O.O (http://bitshifted.co)
 *  *
 *  * This Source Code Form is subject to the terms of the Mozilla Public
 *  * License, v. 2.0. If a copy of the MPL was not distributed with this
 *  * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 *
 */

package co.bitshifted.appforge.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class LinuxApplicationInfo extends ApplicationInfoPlatform {

    private List<String> categories = new ArrayList<>();
    private Set<LinuxPackageType> packageTypes = new HashSet<>();

    public LinuxApplicationInfo() {
        super();
        supportedCpuArchitectures.add(CpuArch.X64);
        packageTypes.add(LinuxPackageType.DEB);
        packageTypes.add(LinuxPackageType.RPM);
        packageTypes.add(LinuxPackageType.TAR_GZ);
    }
}
