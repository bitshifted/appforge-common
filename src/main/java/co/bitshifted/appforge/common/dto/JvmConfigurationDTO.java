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

import java.util.ArrayList;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class JvmConfigurationDTO {

    private JvmVendor vendor;
    @JsonProperty("major-version")
    private JavaVersion majorVersion;
    @JsonProperty("fixed-version")
    private String fixedVersion;
    @JsonProperty("jvm-options")
    private String jvmOptions;
    @JsonProperty("system-properties")
    private String systemProperties;
    @JsonProperty("main-class")
    private String mainClass;
    private String jar;
    @JsonProperty("module-name")
    private String moduleName;
    private String arguments;

    private List<JavaDependencyDTO> dependencies = new ArrayList<>();

    // platform-specific configuration
    private JvmConfigurationDTO linuxConfig;
    private JvmConfigurationDTO macConfig;
    private JvmConfigurationDTO windowsConfig;


    public JvmVendor getVendor() {
        return vendor;
    }

    public void setVendor(JvmVendor vendor) {
        this.vendor = vendor;
    }

    public JavaVersion getMajorVersion() {
        return majorVersion;
    }

    public void setMajorVersion(JavaVersion majorVersion) {
        this.majorVersion = majorVersion;
    }

    public String getFixedVersion() {
        return fixedVersion;
    }

    public void setFixedVersion(String fixedVersion) {
        this.fixedVersion = fixedVersion;
    }

    public String getJvmOptions() {
        return jvmOptions;
    }

    public void setJvmOptions(String jvmOptions) {
        this.jvmOptions = jvmOptions;
    }

    public String getSystemProperties() {
        return systemProperties;
    }

    public void setSystemProperties(String systemProperties) {
        this.systemProperties = systemProperties;
    }

    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public String getJar() {
        return jar;
    }

    public void setJar(String jar) {
        this.jar = jar;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getArguments() {
        return arguments;
    }

    public void setArguments(String arguments) {
        this.arguments = arguments;
    }

    public List<JavaDependencyDTO> getDependencies() {
       return dependencies;
    }

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

    public void setDependencies(List<JavaDependencyDTO> dependencies) {
        this.dependencies = dependencies;
    }

    public JvmConfigurationDTO getLinuxConfig() {
        return linuxConfig;
    }

    public void setLinuxConfig(JvmConfigurationDTO linuxConfig) {
        this.linuxConfig = linuxConfig;
    }

    public JvmConfigurationDTO getMacConfig() {
        return macConfig;
    }

    public void setMacConfig(JvmConfigurationDTO macConfig) {
        this.macConfig = macConfig;
    }

    public JvmConfigurationDTO getWindowsConfig() {
        return windowsConfig;
    }

    public void setWindowsConfig(JvmConfigurationDTO windowsConfig) {
        this.windowsConfig = windowsConfig;
    }
}
