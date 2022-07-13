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
}
