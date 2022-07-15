package co.bitshifted.ignite.common.dto;

import co.bitshifted.ignite.common.model.JavaVersion;
import co.bitshifted.ignite.common.model.JvmVendor;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

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

    private List<JavaDependencyDTO> dependencies;


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

    public void setDependencies(List<JavaDependencyDTO> dependencies) {
        this.dependencies = dependencies;
    }
}