package co.bitshifted.ignite.common.dto;

import co.bitshifted.ignite.common.model.BasicResource;
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
