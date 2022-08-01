package co.bitshifted.ignite.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class LinuxApplicationInfo extends ApplicationInfoPlatform {

    private List<String> categories = new ArrayList<>();

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
       this.categories = categories;
    }
}
