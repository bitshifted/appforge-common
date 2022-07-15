package co.bitshifted.ignite.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationInfo {

    private ApplicationInfo windows;
    private ApplicationInfo linux;
    private ApplicationInfo mac;

    @JsonProperty("splash-screen")
    private BasicResource splashScreen;
    private List<BasicResource> icons;
    private String name;
    private String headline;
    private String description;
    private BasicResource license;
    @JsonProperty("exe-name")
    private String exeName;

    public ApplicationInfo getWindows() {
        return windows;
    }

    public void setWindows(ApplicationInfo windows) {
        this.windows = windows;
    }

    public ApplicationInfo getLinux() {
        return linux;
    }

    public void setLinux(ApplicationInfo linux) {
        this.linux = linux;
    }

    public ApplicationInfo getMac() {
        return mac;
    }

    public void setMac(ApplicationInfo mac) {
        this.mac = mac;
    }

    public BasicResource getSplashScreen() {
        return splashScreen;
    }

    public void setSplashScreen(BasicResource splashScreen) {
        this.splashScreen = splashScreen;
    }

    public List<BasicResource> getIcons() {
        return icons;
    }

    public void setIcons(List<BasicResource> icons) {
        this.icons = icons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BasicResource getLicense() {
        return license;
    }

    public void setLicense(BasicResource license) {
        this.license = license;
    }

    public String getExeName() {
        if(exeName == null && name != null) {
            return name.toLowerCase().replaceAll("\\s", "-");
        }
        return exeName;
    }

    public void setExeName(String exeName) {
        this.exeName = exeName;
    }
}
