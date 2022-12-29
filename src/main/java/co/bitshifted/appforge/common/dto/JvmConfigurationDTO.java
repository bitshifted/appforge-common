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

import co.bitshifted.appforge.common.model.JavaVersion;
import co.bitshifted.appforge.common.model.JvmVendor;
import co.bitshifted.appforge.common.model.OperatingSystem;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Getter
@Setter
public class JvmConfigurationDTO {

    private JvmVendor vendor;
    @JsonProperty("major-version")
    private JavaVersion majorVersion;
    private String release;
    @JsonProperty("jvm-options")
    private String jvmOptions;
    @JsonProperty("system-properties")
    private String systemProperties;
    @JsonProperty("main-class")
    private String mainClass;
    private String jar;
    @JsonProperty("module-name")
    private String moduleName;
    @JsonProperty("add-modules")
    private String addModules;
    @JsonProperty("jlink-ignore-modules")
    private Set<String> jlinkIgnoreModules;
    private String arguments;

    private List<JavaDependencyDTO> dependencies = new ArrayList<>();

    // platform-specific configuration
    private JvmConfigurationDTO linuxConfig;
    private JvmConfigurationDTO macConfig;
    private JvmConfigurationDTO windowsConfig;


    public List<JavaDependencyDTO> collectDependencies(OperatingSystem os) {
        List<JavaDependencyDTO> allDeps = new ArrayList<>();
        allDeps.addAll(dependencies);
        switch (os) {
            case LINUX:
                allDeps.addAll(linuxConfig.dependencies);
                break;
            case MAC:
                allDeps.addAll(macConfig.dependencies);
                break;
            case WINDOWS:
                allDeps.addAll(windowsConfig.dependencies);
        }
        return  allDeps;
    }

    public List<JavaDependencyDTO> collectAllDependencies() {
        List<JavaDependencyDTO> allDeps = new ArrayList<>();
        allDeps.addAll(dependencies);
        allDeps.addAll(linuxConfig.dependencies);
        allDeps.addAll(macConfig.dependencies);
        allDeps.addAll(windowsConfig.dependencies);
        return allDeps;
    }

}
