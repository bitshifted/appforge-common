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
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
public class ApplicationInfo {

    private WindowsApplicationInfo windows;
    private LinuxApplicationInfo linux;
    private MacApplicationInfo mac;

    @JsonProperty("splash-screen")
    private BasicResource splashScreen;
    private List<BasicResource> icons;
    private String name;
    private String headline;
    private String description;
    private BasicResource license;
    @JsonProperty("exe-name")
    private String exeName;
    @JsonProperty("supported-operating-systems")
    private Set<OperatingSystem> supportedOperatingSystems = new HashSet<>();

    private String homePageUrl;
    private String publisher;
    private String publisherEmail;

    public ApplicationInfo() {
        supportedOperatingSystems.add(OperatingSystem.LINUX);
        supportedOperatingSystems.add(OperatingSystem.MAC);
        supportedOperatingSystems.add(OperatingSystem.WINDOWS);
    }

    public String getExeName() {
        if(exeName == null && name != null) {
            return name.toLowerCase().replaceAll("\\s", "-");
        }
        return exeName;
    }

}
